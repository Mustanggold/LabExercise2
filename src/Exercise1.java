import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the start number: ");
        int startN = scan.nextInt();
        System.out.print("Input the end number ");
        int endN = scan.nextInt();
        for(int i=startN; i<=endN; i++){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
