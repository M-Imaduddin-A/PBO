import java.util.Scanner;

public class array {


    public static void main(String[] args) {
        int[] angka = new int [5];
        try (Scanner scanner = new Scanner(System.in)) {
			int sum = 0;
			
			for( int i = 0; i < angka.length; i++ ){
			    System.out.print("Angka ke-" + i + ": ");
			    angka[i] = scanner.nextInt();
			}
			
			for (int a : angka){
			    System.out.println(a);
			
			}
			for (int num: angka){
			    sum = sum+num;
			    
			}
			System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
		}
    }

    
    
}