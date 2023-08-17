public class DivisiblityBy_9_11 {
    public static void main(String args[]){
        int a = 121;
        div9(a);
        div11(a);
    }    
    static void div9(int n){
        if(n==9){
            System.out.println("Divisible by nine");
            return;
        }
        else if(n<9){
            System.out.println("Not Divisible by nine");
        }
        else{
            int s = 0;
            while(n>0){
                s += n%10;
                n /=10;
            }
            div9(s);
        }
    }
    static void div11(int n){
        if(n==0){
            System.out.println("Divisible by 11");
        }
        else if(n<=9){
            System.out.println("Not Divisible by 11");
        }
        else{
            int o=0,e=0;
            for(int i=0;n>0;i++){
                int temp = n%10;
                if(i%2==0){
                    e += temp; 
                }
                else{
                    o += temp;
                }
                n /=10;
            }
                    // we can replace for loop with this while loop
            // while(n>0){
            //     e += n%10;
            //     n /=10;
            //     o += n%10;
            //     n /=10;
            // }
            int diff = (o>e)?(o-e):(e-o);
            div11(diff);
        }
    }
}
