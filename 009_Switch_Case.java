import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become an adult");
                break;
            case 23:
                System.out.println("you are goin to join a job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("enjoy your life!");
        }
        System.out.println("Thank You(:");
    }
}

