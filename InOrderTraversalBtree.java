import java.util.*;

class Node{
  int val; 
  Node right;
  Node left;

  Node(int val){
    this.val = val;
    
  }
  Node(int val, Node left, Node right) {
    this.val= val;
    this.left = left;
    this.right = right;
}
}

public class inordertraversal {

  public static void inOrder(Node root,  List<Integer> arr){
    if(root==null) return;

    inOrder(root.left, arr);
    arr.add(root.val);
    inOrder(root.right , arr);
  }

  public static List<Integer> inOrder(Node root){
    List<Integer> arr= new ArrayList<>();
    inOrder(root, arr);
    return arr;
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right= new Node(4);
    root.left.left= new Node(5);
    root.left.right = new Node(9);
   
    List<Integer> result = inOrder(root);

    System.out.println("Inorder traversal:");

    for(int val: result){
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
