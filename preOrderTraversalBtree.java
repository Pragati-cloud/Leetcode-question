import java.util.*;

class Node {
  int val;
  Node right;
  Node left;

  Node(int val) {
    this.val = val;

  }

  Node(int val, Node left, Node right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class preOrder {

  public static void preOrder(Node root, List<Integer> arr) {
    if (root == null)
      return;

    
    arr.add(root.val);
    preOrder(root.left, arr);
    preOrder(root.right, arr);
  }

  public static List<Integer> preOrder(Node root) {
    List<Integer> arr = new ArrayList<>();
    preOrder(root, arr);
    return arr;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(4);
    root.left.left = new Node(5);
    root.left.right = new Node(9);

    List<Integer> result = preOrder(root);

    System.out.println("preOrder traversal:");

    for (int val : result) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
