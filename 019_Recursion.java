public class recursion {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n=9;
        int fact = factorial(n);
        System.out.println("the factorial of n is:"+fact);
    }
}

