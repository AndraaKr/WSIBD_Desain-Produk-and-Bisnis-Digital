package BKPM3;
import java.util.Scanner;
public class Tugas_E {
public static void main(String[] args) {
         // Program array untuk menampilkan menu
        String pembeli;
        int item;
        Scanner buyer=new Scanner(System.in);
        Scanner barang=new Scanner(System.in);
        String menu[]=new String[6];
        menu[0]="";
        menu[1]="mie kare";
        menu[2]="mie jumbo";
        menu[3]="es teh";
        menu[4]="teh anget";
        menu[5]="pop ice";
        
        System.out.println("################################################");
        System.out.println("                   KEDAI XIXIXI                  ");
        System.out.println("        SELAMAT DATANG SELAMAT MENIKMATI        ");
        System.out.println("################################################");
        System.out.println("Masukan nama pembeli");
        pembeli=buyer.nextLine();
        System.out.println("Masukan barang yang dipesan");
        item=barang.nextInt();
        
        switch (item) {
            case 1:
                System.out.println(pembeli +" "+"membeli"+" "+menu[1]);
                break;
            case 2:
                System.out.println(pembeli +" "+"membeli"+" "+menu[2]);
                break;
            case 3:
                System.out.println(pembeli +" "+"membeli"+" "+menu[3]);
                break;
            case 4:
                System.out.println(pembeli +" "+"membeli"+" "+menu[4]);
                break;
            case 5:
                System.out.println(pembeli +" "+"membeli"+" "+menu[5]);
                break;
            default:
                System.out.println("KALAU TIDAK MINAT MEMBELI SILAHKAN KEMBALI");
                break;   
        }
            System.out.println("Terimakasih");
}
}