package pv04_z02.dom2a;

public class ObazrivAgent extends TajniAgent {

	public ObazrivAgent(String kodnoIme) {
		super(kodnoIme);
	}

	@Override
	public void proslediInformaciju(TajniAgent izvor) {
		
		boolean prosledjuje = Math.random() <= 0.5;
		
		if (!prosledioInformaciju && prosledjuje && kontakti.size() > 1) {
			
			TajniAgent kontakt = null;
			
			do {
				int kome = (int) (Math.random() * kontakti.size());
				kontakt = kontakti.get(kome);
				
				if (kontakt != izvor) {
					
					prosledioInformaciju = true;
					kontakt.primiInformaciju(this);
				}
				
			} while (kontakt == izvor);
		}
	}
}
