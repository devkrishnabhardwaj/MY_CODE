import java.util.Scanner;
public class TotalNumbersLessThanNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fun(n));
    }
    static int fun(int n){
        int i;
        System.out.print("Enter number : ");
        i = sc.nextInt();
        // sc.close();
        if(i==0){
            return 0;
        }
        else if(i<n){
            return 1 + fun(n);
        }
        else{
            return fun(n);
        }       
    }   
}
