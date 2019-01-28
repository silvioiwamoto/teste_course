import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String produto1 = "Computer";
		String produto2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender ='F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produto:");
		System.out.printf("%s, which price is $ %.2f%n",produto1,price1);
		System.out.printf("%s, which price is $ %.2f%n", produto2,price2);
		System.out.println();
		System.out.printf("Record: %d year old, code %d and gender: %c%n", age,code,gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.6f%n", measure);
		System.out.printf("Rouded (third decimal places): %.3f%n",measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f",measure );
		

	}

}
