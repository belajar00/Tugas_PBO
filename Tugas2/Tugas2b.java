import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Tugas2b {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String detikInput = JOptionPane.showInputDialog("Masukkan nilai detik: ");
        int detik = Integer.parseInt(detikInput);

        int totalMenit = detik / 60;
        int menitSekarang = totalMenit % 60;

        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

        int detikSekarang = detik % 60;

        JOptionPane.showMessageDialog(null, "Konversi Waktu: " + jamSekarang + " Jam " + menitSekarang + " Menit " + detikSekarang + " Detik");

        System.out.println("Konversi Waktu: " + jamSekarang + " Jam " + menitSekarang + " Menit " + detikSekarang + " Detik");        reader.close();
    }
}
