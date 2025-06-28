import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int [] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.printf("Enter the marks %d :",i);
            marks[i]=sc.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }
}

