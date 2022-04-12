package Mahasiswa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Mahasiswa {
    String nim;
	String nama;
	Double ipk;
	int sks;
	String tglLahir;
        
        public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir){
            this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.sks = sks;
		this.tglLahir = tglLahir;
        }
        public String getProgdi(String progdi) {
		String ps="";
		if(progdi=="A11") {
			ps = "Teknik Informatika";
		}
		else if(progdi=="A12") {
			ps = "Sistem Informasi";
		}
		else if(progdi=="B11") {
			ps = "Manajemen";
		}
		else if(progdi=="B12") {
			ps = "Akuntansi";
		}
		else {
			ps = "Belum terdaftar";
		}
		
		return ps;
	}
	
	public String ipkStatus() {
		String stat="";
		/**
		 * jika 0 < ipk <=1 , maka stat = "Perlu usaha lebih"
		 * jika 1 < ipk <=2, maka stat = "Perlu segera menaikkan IPK"
		 * jika 2 < ipk <=2.75, maka stat = "Sedikit lagi"
		 * jika 2.75 < ipk <= 3, maka stat = "Memuaskan"
		 * jika 3 < ipk <= 3.5, maka stat = "Sangat Memuaskan
		 * jika 3.5 < ipk <=4, maka stat = "Dengan pujian"
		 * jika di atas 4, maka stat = "Range ipk di luar jalur" 
		 * 
		 * */
                
                if(ipk <= 1){
                    System.out.println("Perlu usaha lebih");
                    
                } else if (ipk <= 2){
                    System.out.println("Perlu segera menaikkan IPK");
                } else if (ipk <= 2.75){
                    System.out.println("Sedikit lagi");
                } else if (ipk <= 3){
                    System.out.println("Memuaskan");
                } else if (ipk <= 3.5){
                    System.out.println("Sangat memuaskan");
                } else if (ipk <= 4 ){
                    System.out.println("Dengan pujian");
                } else {
                    System.out.println("angka tidak valid"
                            + "");
                }
		
		
		return stat;
	}
	
	public int getTahun() {
		int angkatan = 0;
                Scanner scan = new Scanner (System.in);
		/**
		 * cari angkatan dari nim yang diinput
		 * misal A11.2000.00001, maka akan mengembalikan 2000
		 * 
		 */
                System.out.print("Masukkan NIM : ");
                nim = scan.nextLine();
                
                
                
		return angkatan;
	}
	
	public int getTagihanSks() {
		int perSks = 250000;
                Scanner scan = new Scanner(System.in);
                sks = scan.nextInt();
                 int tagihan = sks*perSks;
		
		/**
		 * cari berapa jumlah tagihan mahasiswa yang bersangkutan
		 * sks*perSks
		 */
		
		return tagihan;
	}
	
	public int getMhsSemester() {
		int smt = 0;
		Calendar kld = Calendar.getInstance();
		int thnSkr = kld.get(Calendar.YEAR);
		
		/**
		 * Hitung mahasiswa sudah berapa semester kuliah
		 */
		
		return smt;
	}
	
	private Date dateFormatter(String pola, String tanggal) {
		Date tgl=null;
		SimpleDateFormat formatter = new SimpleDateFormat(pola);
		
		try {
			tgl = formatter.parse(tanggal);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		return tgl;
	}
	
	public String getUmur() {
		String umur = "";
                Scanner scan = new Scanner(System.in);
		
		/**
                 * * Hitung umur di sini
		 */
		System.out.print("Masukan Umur : ");
                umur = scan.nextLine();
		return umur;
		
	}
                 
}