import java.util.*;
class Factorial{
    public static int fact(int n){
        if(n==0)
        return(1);
        else
        return(n*fact(n-1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any number :");
        n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
        sc.close();
    }
}