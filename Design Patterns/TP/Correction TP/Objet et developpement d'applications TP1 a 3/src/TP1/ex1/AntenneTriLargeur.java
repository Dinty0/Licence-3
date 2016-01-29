package TP1.ex1;

import java.util.Comparator;

public class AntenneTriLargeur implements Comparator<Antenne> {

	public int compare(Antenne a1, Antenne a2) {
		return a1.getPlageDeFrequence().compareTo(a2.getPlageDeFrequence());
	}	
	
}
