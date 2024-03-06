import java.util.Scanner;
public class T17 {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        Sum = 0;
        System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
        x = masukan.nextInt();
        while (x != 999) { 
            Sum = Sum + x; 
            System.out.print("Masukkan nilai x (int), akhiridg 999 : ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = "+ Sum); 
    }
}
