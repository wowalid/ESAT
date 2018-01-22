package Abstraction;

import java.util.Observable;

import javax.swing.UIManager;
import Presentation.MainWindow;

public class Donnees extends Observable{
	public double[]  ResultatParMachine ; 
	public int[] boutonValeurs = {1 , 3, 1, 1, 1, 1, 1, 1 , 1, 1, 1, 1};
	public double prixElec = 0.14;
	public double prixGaz =  0.0785;
	public double prixDelEau = 0.995;
	public boolean Calcul = false;
	
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

		
		//RAPPORT PIECE POIDS
			double[] rapportPP = {0.478723404,
					0.378571429,
					0.090243902,
					0.209803922};
		
		//TEMPS MOYEN
			double[] tMoyen = {0.015734075,	0.037234043,		0.084935897,	0.023076923,	0.007092199};
		
		// PROCESS VOULU
			
			
				
		
		//PRIX ML
		double[] dureeHeures = {1.0,
				1.433333333,
				1.0,
				0.75,
				1.0,
				0.633333333,
				1.233333333,
				1.0,
				1.0,
				1.0,
				1.2,
				1.433333333,
				1.333333333,
				0.933333333,
				0.633333333,
				0.666666667,
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
		for (int i=1; i<prixEau.length; i++) {
			prixEau[i] = consoEau[i]*this.prixDelEau;
		}
		
		double[] prixChauffage = {1.266086957,
				0.423111111,
				2.92173913,
				0.255652174,
				0.109565217};


		double[][] prixProgramme = new double[26][6];
		for (int i=1; i<=25; i++) {
			for (int j=1; j<=5; j++) {
				if (i<10) {
					if (j==2) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+2.5496;
									 break;
							case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+0.92;
									 break;
							case 3 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+2.565;break;
							
							case 4 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+1.6;break;
							
							case 7 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+0.91;break;
							
							case 5 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+1.16;break;
							
							case 8 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+1.66;break;

						}
					}
					if (j==5) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+2.54;break;
						
							case 2 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+0.92;break;
						
							case 3 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+2.565;break;
						
							case 4 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+1.6;break;
						
							case 7 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+0.91;break;
						
							case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+1.16;break;
						
							case 8 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+1.66;break;
						

						}
					}
				}
				if (i==10) {
					switch(j) {
						case 1 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*this.prixElec*dureeHeures[i-1]*0.8+2.5496;
							break;
						case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*this.prixElec*dureeHeures[i-1]*0.6+2.5496;
							break;	
						case 3 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*this.prixElec*dureeHeures[i-1]*1.4+2.5496;
							break;
						case 4 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*this.prixElec*dureeHeures[i-1]*0.55+2.5496;
							break;
						case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*this.prixElec*dureeHeures[i-1]*0.25+2.5496;
							break;
					}
				}
				if (i==11) {
					switch(j) {
					case 1 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+0.92;
						break;
					case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+0.92;
						break;	
					case 3 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.92;
						break;
					case 4 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.92;
						break;
					case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+0.92;
						break;
				}
				}
				if (i>=12) {
					if (j==1) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[0]+prixChauffage[0]+(60/46)*prixElec*dureeHeures[i-1]*0.8+1.66;break;

					}
					}
					if (j==3) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[2]+prixChauffage[2]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.66;break;

					}
					}
					if (j==4) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[3]+prixChauffage[3]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.66;break;

					}
					}
				}
			}
		}
		
		System.out.println(prixProgramme[1][2]);
		
		
		double[] prixSechoir = new double[3];
		
		prixSechoir[0] = (60/24)*0.75*15*this.prixGaz;
		prixSechoir[1] = (60/24)*0.75*26.2*this.prixGaz;
		prixSechoir[2] = (60/24)*0.75*13.27*this.prixGaz;
		
		// PROCESS

		int[] BoutonsValeurs = {1 , 3, 1, 1, 1, 1, 1, 1 , 1, 1, 1, 1};
		double[] ResultatsIntermediaires = new double[12];
		double[] ResultatsMachines = new double[6];
		
		ResultatsIntermediaires[0] = tMoyen[0]*coutMO[1]*boutonValeurs[0];
		
		ResultatsIntermediaires[2] = MoyPresechage*boutonValeurs[2];
		
		switch(boutonValeurs[3]) {
		
			case 1 : ResultatsIntermediaires[3] = prixSechoir[0];
				     break;
			
			case 2 : ResultatsIntermediaires[3] = prixSechoir[1];
		     		 break;
		     		 
			case 3 : ResultatsIntermediaires[3] = prixSechoir[2];
		     		 break;
		     		 
			case 0 : ResultatsIntermediaires[3] = 0;
		     		 break;
			
		}
		
		
		ResultatsIntermediaires[4] = tMoyen[0]*coutMO[4]*2*boutonValeurs[4]+tMoyen[1]*Calandre[0];
		
		ResultatsIntermediaires[5] = tMoyen[2]*coutMO[4]*boutonValeurs[5];
		
		ResultatsIntermediaires[6] = tMoyen[3]*coutMO[4]*boutonValeurs[6];
		
		ResultatsIntermediaires[7] = tMoyen[4]*coutMO[4]*boutonValeurs[7];
		
		double Resultat = 0;
		
		for (int i=0; i<ResultatsIntermediaires.length; i++) {
			if (i<ResultatsMachines.length) {
				Resultat += ResultatsMachines[i];
			}
			Resultat += ResultatsIntermediaires[i];
		}
		
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
		
		for (int i = 0 ; i<5 ; i++) {
			this.ResultatParMachine[i]=ResultatsMachines[i];
			for (int j = 0 ; j< ResultatsIntermediaires.length ; j++ ) {
				this.ResultatParMachine[i]+=ResultatsIntermediaires[j]; 
			}
			
		}
		for (int i=0; i<5 ; i++) {
			
			System.out.println(" :"+ ResultatsMachines[i]);
		}	
		this.setChanged();
		this.notifyObservers();
	}
	
	public static void main(String[] args) {
		Donnees d= new Donnees();
		
	}
}
