package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		varer = new Vare[n];
		antall = 0;

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {
		
		if (antall < varer.length) {
			varer[antall] = v;
			antall++;
			return true;
		}
		return false;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare nyVare = new Vare(varenr, navn, pris);
		return leggTilVare(nyVare);

	}
	
	public Vare finnVare(int varenr) {
			
		for (int i = 0; i < antall; i++) {
			if (varer [i].getVarenr() == varenr) {
				return varer[i];
			}
		}
		return null;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
			for (int i = 0; i < antall; i++) {
				System.out.println(varer[i].toString());
			}
		System.out.println(SEP);	
	}
	
}
