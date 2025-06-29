public class varargs {

    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;  
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs");
        System.out.println("the sum of 2,3 is:"+sum(2,3));
        System.out.println("the sum of 2,3 and 5 is:"+sum(2,3,5));
        System.out.println("the sum of 2,3,5 and 9 is:"+sum(2,3,5,9));
    }
}

