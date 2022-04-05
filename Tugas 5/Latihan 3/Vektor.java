import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Vektor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> mamalia = new Vector<>();
		Vector<String> unggas = new Vector<>();
		Vector<Integer> i = new Vector<>();
		try (Scanner scan = new Scanner (System.in)) {
			int k, n;
			
			System.out.println("Berapa banyak alamat yang akan diinput: ");
			n=scan.nextInt();
			
			for(k=0; k<n; k++){
			    i.add(scan.nextInt());
			}
		}
                
                
		//mamalia.add("Kucing");//0
		//mamalia.add("Sapi");//1
		//mamalia.add("Kuda");//2
		//unggas.add("Bebek");//0
		//unggas.add("Ayam");//1
		//unggas.add(1,"Elang");
                
                
                
		System.out.println(mamalia.get(2));
		System.out.println(unggas);
		Vector<String> hewan = new Vector<>();
		hewan.addAll(mamalia);
		hewan.add("Platipus");//0
		hewan.addAll(unggas);
		System.out.println(hewan);
		hewan.set(3, "Buaya");
		
		System.out.println(hewan);
		Iterator<String> iterate = hewan.iterator();
		System.out.println("Isi Vektor: ");
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println("");
		for(int j = 0;j < hewan.size(); j++)
		{
			System.out.print(hewan.get(j)+", ");
		}
		
		String element = hewan.remove(2);
		System.out.println("");
		System.out.println("Elemen yang dihapus adalah "+element);
		System.out.println(hewan);
		hewan.clear();
		System.out.println(hewan);
		
	}
    }
    