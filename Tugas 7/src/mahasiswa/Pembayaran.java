package mahasiswa;
import javax.swing.*;

public class Pembayaran {

	//object
	int spp_var,spp,spp_tetap=0;
	//metode
	String univ=JOptionPane.showInputDialog("Nama Universitas");
	String nama=JOptionPane.showInputDialog("Masukkan nama");
	String NIM=JOptionPane.showInputDialog("Masukkan NIM");
	String Jurusan=JOptionPane.showInputDialog("Masukkan jurusan");
	String jenjang=JOptionPane.showInputDialog("Masukkan jenjang (1=S1,3=D3)");
	int a=Integer.parseInt(jenjang);

	if(a==3)
	{jenjang="D3";spp_tetap=1000000;}
	else if(a==1)
	{jenjang="S1";spp_tetap=1920000;}

	String input=JOptionPane.showInputDialog("Msukkan jumlah SKS");
	int sks=Integer.parseInt(input);

	//konstruktor
	spp_var=sks*50000;
	spp=spp_var+spp_tetap;
	//metode
	JOptionPane.showMessageDialog(null,"Universitas:"+univ+"\nNama:"+nama+"\nNIM:"+NIM+"\nJurusan:"+Jurusan+"\nJenjang:"+jenjang+"\nJumlah SKS:"+sks+"\nSPP Tetap:"+spp_tetap+"\nSPP Variable:"+spp_var+"\nSPP:"+spp);
	}

	}

	public Pembayaran() {
		// TODO Auto-generated constructor stub
	}

}
