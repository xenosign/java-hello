package tomAndHarry.dfs

import java.util.*

object TreeTravelKt {
    // BFS 구현 (큐를 사용)
    fun bfs(root: Node?) {
        if (root == null) return

        val queue: Queue<Node> = LinkedList()
        queue.add(root)

        while (!queue.isEmpty()) {
            val current = queue.poll()
            // 현재 노드 방문
            print(current.data.toString() + " ")

            // 모든 자식 노드를 큐에 추가
            for (child in current.children) {
                queue.add(child)
            }
        }
    }

    // DFS 구현 (재귀적 방법)
    fun dfs(root: Node?) {
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
        val root = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        val node5 = Node(5)
        val node6 = Node(6)
        val node7 = Node(7)
        val node8 = Node(8)
        val node9 = Node(9)
        val node10 = Node(10)
        val node11 = Node(11)

        // 트리 구조 구성
        root.addChild(node2)
        root.addChild(node3)

        node2.addChild(node4)
        node2.addChild(node5)

        node3.addChild(node6)
        node3.addChild(node7)

        node4.addChild(node8)
        node4.addChild(node9)

        node5.addChild(node10)
        node5.addChild(node11)

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
