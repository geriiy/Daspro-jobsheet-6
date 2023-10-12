import java.util.Scanner;

public class Pemilihan2Percobaan212 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        

        System.out.print("Masukkan sudut 1: ");
        int sudut1 = input12.nextInt();
        System.out.print("Masukkan sudut 2: ");
        int sudut2 = input12.nextInt();
        System.out.print("Masukkan sudut 3: ");
        int sudut3 = input12.nextInt();

        int totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("Total sudut adalah: " + totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else 
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            
        } else 
            System.out.println("Bukan Segitiga");

    }


    
}
