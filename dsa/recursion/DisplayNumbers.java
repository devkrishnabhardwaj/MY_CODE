class DisplayNumbers{
    static void disp1(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+" ");
            disp1(n-1);
        }
    }
    static void disp2(int n){
        if(n==0){
            return;
        }
        else{
            disp2(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        int n = 11;
        System.out.println("display 1");
        disp1(n);
        System.out.println("\ndisplay 2");
        disp2(n);
        System.out.println();
    }
}
