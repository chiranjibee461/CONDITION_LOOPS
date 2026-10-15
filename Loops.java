import java.util.Scanner;
public class Loops {
    static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//        print the number form 1 to 5
    /* syntax of for loop

     for(initialisation; condition; increment/decrement){
     //body
     }

     */

//        Q1: Print the number from 1to 5
//        for (int num = 1; num <= 5 ;num++ ) {
//            System.out.println(num);
//        }
//        O2: Print the number from 1to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();


//        for (int num = 0; num < n; num++) {
//            System.out.println("Hello world");
//        }

//        While loops
        /*
        Syntax:
        while(Condition){
            body
        }
        */
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num +=1;

        }
    }
}
