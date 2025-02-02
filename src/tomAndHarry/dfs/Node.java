package tomAndHarry.dfs;

import java.util.ArrayList;
import java.util.List;

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
