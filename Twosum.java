import java.util.Scanner;
import java.util.*;

public class TwoSum {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n (no. of element in array)");
    int n = sc.nextInt();
    System.out.println("Enter value of target");
    int target = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter value of array elements");
    for(int i =0;i<n;i++){
      
      nums[i]=sc.nextInt();
      System.out.println("Now next");

    }
    int[] res= twosum(nums,target);
  System.out.println(res[0]+" "+res[1]);
  }
  
  static int[] twosum(int[] nums,int target){
    Map<Integer,Integer>mp = new HashMap<>();

    for(int i =0;i<nums.length;i++){
      int rem = target- nums[i];
      if(mp.containsKey(rem))
        return new int[]{mp.get(rem),i};
      mp.put(nums[i],i);
    }
    return new int[]{};
  }

}
