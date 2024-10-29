package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		if (varer == null || varer.length == 0) {
			return null;
		}
		Vare billigste = varer[0];
		for (Vare vare : varer) {
			if (vare.getPris() < billigste.getPris()) {
				billigste = vare;
			}
		}
		return billigste;
	}
	
	public static double totalPris(Vare[] varer) {		
		
		double total = 0.0;
		for (Vare vare : varer) {
			total += vare.getPris();
		}
		return total;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int[] varenumre = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			varenumre[i] = varer[i].getVarenr();
		}
		return varenumre;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		if(varer.length < 2) return new double[0];
		
		double[] differanser = new double[varer.length - 1];
		for (int i = 0; i < varer.length - 1; i++) {
			differanser[i] = varer[i + 1].getPris() - varer[i].getPris();
		}
		return differanser;

	}
}
