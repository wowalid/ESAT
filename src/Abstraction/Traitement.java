package Abstraction;

public class Traitement {
	
	private int lig;
	private int col;
	private int ecrire;
	private Excel excel;
	
	public Traitement(int lig, int col, int ecrire, Excel excel) {
		this.lig = lig;
		this.col = col;
		this.ecrire = ecrire;
		this.excel = excel;
	}
	
	public int getLig() {
		return this.lig;
	}
	
	public int getCol() {
		return this.col;
	}
	
	public int getEcrire() {
		return this.ecrire;
	}
	
	public void Ecrire() {
		Object[][] tableau = this.excel.getBody();
		tableau[lig][col] = ecrire;
	}
	
}