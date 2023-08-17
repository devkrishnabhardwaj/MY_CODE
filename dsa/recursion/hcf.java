public class hcf {
    public static void main(String args[]){
        int a,b;
        a = 99;
        b = 55;
        System.out.println(gsd(a,b));
    }
    static int gsd(int a,int b){
        if(b==0){
            return a;
        }
        else {
            return gsd(b,a%b);
        }
   }
}
