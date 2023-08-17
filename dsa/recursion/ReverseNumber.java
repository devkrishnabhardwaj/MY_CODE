class ReverseNumber {
    public static void main(String args[]) {
        int n = 1234;
        System.out.print("Reverse of " + n + " is ");
        rev(n);
        System.out.println();
        System.out.println("Reverse of " + n + " using rev2 is " + Rev(n));
        System.out.println("Reverse of " + n + " using rev3 is " + Rev(n));

    }

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        rev(n / 10);
    }

    static int Rev(int n) {
        return Rev(n, 0);
    }

    static int Rev(int n, int s) {
        if (n == 0) {
            return s;
        }
        s = s * 10 + n % 10;
        s = Rev(n / 10, s);
        return s;
    }
    static int placeValue(int n){
        if(n<10){
            return 1;
        }
        else{
            return 10*placeValue(n/10);
        }
    }
    static int rev3(int n){
        if(n<10){
            return n;
        }
        else{
            return placeValue(n)*n%10 + rev3(n/10);
        }
    }
}
