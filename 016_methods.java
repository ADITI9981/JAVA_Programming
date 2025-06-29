public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else{
            z= (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c = logic(a,b);
        int a1=9;
        int b1=6;
        int c1 = logic(a1,b1);
        System.out.printf("c: %d",c);
        System.out.println("");
        System.out.printf("c1: %d",c1);
    }

}

