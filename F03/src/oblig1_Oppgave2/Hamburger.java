package oblig1_Oppgave2;

public class Hamburger {
	
	private static int counter;
	
	private int tall;

	public Hamburger() {
		counter++;
		this.tall = counter;
		
		
	}
	
	public String toString() {
		return "("+ tall + ")";
	}
}
