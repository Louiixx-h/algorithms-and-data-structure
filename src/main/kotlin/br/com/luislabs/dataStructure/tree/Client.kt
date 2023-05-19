package br.com.luislabs.dataStructure.tree

//       '*'
//       / \
//    'a'  '/'
//         /  \
//       'b'  'c'

fun main() {
    val binaryTree = BinaryTree<String>()

    val node1 = Node("3")
    val node2 = Node("*")
    val node3 = Node("/")
    val node4 = Node("25")
    val node5 = Node("5")

    node2.left = node1
    node2.right = node3
    node3.left = node4
    node3.right = node5

    binaryTree.root = node2

    binaryTree.symmetricTraversal(binaryTree.root)
}