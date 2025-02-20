import java.util.*;

class Node{
  int val;
  Node left;
  Node right;

  Node(int val){
    this.val= val;
  }
  Node(int val, Node left, Node right){
    this.val= val;
    this.left = left;
    this.right = right;
  }
}

public class postOrder {
  public static void postOrder(Node root, List<Integer> arr ){
      if(root== null) return;

      postOrder(root.right, arr);
      postOrder(root.left, arr);
      arr.add(root.val);
  }
  public static List<Integer> postOrder(Node root){
     List<Integer> arr= new ArrayList<>();
     postOrder(root, arr);
     return arr;
  }
  public static void main(String[] args) {
    Node root= new Node(3);
    root.left = new Node(5);
    root.right = new Node(11);
    root.left.left = new Node(7);
    root.left.right = new Node(13);

    List<Integer> result = postOrder(root);
    System.out.println("postorder :");

    for(int val:result){
      System.out.print(val +" ");
    }
    System.out.println();
  }
}
