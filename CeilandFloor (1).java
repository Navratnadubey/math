import java.util.*;

public class CeilandFloor {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      float n=input.nextFloat();
      double x=Math.floor(n);
      double a=Math.ceil(n);
      System.out.println("Floor is :"+x);
      System.out.println("Ceil is :"+a);
  }
}