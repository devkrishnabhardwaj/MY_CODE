class SumOfNumbers{
    static int sumOf(int n){
        if(n==1){
            return(1);
        }
        else{
            return(n+sumOf(n-1));
        }
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println("sum of 1 to "+n+" is "+sumOf(n));
    }
}
