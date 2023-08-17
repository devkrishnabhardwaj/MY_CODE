import java.util.Scanner;
class NumberToWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt(); 
        System.out.println(numToWord(n));
        sc.close();
    }
    static String numToWord(int n){
        return numToWord(n,1);
    }
    static String numToWord(int n,int pv){ // pv is place value
        String s = "";
        if(n==0){
            return "";
        }
        else if(pv<=2){
            s = toWord(n%100);
            return numToWord(n/100,pv+2)+s;
        }
        else if(pv==3){
            s = toWord(n%10)+ ((n%10==0)?"":"Hundred ");
            return numToWord(n/10,pv+1)+s;
        }
        else if(pv<=5){
            s = toWord(n%100)+((n%100==0)?"":"Thousand ");
            return numToWord(n/100,pv+2)+s;
        }
        else if(pv<=7){
            s = toWord(n%100)+((n%100==0)?"":"Lakh ");
            return numToWord(n/100,pv+2)+s;
        }
        else if(pv<=9){
            s = toWord(n%100)+((n%100==0)?"":"Crore ");
            return numToWord(n/100,pv+2)+s;
        }
        else{
            return "";
        }
    }
    static String toWord(int n){
        int temp = n%100;
        int a = temp/10;
        int b = temp%10;
        String s="";
        if(a==0){
            switch (b){
                case 1: s = "One "; break;
                case 2: s = "Two "; break;
                case 3: s = "Three "; break;
                case 4: s = "Four "; break;
                case 5: s = "Five "; break;
                case 6: s = "Six "; break;
                case 7: s = "seven "; break;
                case 8: s = "Eight "; break;
                case 9: s = "Nine "; break;
            }
        }
        else if(a==1){
            switch (b){
                case 0: s = "Ten "; break;
                case 1: s = "Eleven "; break;
                case 2: s = "Twelve "; break;
                case 3: s = "Thirteen "; break;
                case 4: s = "Fourteen "; break;
                case 5: s = "Fifteen "; break;
                case 6: s = "Sixteen "; break;
                case 7: s = "seventeen "; break;
                case 8: s = "Eighteen "; break;
                case 9: s = "Nineteen "; break;
            }
        }
        else if(a==2){
           s = "Twenty "+toWord(b);
        }
        else if(a==3){
            s = "Thirty "+toWord(b);
        }
        else if(a==4){
            s = "Forty "+toWord(b);
        }
        else if(a==5){
            s = "Fifty "+toWord(b);
        }
        else if(a==8){
            s = "Eighty "+toWord(b);
        }
        else{
            s = toWord(a)+"\bty "+toWord(b);
        }
        return s;
    }
}