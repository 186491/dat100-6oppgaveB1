package no.hvl.dat100.varelager;

public class Main {

	public static void main(String[] args) {
		Vare vare = new Vare(1, "Eple", 5.2);
		
		System.out.println("Varenr: " + vare.getVarenr());
		System.out.println("Navn: " + vare.getNavn());
		System.out.println("Pris: " + vare.getPris());
	}
}
