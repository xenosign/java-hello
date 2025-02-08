package tomAndHarry.dfs

import java.util.*

object MazeSolver2 {
    var N: Int = 4 // 4x4 미로 크기 설정
    var maze: Array<IntArray> = arrayOf(
        intArrayOf(1, 0, 1, 1),
        intArrayOf(1, 1, 1, 0),
        intArrayOf(0, 0, 1, 0),
        intArrayOf(1, 1, 1, 1)
    ) // 1은 이동 가능한 길, 0은 이동할 수 없는 벽을 의미

    // 이동 방향: 상(위), 우(오른쪽), 하(아래), 좌(왼쪽) 순서로 탐색
    var dx: IntArray = intArrayOf(-1, 0, 1, 0)
    var dy: IntArray = intArrayOf(0, 1, 0, -1)

    @JvmStatic
    fun main(args: Array<String>) {
        println("DFS로 미로 찾기:")
        val visited = Array(N) { BooleanArray(N) }
        val dfsResult = if (dfs(0, 0, visited)) "미로 탈출 성공" else "미로 탈출 실패"
        println(dfsResult)

        println("\nBFS로 미로 찾기:")
        val bfsResult = if (bfs(0, 0)) "미로 탈출 성공" else "미로 탈출 실패"
        println(bfsResult)
    }

    // DFS(깊이 우선 탐색) 구현 - 재귀적으로 미로를 탐색하는 방식
    fun dfs(x: Int, y: Int, visited: Array<BooleanArray>): Boolean {
        // 목적지 도달 - 미로의 우측 하단에 도착했는지 확인
        if (x == N - 1 && y == N - 1) {
            println("도착!")
            return true
        }

        visited[x][y] = true // 현재 위치를 방문 처리
        println("현재 위치: ($x,$y)")

        // 네 방향(상우하좌)을 순서대로 탐색
        for (i in 0..3) {
            val nx = x + dx[i] // 다음 x좌표 계산
            val ny = y + dy[i] // 다음 y좌표 계산

            // 미로 범위 내이고, 방문하지 않았고, 이동 가능한 칸인 경우에만 이동
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && visited[nx][ny] == false && maze[nx][ny] == 1) {
                if (dfs(nx, ny, visited)) {
                    return true // 목적지를 찾으면 true 반환하며 종료
                }
            }
        }
        return false // 모든 방향을 탐색해도 목적지를 찾지 못한 경우
    }

    // BFS(너비 우선 탐색) 구현 - 큐를 사용하여 미로를 탐색하는 방식
    fun bfs(startX: Int, startY: Int): Boolean {
        // BFS 구현을 위한 큐 생성 - 각 칸의 좌표를 [x,y] 배열로 저장하는 큐
        val queue: Queue<IntArray> = LinkedList()
        // 방문 여부를 체크하기 위한 2차원 배열 - 초기값은 모두 false
        val visited = Array(N) { BooleanArray(N) }

        // 시작 위치를 큐에 추가하고 방문 처리 - 탐색 시작점 설정
        queue.add(intArrayOf(startX, startY)) // 시작점 좌표를 큐에 넣음
        visited[startX][startY] = true // 시작점을 방문 처리하여 재방문 방지

        // 큐가 빌 때까지 반복 (더 이상 탐색할 위치가 없을 때까지 계속)
        while (!queue.isEmpty()) {
            // 큐에서 현재 탐색할 위치를 꺼내서 처리
            val current = queue.poll() // 큐의 맨 앞에서 좌표 하나를 꺼냄
            val x = current[0] // 현재 x 좌표 추출
            val y = current[1] // 현재 y 좌표 추출

            // 현재 위치 출력 (디버깅/탐색 과정 확인용)
            println("현재 위치: ($x,$y)")

            // 현재 위치가 도착점(우측 하단)인지 확인
            if (x == N - 1 && y == N - 1) {
                println("도착!")
                return true // 목적지 도달 시 true 반환하고 종료
            }

            // 현재 위치에서 상하좌우 네 방향을 순서대로 확인
            for (i in 0..3) {
                // dx, dy 배열을 사용해 다음 탐색할 좌표 계산 - 상하좌우 이동
                val nx = x + dx[i] // 다음 x 좌표 = 현재 x + 이동할 x 거리
                val ny = y + dy[i] // 다음 y 좌표 = 현재 y + 이동할 y 거리

                // 다음 위치가 유효한지 3가지 조건으로 확인:
                // 1. 미로 범위 내에 있는지 (nx >= 0 && nx < N && ny >= 0 && ny < N) - 배열 범위 체크
                // 2. 아직 방문하지 않았는지 (visited[nx][ny] == false) - 중복 방문 방지
                // 3. 이동 가능한 칸인지 (maze[nx][ny] == 1) - 벽이 아닌 통로인지 확인
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && visited[nx][ny] == false && maze[nx][ny] == 1) {
                    queue.offer(intArrayOf(nx, ny)) // 다음 위치를 큐에 추가하여 나중에 탐색
                    visited[nx][ny] = true // 다음 위치를 방문 처리하여 중복 방문 방지
                }
            }
        }
        // 모든 가능한 경로를 탐색했지만 도착점에 도달하지 못한 경우 실패 반환
        return false
    }
}