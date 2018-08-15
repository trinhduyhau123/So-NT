import java.util.Scanner;

public class SoNT {
    public static boolean CheckNT(int n) {
        if (n < 2) {
            return false;
        }
        else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i <= Math.sqrt(n); i+=2) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Nhap so: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (CheckNT(n) == true) {
            System.out.println("La so nguyen to ");
        } else {
            System.out.println("Ko phai so nguyen to");
        }
        }
}
