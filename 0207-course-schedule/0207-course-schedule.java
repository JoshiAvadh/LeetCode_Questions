class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];

            adjList.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int processed = 0;
        while(!queue.isEmpty()) {
            int current = queue.remove();
            processed++;

            for(int neighbor : adjList.get(current)){
                inDegree[neighbor]--;

                if(inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        return processed == numCourses;
    }

}