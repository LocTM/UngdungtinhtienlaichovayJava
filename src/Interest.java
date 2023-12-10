import java.util.Scanner;


public class Interest {
    public static void main(String[] args) {
        double money = 1;
        int month = 1;
        double interestRate = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien can gui: ");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang gui : ");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat: ");
        interestRate = scanner.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate/100)/12 * month;
        }
        System.out.println("Lai suat la" + total);

    }
}
