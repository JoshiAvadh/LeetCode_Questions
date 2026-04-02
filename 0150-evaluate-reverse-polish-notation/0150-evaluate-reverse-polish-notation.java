class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int top1 = s.pop();
                int top2 = s.pop();
                s.push(top1 + top2);
            } else if (tokens[i].equals("-")) {
                int top1 = s.pop();
                int top2 = s.pop();

                s.push(top2 - top1);
            } else if (tokens[i].equals("*")) {
                int top1 = s.pop();
                int top2 = s.pop();

                s.push(top2 * top1);
            } else if (tokens[i].equals("/")) {
                int top1 = s.pop();
                int top2 = s.pop();

                s.push(top2 / top1);
            } else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}