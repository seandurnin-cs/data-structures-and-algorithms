public class BinaryTree {
    Node root;

    public void addNode(int data) {
        // Task 1 - Fill in this method
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;

        while (true) {
            if (data < current.data) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    return;
                } else {
                    current = current.leftChild;
                }
            } else if (data > current.data) {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    return;
                } else {
                    current = current.rightChild;
                }
            } else {
                return;
            }
        }
    }

    public int getHeight(Node node) {
        // Task 2 – Calculate the height of binary tree
        if(node == null) return 0;
        int leftH = getHeight(node.leftChild);
        int rightH = getHeight(node.rightChild);
        return 1 + Math.max(leftH, rightH);
    }

    public void traverseInorder(Node localRoot) {
        // Task 3 – Traverse and print the Binary Tree inorder
        if(localRoot == null) return;
        traverseInorder(localRoot.leftChild);
        System.out.print(localRoot.data + " ");
        traverseInorder(localRoot.rightChild);
    }

    public void traversePreorder(Node localRoot) {
        // Task 4 – Traverse and print the Binary Tree preorder
        if(localRoot == null) return;
        System.out.print(localRoot.data + " ");
        traversePreorder(localRoot.leftChild);
        traversePreorder(localRoot.rightChild);
    }
}