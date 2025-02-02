package tomAndHarry.dfs;

import java.util.*;

public class MazeSolver {
    static int N = 4; // 4x4 미로
    static int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 0},
            {0, 0, 1, 0},
            {1, 1, 1, 1}
    }; // 1은 이동 가능, 0은 벽

    // 이동 방향: 상, 우, 하, 좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        System.out.println("DFS로 미로 찾기:");
        boolean[][] visited = new boolean[N][N];
        String dfsResult = dfs(0, 0, visited) ? "미로 탈출 성공" : "미로 탈출 실패";
        System.out.println(dfsResult);

        System.out.println("\nBFS로 미로 찾기:");
        String bfsResult = bfs(0, 0) ? "미로 탈출 성공" : "미로 탈출 실패";
        System.out.println(bfsResult);
    }

    // DFS 구현
    static boolean dfs(int x, int y, boolean[][] visited) {
        // 목적지 도달
        if (x == N - 1 && y == N - 1) {
            System.out.println("도착!");
            return true;
        }

        visited[x][y] = true;
        System.out.println("현재 위치: (" + x + "," + y + ")");

        // 네 방향 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 미로 범위 내이고, 방문하지 않았고, 이동 가능한 칸인 경우
            if (nx >= 0 && nx < N && ny >= 0 && ny < N
                    && visited[nx][ny] == false && maze[nx][ny] == 1) {
                if (dfs(nx, ny, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // BFS 구현
    static boolean bfs(int startX, int startY) {
        // BFS 구현을 위한 큐 생성 - 각 칸의 좌표를 [x,y] 배열로 저장
        Queue<int[]> queue = new LinkedList<>();
        // 방문 여부를 체크하기 위한 2차원 배열 - false로 초기화됨
        boolean[][] visited = new boolean[N][N];

        // 시작 위치를 큐에 추가하고 방문 처리
        queue.add(new int[]{startX, startY});  // 시작점 좌표를 큐에 넣음
        visited[startX][startY] = true;  // 시작점을 방문 처리

        // 큐가 빌 때까지 반복 (더 이상 탐색할 위치가 없을 때까지)
        while (!queue.isEmpty()) {
            // 큐에서 현재 탐색할 위치를 꺼냄
            int[] current = queue.poll();  // 큐의 맨 앞에서 좌표 하나를 꺼냄
            int x = current[0];  // 현재 x 좌표
            int y = current[1];  // 현재 y 좌표

            // 현재 위치 출력 (디버깅/확인용)
            System.out.println("현재 위치: (" + x + "," + y + ")");

            // 현재 위치가 도착점인지 확인
            if (x == N - 1 && y == N - 1) {
                System.out.println("도착!");
                return true;  // 목적지 도달 시 true 반환
            }

            // 현재 위치에서 상하좌우 네 방향을 확인
            for (int i = 0; i < 4; i++) {
                // dx, dy 배열을 사용해 다음 탐색할 좌표 계산
                int nx = x + dx[i];  // 다음 x 좌표 = 현재 x + 이동할 x 거리
                int ny = y + dy[i];  // 다음 y 좌표 = 현재 y + 이동할 y 거리

                // 다음 위치가 유효한지 확인:
                // 1. 미로 범위 내에 있는지 (nx >= 0 && nx < N && ny >= 0 && ny < N)
                // 2. 아직 방문하지 않았는지 (!visited[nx][ny])
                // 3. 이동 가능한 칸인지 (maze[nx][ny] == 1)
                if (nx >= 0 && nx < N && ny >= 0 && ny < N
                        && visited[nx][ny] == false && maze[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});  // 다음 위치를 큐에 추가
                    visited[nx][ny] = true;  // 다음 위치를 방문 처리
                }
            }
        }
        // 모든 가능한 경로를 탐색했지만 도착점에 도달하지 못한 경우
        return false;
    }
}