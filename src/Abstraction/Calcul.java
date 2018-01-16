package Abstraction;

import java.util.Observable;

public class Calcul extends Observable{
	
	private Excel excel;
	private float resultat = 0;
	public Calcul(Excel excel) {
		this.excel = excel;
	}
	
	public Excel getExcel() {
		return this.excel;
	}
	
	public void calcul() {
		Object[][] tab = excel.getBody();
		this.resultat = (float) tab[0][0];
		this.setChanged();
		this.notifyObservers();	
	}

}
