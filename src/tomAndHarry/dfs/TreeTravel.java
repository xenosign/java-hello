package tomAndHarry.dfs;

import java.util.*;

public class TreeTravel {
    // BFS 구현 (큐를 사용)
    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            // 현재 노드 방문
            System.out.print(current.data + " ");

            // 모든 자식 노드를 큐에 추가
            for (Node child : current.children) {
                queue.add(child);
            }
        }
    }

    // DFS 구현 (재귀적 방법)
    public static void dfs(Node root) {
        if (root == null) return;

        // 현재 노드 방문
        System.out.print(root.data + " ");

        // 모든 자식 노드에 대해 재귀적으로 DFS 수행
        for (Node child : root.children) {
            dfs(child);
        }
    }

    public static void main(String[] args) {
        // 트리 생성
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);

        // 트리 구조 구성
        root.addChild(node2);
        root.addChild(node3);

        node2.addChild(node4);
        node2.addChild(node5);

        node3.addChild(node6);
        node3.addChild(node7);

        node4.addChild(node8);
        node4.addChild(node9);

        node5.addChild(node10);
        node5.addChild(node11);

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
        System.out.println("DFS 순회 결과:");
        dfs(root);
        System.out.println();

        // BFS 수행
        System.out.println("BFS 순회 결과:");
        bfs(root);
        System.out.println();
    }
}
