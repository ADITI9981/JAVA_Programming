import java.util.Scanner;
public class Calculate_Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics: ");
        float phy = sc.nextFloat();
        System.out.println("Enter marks of math: ");
        float math = sc.nextFloat();
        System.out.println("Enter marks of chemistry: ");
        float chem = sc.nextFloat();
        System.out.println("Enter marks of biology: ");
        float bio = sc.nextFloat();
        System.out.println("Enter marks of english: ");
        float eng = sc.nextFloat();

        double total = math+phy+chem+bio+eng;
        double p = total/500;
        double percentage = p*100;
        System.out.println("Percentage is :"+percentage+"%");
    }
}
