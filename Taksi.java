package TaksimetreProgramı;
import java.util.Scanner;




public class Taksi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("KM Bilgisini Giriniz: ");
		double km;
		km = scan.nextInt();
		double price;
		price = 10 + (km * 2.20);
		price = (price < 20) ? 20 : price;
		
		
		System.out.println("Taksimetre: " + price);
		

	}

}
