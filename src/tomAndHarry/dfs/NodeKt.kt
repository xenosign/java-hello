package tomAndHarry.dfs

class NodeKt(val data: Int) {
    val children: MutableList<NodeKt> = mutableListOf()

    fun addChild(child: NodeKt) {
        children.add(child)
    }
}