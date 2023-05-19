package br.com.luislabs.dataStructure.tree

class BinaryTree<T> {
    var root: Node<T>? = null

    fun symmetricTraversal(node: Node<T>?) {
        if (node == null) {
            return
        }

        print("(")
        symmetricTraversal(node.left)
        print(node)
        symmetricTraversal(node.right)
        print(")")
    }
}