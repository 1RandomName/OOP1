package pv04_z02.dom1;

public class OpustenAgent extends TajniAgent {

	public OpustenAgent(String kodnoIme) {
		super(kodnoIme);
	}

	@Override
	public void proslediInformaciju(TajniAgent izvor) {
		
		for (int i = 0; i < kontakti.size(); i++) {
			
			TajniAgent kontakt = kontakti.get(i);
			
			if (kontakt != izvor && Math.random() <= 0.6)
				kontakt.primiInformaciju(this);
		}
	}
}
