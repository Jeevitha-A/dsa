import java.util.*;
class Main
{
    public static void main(String args[])
    {
       Scanner sc =new Scanner (System.in);
       int n = sc .nextInt();
       int digit = n % 10;
       if(digit%2==0){
           System.out.println(1);
       }
       else{
           System.out.println(0);
       }
    }
}
