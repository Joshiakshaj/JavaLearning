import java.util.Scanner;

public class agecondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter age:");
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("Adult");
        }

        else {
            System.out.println("Not adult");
        }
        sc.close();

    }
    
}