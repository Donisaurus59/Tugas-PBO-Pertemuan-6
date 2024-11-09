import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penghasilan Anda: ");
        double penghasilan = scanner.nextDouble();

        Zakat zakat = new Zakat(penghasilan);

        System.out.println("Jumlah zakat yang harus dibayar: Rp " + zakat.getZakatAmount());

        System.out.print("Masukkan penghasilan baru jika ingin memperbarui: ");
        double penghasilanBaru = scanner.nextDouble();
        zakat.setPenghasilan(penghasilanBaru);

        System.out.println("Jumlah zakat setelah diperbarui: Rp " + zakat.getZakatAmount());

        scanner.close();
    }
}
