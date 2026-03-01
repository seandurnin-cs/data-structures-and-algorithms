import java.util.Scanner;

class Node {
    int data;
    Node leftChild, rightChild;

    Node(int data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}

public class BinaryTree {
    Node root;

    // Add Node in Recursive
    public void addNode(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.leftChild = addRecursive(current.leftChild, data);
        } else if (data > current.data) {
            current.rightChild = addRecursive(current.rightChild, data);
        }
        return current;
    }

    public int getHeight(Node node) {
        if (node == null)
            return 0;
        int leftH = getHeight(node.leftChild);
        int rightH = getHeight(node.rightChild);
        return 1 + Math.max(leftH, rightH);
    }

    public boolean isAVLTree(Node root) {
        if(Math.abs(getHeight(root.leftChild) - getHeight(root.rightChild)) <= 1)
        {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            tree.addNode(data);
        }
        sc.close();

        boolean flag = tree.isAVLTree(tree.root);
        System.out.println("Is it AVL Tree? " + flag);
    }
}