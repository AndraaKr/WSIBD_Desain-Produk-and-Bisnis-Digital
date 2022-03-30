import java.util.Scanner;
public class BKPM_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai batas nilai Awal = ");
        String awal = input.next();
        int genap = Integer.parseInt(awal);
        
        System.out.print("Masukkan nilai batas nilai Akhir = ");
        String akhir = input.next();
        int genap1 = Integer.parseInt(akhir);
        
        
        for(int i=genap; i<=genap1;i++)
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
    }
    
}
