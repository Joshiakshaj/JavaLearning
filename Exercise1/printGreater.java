//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class QueThree{
    public static int printGreater(int a, int b){
        
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(printGreater(a, b));
        
    }
}
