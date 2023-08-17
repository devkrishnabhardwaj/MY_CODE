public class DisplaySumSeries {
    static int sum(int n){
        if(n==0){
            return(0);
        }
        else{
            int s;
            s = sum(n-1);
            System.out.print(n+" + ");
            return(n+s);
        }
    }
    public static void main(String args[]){
        int n = 15;
        int s = sum(n);
        System.out.println("\b\b= "+s);
    }
}
