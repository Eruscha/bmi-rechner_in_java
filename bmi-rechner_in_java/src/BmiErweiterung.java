import java.util.Scanner;

public class BmiErweiterung {

	public static void main(String[] args) {
		
		double height; //Körpergröße
		double bodyWeight; //Körpergewicht
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihre Körpergröße (in m) ein: ");
		height = sc.nextDouble();
		
		System.out.println("Bitte geben Sie Ihr Gewicht (in kg) ein: ");
		bodyWeight = sc.nextDouble();
		
		//BMI Berechnen
		bmi = bodyWeight / (height * height);
		bmi = Math.round(bmi);
		
		String klassifizierung = klassifizierungBerechnen(bmi);
		
		System.out.println("Ihr BMI ist: " + bmi);
		System.out.println("Klassifizierung: " + klassifizierung);
	}

	public static String klassifizierungBerechnen(double bmi) {
		
		if(bmi >= 18.5 && bmi <= 24) {
			return "Normalgewicht";
		}
		else if(bmi >= 25 && bmi <= 29) {
			return "Übergewicht";
		}
		else if(bmi >= 30 && bmi <= 34) {
			return "Adipositas Grad 1";
		}
		else if(bmi >= 35 && bmi <= 39) {
			return "Adipositas Grad 2";
		}
		else if(bmi >= 40) {
			return "Adipositas Grad 3";
		}
		else {
			return "Fehlerhafte Klassifizierung";
		}
		
	}

}
