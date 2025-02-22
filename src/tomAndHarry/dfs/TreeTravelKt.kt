package tomAndHarry.dfs

import java.util.*

object TreeTravelKt {
    // BFS 구현 (큐를 사용)
    fun bfs(root: NodeKt?) {
        if (root == null) return

        val queue: Queue<NodeKt> = LinkedList()
        queue.add(root)

        while (!queue.isEmpty()) {
            val current = queue.poll()
            // Java 필드에 맞게 접근 방식 수정
            print(current.data.toString() + " ")

            // Java List를 Kotlin에서 사용
            for (child in current.children) {
                queue.add(child)
            }
        }
    }

    // DFS 구현 (재귀적 방법)
    fun dfs(root: NodeKt?) {
        if (root == null) return

        // 현재 노드 방문
        print(root.data.toString() + " ")

        // 모든 자식 노드에 대해 재귀적으로 DFS 수행
        for (child in root.children) {
            dfs(child)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // 트리 생성
        val root = NodeKt(1)
        val nodeKt2 = NodeKt(2)
        val nodeKt3 = NodeKt(3)
        val nodeKt4 = NodeKt(4)
        val nodeKt5 = NodeKt(5)
        val nodeKt6 = NodeKt(6)
        val nodeKt7 = NodeKt(7)
        val nodeKt8 = NodeKt(8)
        val nodeKt9 = NodeKt(9)
        val nodeKt10 = NodeKt(10)
        val nodeKt11 = NodeKt(11)

        // 트리 구조 구성
        root.addChild(nodeKt2)
        root.addChild(nodeKt3)

        nodeKt2.addChild(nodeKt4)
        nodeKt2.addChild(nodeKt5)

        nodeKt3.addChild(nodeKt6)
        nodeKt3.addChild(nodeKt7)

        nodeKt4.addChild(nodeKt8)
        nodeKt4.addChild(nodeKt9)

        nodeKt5.addChild(nodeKt10)
        nodeKt5.addChild(nodeKt11)

        /*
        생성된 트리 구조:
                 1
              /     \
             2        3
           /   \    /   \
          4     5  6     7
         / \   / \
        8   9 10  11
        
        예상 출력:
        DFS: 1-2-4-8-9-5-10-11-3-6-7
        BFS: 1-2-3-4-5-6-7-8-9-10-11
        */

        // DFS 수행
        println("DFS 순회 결과:")
        dfs(root)
        println()

        // BFS 수행
        println("BFS 순회 결과:")
        bfs(root)
        println()
    }
}
