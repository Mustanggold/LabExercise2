import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scan.nextLine();
        for(int i=0; i<str.length(); i++){
            System.out.printf("%s ",str);
        }
        scan.close();
    }
}
