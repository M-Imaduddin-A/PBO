package Parkir;

import java.util.Scanner;

public class MenghitungLamaParkir {

	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {


	Scanner input_masuk = new Scanner (System.in);
	int tarif_Parkir=0;
	int total_Jam_Parkir;
	double jumlah_bayar;
	double kembalian;

	System.out.println(“===============================”);
	System.out.println(“============WELCOME============”);
	System.out.println(“=======TO MY APPLICATION=======”);
	System.out.println(“===============================”);
	System.out.println(“=======Masukan No Polisi=======”);
	String No_Polisi = input_masuk.next();
	System.out.println(“=======Masukan Jam Masuk=======”);
	int jam_masuk = input_masuk.nextInt();
	System.out.println(“=======Masukan Jam Keluar=======”);
	int jam_keluar = input_masuk.nextInt();
	System.out.println(“===============================”);
	System.out.println(“+++Kode Kendaraan+++”);
	System.out.println(“===============================”);
	System.out.println(“1.Motor”);
	System.out.println(“2.Mobil”);
	System.out.println(“===============================”);
	System.out.println(“+++++Masukan Kode Kendaraan+++++”);
	System.out.println(“===============================”);
	int tipe = input_masuk.nextInt();

	total_Jam_Parkir = jam_keluar-jam_masuk;
	switch (tipe){
	case 1 :
	tarif_Parkir = total_Jam_Parkir * 2000;
	break;
	case 2 :
	tarif_Parkir = total_Jam_Parkir * 4000;
	break;

	default:
	tarif_Parkir = 0;
	break;
	}
	System.out.println(“===============================”);
	System.out.println(“+++++Biaya Parkir+++++”);
	System.out.println(“===============================”);
	if (tipe == 1){
	System.out.println(“Jenis Kendaraan : motor”);
	}else if (tipe == 2) {
	System.out.println(“Jenis Kendaraan : Mobil”);
	}else {
	System.out.println(“Jenis Kendaraan Tidak Terdaftar”);
	}
	System.out.println(“No Polisi : ” + No_Polisi);
	System.out.println(“Jam Masuk : ” + jam_masuk+ “WIB”);
	System.out.println(“Jam Keluar : ” + jam_keluar+ “WIB”);
	System.out.println(“Lama Parkir : ” + total_Jam_Parkir + “Jam”);
	System.out.println(“Tarif Parkir : RP. ” + tarif_Parkir);
	}

	}
}
