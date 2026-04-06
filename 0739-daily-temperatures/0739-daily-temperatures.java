class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<int[]> s = new Stack<>();

        for(int i = 0; i < answer.length; i++) {
            while(!s.isEmpty() && temperatures[i] > s.peek()[0]) {
                int[] pair = s.pop();
                answer[pair[1]] = i - pair[1];
            }
            s.push(new int[]{temperatures[i], i});
        }
        return answer;
    }
}