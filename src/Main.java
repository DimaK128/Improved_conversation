import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I can recommend a book based on your age and favorite car brand.");
        System.out.println("Please,write your age and your favorite car brand.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int BMW = in.nextInt();
        int Mercedes = in.nextInt();
        int Audi = in.nextInt();

        if (n >= 18 && n <= 24) {
            System.out.println("");
        }
        if (n >= 25 && n <= 38) {
            System.out.println("");
        }
        if (n >= 25 && n <=37) {
            System.out.println("");
        }
        if (n >= 37 && n <=60) {
            System.out.println("");
        }
    }
}