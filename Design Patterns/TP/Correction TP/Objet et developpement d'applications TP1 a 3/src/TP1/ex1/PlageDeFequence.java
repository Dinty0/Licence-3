package TP1.ex1;

public class PlageDeFequence {
	private double frequenceMin;
	private double frequenceMax;
	
	
	public PlageDeFequence(double frequenceMin, double frequenceMax) {
		this.frequenceMin = frequenceMin;
		this.frequenceMax = frequenceMax;
	}
	
	public double getFrequenceMin() {
		return frequenceMin;
	}
	public double getFrequenceMax() {
		return frequenceMax;
	}

	public String toString() {
		return "[" + this.frequenceMin + "-" + this.frequenceMax + "]";
	}

	public int compareTo(PlageDeFequence plageDeFrequence) {
		return (int) Math.signum(this.largeurPlageDeFrequence() - plageDeFrequence.largeurPlageDeFrequence());
	}

	public double largeurPlageDeFrequence() {
		return this.frequenceMax - this.frequenceMin;
	}
	
	
	
}
