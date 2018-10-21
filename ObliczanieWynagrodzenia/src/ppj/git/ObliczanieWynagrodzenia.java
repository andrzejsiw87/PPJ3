package ppj.git;

public class ObliczanieWynagrodzenia {

	public static void main(String[] args) {
		
		int liczbaGodzin = 59;
		int stawka = 12;
		double stawkaNadgodzin = (1.5 * stawka);
		int normaGodzinowa = 40;
		int maksymalnaLiczbaGodzin = 60;
		int liczbaNadgodzin = (liczbaGodzin - normaGodzinowa);
		
		if (liczbaGodzin <= 40) {
			System.out.println("Wynagrodzenie =" + stawka * liczbaGodzin);
		}
		
		else if (liczbaGodzin > 40 && liczbaGodzin <= 60) {
			System.out.println("Wynagrodzenie =" + (stawka * normaGodzinowa + stawkaNadgodzin * liczbaNadgodzin));
		}
		
		else if (liczbaGodzin > 60) {
			System.out.println("Za du¿o godzin");
		}

	}

}
