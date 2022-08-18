import java.util.*;

public class MaximumConsucativeZeroes {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int max=0;
      int count=0;
      for(int i=0;i<a.length;i++){
        if(a[i]==0){
          count++;
        }else{
          max=Math.max(count,max);
          count=0;
        }
      }
      System.out.println(max);
  }
}