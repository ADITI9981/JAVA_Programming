public class break_And_Continue {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}

