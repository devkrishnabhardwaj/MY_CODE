public class PrimeFactor {
    public static void main(String args[]) {
        int a = 45;
        System.out.println("Prime factors of " + a + " are :");
        pf(a);
    }

    static void pf(int n) {
        if(n==1){
            return;
        }
        int temp=n;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                temp = i;
                break;
            }
        }
        System.out.println(temp);
        pf((int)(n/temp));
    }
}
