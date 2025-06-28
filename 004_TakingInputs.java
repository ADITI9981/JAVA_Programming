import java.util.Scanner;

public class CHW_05_TakingInputs {
    public static void main(String[] args){
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 1");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);
        String str = sc.next();
        System.out.println(str);
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
