import java.util.Scanner;

public class bstMethods {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            tree.addNode(data);
        }
        sc.close();

        int height = tree.getHeight(tree.root);
        System.out.println("The height of the binary tree is: " + height);
        System.out.println("Inorder traversal of the binary tree:");
        tree.traverseInorder(tree.root);
        System.out.println();
        System.out.println("Preorder traversal of the binary tree:");
        tree.traversePreorder(tree.root);
        System.out.println();
    }
}