
public class AksiSepeda {
	
	public static void main(String[] args) {
		//membuat objek);
		Sepeda sepedaGunung = new Sepeda(2,"Gunung","Unicorn");
		
		//mengakses atribut dan method
		int gearSepeda = sepedaGunung.gear;
		System.out.println("Jumlah gear "+gearSepeda);
		sepedaGunung.ngerem();
	}
}