public class Exponentiation {
    static float pow(float n,int p){
        if(p == 0){
            return 1;
        }
        else {
            return n*pow(n,p-1);
        }
    }
    public static void main(String args[]){
        float n = 2.0f;
        int p = 5;
        System.out.println(pow(n,p));
    }
}
