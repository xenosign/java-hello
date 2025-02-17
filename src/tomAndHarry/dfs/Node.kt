package tomAndHarry.dfs

class Node(val data: Int) {
    val children: MutableList<Node> = mutableListOf()

    fun addChild(child: Node) {
        children.add(child)
    }
}