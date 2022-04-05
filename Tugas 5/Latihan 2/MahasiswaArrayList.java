import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class MahasiswaArrayList {
	 static int n;
	    public static void main(String[] args) {
	        

	                   String nim;
	                   String nama;
	                   Double ipk;

	               List<String> mhs = new ArrayList<String>();
			System.out.print("Masukkan Jumlah Data: ");
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			
			/**
			 * Gunakan Scanner untuk menginput data nim, nama, ipk
			 */
			
		}
		
		public static void setMahasiswa(String nim, String nama, double ipk) {
			//gunakan perulangan untuk menyimpan data ke Class Mahasiswa
	                System.out.print("NIM   : ");
	                Scanner scanner;
					nim = scanner.nextLine();
	    
	                System.out.print("Nama: ");
	                nama = scanner.nextLine();
	    
	                System.out.print("IPK: ");
	                ipk = scanner.nextDouble();

	                List<String> list;
					for (int i = 1; i <= n; i++)
	                 list.add(i);
	             
		}
		
		public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
			//gunakan perulangan untuk mencetak data yang diambil dari atribut di class Mahasiswa
			 for (Mahasiswa a : list) {
	                     System.out.println(a);
	                 }
		}

	}

