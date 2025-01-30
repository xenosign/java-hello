package tomAndHarry.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class DFSFundamental {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        };
        boolean[] visited = new boolean[4];

        // DFS 호출
        System.out.println("DFS");
        dfs(graph, visited, 0);
        System.out.println("");


        // BFS 호출 (새로운 visited 배열 필요)
        System.out.println("BFS");
        visited = new boolean[4];
        bfs(graph, visited, 0);
    }

    public static void dfs(int[][] graph, boolean[] visited, int start) {
        // 현재 노드 방문 처리
        visited[start] = true;
        System.out.print(start + " ");

        // 인접한 노드 탐색
        for (int i = 0; i < graph[start].length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    // BFS 구현 - 큐 사용
    public static void bfs(int[][] graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int i = 0; i < graph[v].length; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
