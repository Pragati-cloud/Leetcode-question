package Graph;
import java.util.*;


public class GraphDSA {
  public static void main(String[] args){
    int n = 3, m =3;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i=0;i<=n;i++)
      adj.add(new ArrayList<Integer>());

    adj.get(0).add(1);
    adj.get(1).add(0);

    adj.get(1).add(2);
    adj.get(2).add(1);

    adj.get(2).add(3);
    adj.get(3).add(2);
    
    for(int i=0;i<=n;i++){
      System.out.print(i+"->");
      for(Integer it: adj.get(i)){
        System.out.print(it+" ");
      }
      System.out.println();
    }
  }
}
