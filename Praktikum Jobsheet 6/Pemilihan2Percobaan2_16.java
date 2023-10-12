import java.util.Scanner;
public class Pemilihan2Percobaan2_16 {

    public static void main(String[] args) {

        Scanner input16 = new Scanner(System.in);

        System.out.print("Masukkan Sudut 1 Segitiga: ");
        float sudut1 = input16.nextFloat();
        System.out.print("Masukkan Sudut 2 Segitiga: ");
        float sudut2 = input16.nextFloat();
        System.out.print("Masukkan Sudut 3 Segitiga: ");
        float sudut3 = input16.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        }else
            System.out.println("Bukan Segitiga");
        

    }
    
}
