import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1 {

    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nBaca string dan Integer: ");
        System.out.print("Masukkan sebuah string: ");
        str = dataIn.readLine();
        System.out.println("String yang dibaca: " + str);
    }
}
