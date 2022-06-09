import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number that you want to sum up to: ");
        int num = scan.nextInt();
        System.out.printf("The sum of 1 to %d is %d", num, sum(num));
        scan.close();
    }
    public static int sum(int number){
        if(number==0) return 0;
        return number + sum(--number);
    }
}
