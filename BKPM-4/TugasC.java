import java.util.Scanner;

public class Nilai_ratarata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int []nilai = new int [10];
        int i,a,x;
        int min, max;
        float total,rata;
        
        System.out.print("Masukan banyaknya data nilai = ");
        a = input.nextInt();
        
        total = 0;
        i = 1;
        while (i<=a){
            System.out.print("Masukan data nilai ke-" +i+ " = " );
            x = input.nextInt();
            total += x;
            
            i++;                        
        }
        
        min = nilai[0];
        max = nilai[0];
        
        for (x=0; x<10; x++){
            if (nilai[x]> max){
                max = nilai[x];
            }
             else if(nilai[x] < min){
                min = nilai[x];    
            }    
        }
        
        System.out.println("");
        
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);
        
        rata = total / a;
        System.out.println("Rata-rata = "+rata);
       ;
    }
    
}
