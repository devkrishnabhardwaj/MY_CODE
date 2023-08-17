public class BaseConversion {
    static void convert(int n, int base){
        if(n == 0){
            return;
        }
        else {
            convert(n/base,base);
            System.out.print(n%base);
        }
    }
    public static void main(String args[]){
        int n = 10;
        int base = 2; // base <= 10
        convert(n,base);
        System.out.println();
    }
}
