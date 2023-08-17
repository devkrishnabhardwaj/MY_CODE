import java.util.Scanner;
class SumOfDigits {
    static int sum(long n){
        if(n==0){
            return (int)n;
        }
        else {
            return (int)(n%10 + sum(n/10));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n;
        System.out.print("Enter any number :");
        n = sc.nextLong();
        System.out.println("Sum of digits of "+n+" is "+sum(n));
        sc.close();
    }
}