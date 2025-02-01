package tomAndHarry.dfs;

import java.util.*;

// 트리의 노드를 정의하는 클래스
class Node {
    int data;
    List<Node> children;

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        children.add(child);
    }
}

public class TreeTraver {
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

    // BFS 구현 (큐를 사용)
    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            // 현재 노드 방문
            System.out.print(current.data + " ");

            // 모든 자식 노드를 큐에 추가
            for (Node child : current.children) {
                queue.offer(child);
            }
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

        // 트리 구조 구성
        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);

        node2.addChild(node5);
        node2.addChild(node6);

        node4.addChild(node7);

        /*
        생성된 트리 구조:
                1
              / | \
             2  3  4
            / \     \
           5   6     7
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
