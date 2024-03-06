import java.util.Scanner;
public class T13 {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        i = 1; 
        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N){ 
            System.out.println (i); 
        }
    }
}