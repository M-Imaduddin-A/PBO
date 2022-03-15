
public class Sepeda {
		//tempat untuk atribut
		int gear = 5;
		int jumlahRoda = 2;
	
		public Sepeda() {
			// TODO Auto-generated constructor stub
		}
		public Sepeda(int jumlahRoda, String jenis, String merk){
			System.out.println("Sepeda "+jenis+" bermerk "+merk+
		" memiliki jumlah roda "+jumlahRoda);
		}

		//ini adalah tempat untuk method
		void ngerem() {
			System.out.println("Sepeda direm");
		}
}
