class MultiplyByRussianMethod{
    public static void main(String args[]){
        int a,b;
        a = 19;
        b = 25;
        System.out.println(a+" * "+b+" = "+a*b);
        System.out.println(a+" * "+b+" = "+multi(b,a));
    }
    static int multi(int a,int b){
        if(a==1){
            return b;
        }
        // int c = (a%2==0)?0:b;
        // a = (int)Math.floor(a/2);
        // b *=2;
        // return c + multi(a,b); 
        return multi((int)Math.floor(a/2),b*2)+((a%2==0)?0:b);
    }
}