import java.util.*;
public class recursion {
    
  public static int fact(int n){
    if(n==0){
        return 1;
    }
    int smalloutput=fact(n-1);
    int finaloutput=n*smalloutput;
    return finaloutput;

  };
  public static int sumn(int n){
    if(n==1){
        return 1;
    }
    int smallsum=sumn(n-1);
    int finalsum=n+smallsum;
    return finalsum;
  }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.print("sum "+n+" is "+sumn(n));
    }
}
