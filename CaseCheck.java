import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//         String word= "hello";
//        System.out.println(word.charAt(3));
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("This is a lowercase value");
        } else {
            System.out.println(("This is a Uppercase value"));
        }
    }
}
