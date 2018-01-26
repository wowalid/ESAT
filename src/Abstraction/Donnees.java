package Abstraction;

import java.util.Observable;

import javax.swing.UIManager;
import Presentation.MainWindow;

public class Donnees extends Observable{
	private static final double FRACTION = 1.304;
	public double[]  ResultatParMachine ; 
	public int[] boutonValeurs = {0 , 1, 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0};
	public double volumeRempli = 0.65;
	public int valeurPiece = 0;
	public double prixElec = 0.14;
	public double prixGaz =  0.0785;
	public double prixDelEau = 0.995;
	public boolean Calcul = false;
	public double poidsAn = 84313;
	public double immoKg = 92000/84313;
	
	public double[] poidsPiece =  {0.284,
			0.44,
			0.2,
			0.15,

			0.45,




			0.12,
			0.09,
			0.11,
			0.04,
			0.08,
			0.25,

			0.9,


			1.4,
			2.7,
			3.5,
			2.0,
			2.2,
			1.5,
			2.7,
			3.5,

			1.9,
			0.1,
			0.3,


			0.4,
			0.7,
			1.0,
			0.45,
			0.8,
			0.4,
			0.3,
			1.0,
			0.2,
			0.05,



			1.3,
			1.2,
			1.5,
			0.2,

			0.45,
			0.8,
			1.0,

			0.15,

			0.8,
			1.0,
			1.2,
			0.6,



			0.5,
			0.5,

			0.5,
			0.4,
			0.5,
			0.5,
			1.0,
			2.0,
			1.5,
			1.0,
			0.2,

			0.5,
			0.5,
			0.5,

			1.3,
			0.55,
			0.4,
			0.7,
			0.1,
			0.5,
			0.2,
			0.2,

			0.3,
			0.2,
			0.2,
			0.2,
			0.2,
			0.2,
			0.2,
			0.15,
			0.1,




			0.15,


			1.0,

			0.5,
			0.75,

			0.1,
			0.2,
			1.5,
			0.1,
			0.15,
			0.1,
			0.15,
			0.1,
};
	public double[] divisionMachines = {50.35211268,
			32.5,
			71.5,
			95.33333333,
			31.77777778,

			119.1666667,
			158.8888889,
			130.0,
			357.5,
			178.75,
			57.2,

			15.88888889,


			10.21428571,
			5.296296296,
			4.085714286,
			7.15,
			6.5,
			20.42857143,
			5.296296296,
			4.085714286,
			7.526315789,
			143.0,
			47.66666667,


			14.3,
			9.533333333,
			14.3,
			31.77777778,
			17.875,
			35.75,
			47.66666667,
			14.3,

			71.5,
			286.0,
			17.875,
			11.0,
			11.91666667,
			9.533333333,
			71.5,
			31.77777778,
			17.875,
			14.3,
			95.33333333,
			17.875,
			14.3,
			11.91666667,
			23.83333333,
			28.6,
			28.6,
			28.6,
			35.75,
			28.6,
			28.6,
			14.3,
			7.15,
			9.533333333,
			14.3,
			71.5,
			28.6,
			28.6,
			28.6,
			11.0,
			26.0,
			35.75,
			20.42857143,
			143.0,
			286.0,
			71.5,
			71.5,
			47.66666667,
			71.5,
			71.5,
			71.5,
			71.5,
			71.5,
			71.5,
			95.33333333,
			143.0,
			95.33333333,
			14.3,
			28.6,
			19.06666667,
			143.0,
			71.5,
			9.533333333,
			143.0,
			95.33333333,
			143.0,
			95.33333333,
			143.0,
	} ;

	public double[] divisionSechoires = {59.50704225,
			38.40909091,
			84.5,
			112.6666667,

			37.55555556,




			140.8333333,
			187.7777778,
			153.6363636,
			422.5,
			211.25,
			67.6,

			18.77777778,

			12.07142857,
			6.259259259,
			4.828571429,
			8.45,
			7.681818182,
			24.14285714,
			6.259259259,
			4.828571429,

			8.894736842,
			169.0,
			56.33333333,


			16.9,
			11.26666667,
			16.9,
			37.55555556,
			21.125,
			42.25,
			56.33333333,
			16.9,

			84.5,
			338.0,
			21.125,
			13.0,
			14.08333333,
			11.26666667,
			84.5,
			37.55555556,
			21.125,
			16.9,
			112.6666667,
			21.125,
			16.9,
			14.08333333,
			28.16666667,
			33.8,
			33.8,

			33.8,
			42.25,
			33.8,
			33.8,
			16.9,
			8.45,
			11.26666667,
			16.9,
			84.5,

			33.8,
			33.8,
			33.8,

			13.0,
			30.72727273,
			42.25,
			24.14285714,
			169.0,
			33.8,
			84.5,
			84.5,

			56.33333333,
			84.5,
			84.5,
			84.5,
			84.5,
			84.5,
			84.5,
			112.6666667,
			169.0,
			112.6666667,
			16.9,
			33.8,
			22.53333333,
			169.0,
			84.5,
			11.26666667,
			169.0,
			112.6666667,
			169.0,
			112.6666667,
			169.0,
	}; 
	
	public Donnees() {
		this.ResultatParMachine = new double[5];
		
	}
	
	public void Calcul() {
		 Calcul = true;
		//PRIX CALANDRE !
		double Calandre[] = new double[2];
		Calandre[0] = 52*this.prixGaz;
		Calandre[1] = 56*this.prixGaz;
		//PRIX SECHOIR:!!

		 double MoyPresechage  = (0.3434375+0.599870833+0.303827708)/3;
		//PRIX LESSIVE!!
		
		
		//FICHE TECHNIQUE!!
			//PRIX MO
			double[] coutMO = {19.28571429,
					4.821428571,
					8.035714286,
					6.428571429,
					1.607142857};

		
		//TEMPS MOYEN
			double[] tMoyen = {0.015734075,	0.037234043,		0.084935897,	0.023076923,	0.007092199,0.0328};
		
		// PROCESS VOULU
			
			
				
		
		//PRIX ML
		double[] dureeHeures = {1.0,
				1.433333333,
				1.0,
				0.75,
				1.0,
				0,
				0.633333333,
				1.233333333,
				1.0,
				1.1,
				1.21,
				1.333333333,
				0.933333333,
				0.633333333,
				0.666666667,
				0,
				1.0,
				0.833333333,
				1.416666667,
				0.75,
				0.75,
				1.233333333,
				1.45,
				1.016666667,
				0.766666667};
				
		double[] consoEau = {0.34,
				0.279,
				0.61,
				0.209,
				0.086};
		
		double[] prixEau = new double[5];
		for (int i=0; i<prixEau.length; i++) {
			prixEau[i] = consoEau[i]*this.prixDelEau;
		}
		
		double[] prixChauffage = new double[5];
		
		prixChauffage[0] = 7.04*this.prixElec;
		prixChauffage[1] = (7.04)*this.prixElec;
		prixChauffage[2] = (15.91)*this.prixElec;
		prixChauffage[3] = (1.36)*this.prixElec;
		prixChauffage[4] = (0.58)*this.prixElec;

		double[][] prixProgramme = new double[26][6];
		for (int i=1; i<=25; i++) {
			for (int j=1; j<=5; j++) {
				if (i<10) {
					if (j==2) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+2.5496;
									 break;
							case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+0.92;
									 break;
							case 3 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+2.565;break;
							
							case 4 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+1.6;break;
							
							case 7 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+0.91;break;
							
							case 5 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+1.16;break;
							
							case 8 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+1.66;break;

						}
					}
					if (j==5) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+2.54;break;
						
							case 2 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+0.92;break;
						
							case 3 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+2.565;break;
						
							case 4 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+1.6;break;
						
							case 7 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+0.91;break;
						
							case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+1.16;break;
						
							case 8 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+1.66;break;
						

						}
					}
				}
				if (i==10) {
					switch(j) {
						case 1 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.8+2.5496;
							break;
						case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.6+2.5496;
							break;	
						case 3 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*1.4+2.5496*2;
							break;
						case 4 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.55+2.5496;
							break;
						case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*this.prixElec*dureeHeures[i-1]*0.25+2.5496;
							break;
					}
				}
				if (i==11) {
					switch(j) {
					case 1 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+0.92;
						break;
					case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.6+0.92;
						break;	
					case 3 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+0.92*2;
						break;
					case 4 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+0.92;
						break;
					case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.25+0.92;
						break;
				}
				}
				if (i>=12) {
					if (j==1) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.8+1.66;break;

					}
					}
					if (j==3) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+2.54*2;break;
					
						case 11 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+0.92*2;break;
					
						case 12 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+2.565*2;break;
					
						case 13 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.6*2;break;
					
						case 14 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+0.91*2;break;
					
						case 16 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+0.85*2;break;
					
						case 17 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+2.27*2;break;
						
						case 18 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.16*2;break;
						
						case 19 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.99*2;break;
						
						case 20 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.66*2;break;
						
						case 21 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.41*2;break;
						
						case 22 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.31*2;break;
						
						case 24 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*1.4+1.66*2;break;

					}
					}
					if (j==4) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]*dureeHeures[i-1]+FRACTION*prixElec*dureeHeures[i-1]*0.55+1.66;break;

					}
					}
				}
			}
		}
		

		
		
		
		double[] prixSechoir = new double[3];
		
		prixSechoir[0] = (60/24)*0.75*15*this.prixGaz;
		prixSechoir[1] = (60/24)*0.75*26.2*this.prixGaz;
		prixSechoir[2] = (60/24)*0.75*13.27*this.prixGaz;
		
		// PROCESS

		double[] ResultatsIntermediaires = new double[12];
		double[] ResultatsMachines = new double[6];
		
		ResultatsIntermediaires[0] = tMoyen[0]*coutMO[1]*boutonValeurs[0];
		ResultatsIntermediaires[2] = MoyPresechage*boutonValeurs[2]/(this.divisionSechoires[this.valeurPiece]*this.volumeRempli*1.53);
		
		switch(boutonValeurs[3]) {
		
			case 1 :double frac1 = (25/this.poidsPiece[this.valeurPiece]); //52.5 //25 
					ResultatsIntermediaires[3] = prixSechoir[0]/(frac1*this.volumeRempli);
				     break;
			
			case 2 :double frac2 = (52.5/this.poidsPiece[this.valeurPiece]); //52.5 //25 
					ResultatsIntermediaires[3] = prixSechoir[1]/(frac2*this.volumeRempli);
		     		 break;
		     		 
			case 3 :double frac3 = (25/this.poidsPiece[this.valeurPiece]); //52.5 //25 
					ResultatsIntermediaires[3] = prixSechoir[2]/(frac3*this.volumeRempli);
		     		 break;
		     		 
			case 0 : ResultatsIntermediaires[3] = 0;
		     		 break;
			
		}
		
		
		ResultatsIntermediaires[4] = tMoyen[1]*coutMO[4]*2*boutonValeurs[4]+(boutonValeurs[4]==0 ? 0 : tMoyen[1]*Calandre[0]);
		
		ResultatsIntermediaires[5] = tMoyen[2]*coutMO[4]*boutonValeurs[5];
		
		ResultatsIntermediaires[6] = tMoyen[3]*coutMO[4]*boutonValeurs[6];
		
		ResultatsIntermediaires[7] = tMoyen[4]*coutMO[4]*boutonValeurs[7];
		
		ResultatsIntermediaires[8] = tMoyen[5]*coutMO[4]*2*boutonValeurs[8];
		
		switch(boutonValeurs[1]) {
			case 1 : ResultatsMachines[1] = prixProgramme[1][2];
					 ResultatsMachines[4] = prixProgramme[1][5];
					 ResultatsMachines[0] = prixProgramme[10][1];
					 ResultatsMachines[2] = prixProgramme[10][3];
					 ResultatsMachines[3] = prixProgramme[10][4];
					 break;
			case 2 : ResultatsMachines[1] = prixProgramme[2][2];
					 ResultatsMachines[0] = prixProgramme[11][1];
					 ResultatsMachines[2] = prixProgramme[11][3];
					 ResultatsMachines[4] = prixProgramme[2][5];
					 ResultatsMachines[3] = prixProgramme[11][4];
				     
					 break;
			case 3 : ResultatsMachines[1] = prixProgramme[3][2];
					 ResultatsMachines[0] = prixProgramme[12][1];
					 ResultatsMachines[2] = prixProgramme[12][3];
					 ResultatsMachines[4] = prixProgramme[3][5];
					 ResultatsMachines[3] = prixProgramme[12][4];
					 break;
			case 4 : ResultatsMachines[1] = prixProgramme[4][2];
			         ResultatsMachines[0] = prixProgramme[13][1];
			         ResultatsMachines[2] = prixProgramme[13][3];
			         ResultatsMachines[4] = prixProgramme[4][5];
			         ResultatsMachines[3] = prixProgramme[13][4];
					 break;
			case 5 : ResultatsMachines[1] = prixProgramme[5][2];
					 ResultatsMachines[0] = prixProgramme[18][1];
					 ResultatsMachines[2] = prixProgramme[18][3];
					 ResultatsMachines[4] = prixProgramme[5][5];
					 ResultatsMachines[3] = prixProgramme[18][4];
					 break;
			case 7 : ResultatsMachines[1] = prixProgramme[6][2];
					 ResultatsMachines[0] = prixProgramme[14][1];
					 ResultatsMachines[2] = prixProgramme[14][3];
					 ResultatsMachines[4] = prixProgramme[6][5];
					 ResultatsMachines[3] = prixProgramme[14][4];
			         break;
			case 8 : ResultatsMachines[1] = prixProgramme[7][2];
					 ResultatsMachines[0] = prixProgramme[22][1];
					 ResultatsMachines[2] = prixProgramme[22][3];
					 ResultatsMachines[4] = prixProgramme[7][5];
					 ResultatsMachines[3] = prixProgramme[22][4];
					 break;
			case 9 : ResultatsMachines[1] = prixProgramme[8][2];
			         ResultatsMachines[4] = prixProgramme[8][5];
			
					 break;
			case 10 : ResultatsMachines[1] = prixProgramme[9][2];
					  ResultatsMachines[0] = prixProgramme[10][1];
					  ResultatsMachines[2] = prixProgramme[10][3];
					  ResultatsMachines[4] = prixProgramme[9][5];
					  ResultatsMachines[3] = prixProgramme[10][4];
					  break;
			case 11 : ResultatsMachines[1] = prixProgramme[2][2];
					  ResultatsMachines[0] = prixProgramme[11][1];
					  ResultatsMachines[2] = prixProgramme[11][3];
					  ResultatsMachines[4] = prixProgramme[2][5];
					  ResultatsMachines[3] = prixProgramme[11][4];
					  break;
			case 12 : ResultatsMachines[1] = prixProgramme[3][2];
				      ResultatsMachines[0] = prixProgramme[12][1];
				      ResultatsMachines[2] = prixProgramme[12][3];
				      ResultatsMachines[4] = prixProgramme[3][5];
				      ResultatsMachines[3] = prixProgramme[12][4];
			          break;
			case 13 : ResultatsMachines[1] = prixProgramme[4][2];
					  ResultatsMachines[0] = prixProgramme[13][1];
					  ResultatsMachines[2] = prixProgramme[13][3];
					  ResultatsMachines[4] = prixProgramme[4][5];
					  ResultatsMachines[3] = prixProgramme[13][4];
					  break;
			case 14 : ResultatsMachines[1] = prixProgramme[5][2];
					  ResultatsMachines[0] = prixProgramme[14][1];
					  ResultatsMachines[2] = prixProgramme[14][3];
					  ResultatsMachines[4] = prixProgramme[5][5];
					  ResultatsMachines[3] = prixProgramme[14][4];
					  break;
			case 15 : ResultatsMachines[1] = prixProgramme[7][2];
			          ResultatsMachines[4] = prixProgramme[7][5];

					  break;
			case 16 : ResultatsMachines[0] = prixProgramme[16][1];
					  ResultatsMachines[2] = prixProgramme[16][3];
					  ResultatsMachines[3] = prixProgramme[16][4];
				      break;
			case 17 : ResultatsMachines[0] = prixProgramme[17][1];
					  ResultatsMachines[2] = prixProgramme[17][3];
					  ResultatsMachines[3] = prixProgramme[17][4];
					  break;
			case 18 : ResultatsMachines[1] = prixProgramme[8][2];
					  ResultatsMachines[0] = prixProgramme[18][1];
					  ResultatsMachines[2] = prixProgramme[18][3];
					  ResultatsMachines[4] = prixProgramme[8][5];
					  ResultatsMachines[3] = prixProgramme[18][4];
					  break;
			case 19 : ResultatsMachines[0] = prixProgramme[19][1];
			          ResultatsMachines[2] = prixProgramme[19][3];
			          ResultatsMachines[3] = prixProgramme[19][4];
					  break;
			case 20 : ResultatsMachines[1] = prixProgramme[3][2];
					  ResultatsMachines[0] = prixProgramme[20][1];
					  ResultatsMachines[2] = prixProgramme[20][3];
					  ResultatsMachines[4] = prixProgramme[3][5];
					  ResultatsMachines[3] = prixProgramme[20][4];
					  break;
			case 21 : ResultatsMachines[0] = prixProgramme[21][1];
			          ResultatsMachines[2] = prixProgramme[21][3];
			          ResultatsMachines[3] = prixProgramme[21][4];
				      break;
			case 22 : ResultatsMachines[1] = prixProgramme[7][2];
					  ResultatsMachines[0] = prixProgramme[22][1];
					  ResultatsMachines[2] = prixProgramme[22][3];
					  ResultatsMachines[4] = prixProgramme[7][5];
					  ResultatsMachines[3] = prixProgramme[22][4];
					  break;
			case 23 : ResultatsMachines[0] = prixProgramme[23][1];
			          ResultatsMachines[2] = prixProgramme[23][3];
			          ResultatsMachines[3] = prixProgramme[23][4];
				      break;
			case 24 : ResultatsMachines[1] = prixProgramme[3][2];
			          ResultatsMachines[2] = prixProgramme[24][3];
				      ResultatsMachines[0] = prixProgramme[24][1];
				      ResultatsMachines[4] = prixProgramme[3][5];
				      ResultatsMachines[3] = prixProgramme[24][4];
					  break;
			case 25 : ResultatsMachines[0] = prixProgramme[25][1];
			          ResultatsMachines[2] = prixProgramme[25][3];
			          ResultatsMachines[3] = prixProgramme[25][4];
			          break;
			          
		
		}
		java.text.DecimalFormat df = new java.text.DecimalFormat("0.###");
		for (int i = 0 ; i<5 ; i++) {
			if (i==0) {
				double frac = (11/this.poidsPiece[this.valeurPiece]);
				this.ResultatParMachine[i]=ResultatsMachines[i]/(frac*this.volumeRempli);
				this.ResultatParMachine[i]+=this.immoKg*this.poidsPiece[this.valeurPiece];
			}
			else if(i==2) {
					double frac = (50/this.poidsPiece[this.valeurPiece]);
					this.ResultatParMachine[i]=ResultatsMachines[i]/(frac*this.volumeRempli);
					this.ResultatParMachine[i]+=this.immoKg*this.poidsPiece[this.valeurPiece];
			}
			else {
				double frac = (22/this.poidsPiece[this.valeurPiece]);
				this.ResultatParMachine[i]=ResultatsMachines[i]/(frac*this.volumeRempli);
				this.ResultatParMachine[i]+=this.immoKg*this.poidsPiece[this.valeurPiece];				
			}
			for (int j = 0 ; j< ResultatsIntermediaires.length ; j++ ) {
				this.ResultatParMachine[i]+=ResultatsIntermediaires[j]; 
				this.ResultatParMachine[i] = (int)(this.ResultatParMachine[i]*100);
				this.ResultatParMachine[i] = this.ResultatParMachine[i]*0.01;
			}
			
		}
		this.setChanged();
		this.notifyObservers();
	}
	
}
