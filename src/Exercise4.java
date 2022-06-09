import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many integers will be add? ");
        int loops = scan.nextInt();
        int sum=0;
        while(loops>0){
            System.out.print("Enter an integer: ");
            int num = scan.nextInt();
            sum+=num;
            loops--;
        }
        System.out.printf("The sum is %d", sum);
        scan.close();
    }
}
