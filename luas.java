import java.util.Scanner;
public class luas { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int panjang, lebar, luas, keliling; 
        System.out.print("Masukkan panjang: "); 
        panjang = input.nextInt(); 
        System.out.print("Masukkan lebar: "); 
        lebar = input.nextInt(); 
        luas = panjang * lebar; 
        System.out.println("Luas: " + luas); 
        keliling = 2 * (panjang + lebar); 
        System.out.println("Keliling: " + keliling); 
    } 
}