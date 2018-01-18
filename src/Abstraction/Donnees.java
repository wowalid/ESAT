package Abstraction;

import java.util.Observable;

import javax.swing.UIManager;

import abstraction.Cours;
import presentation.MainWindow;

public class Donnees extends Observable{
	
	public Donnees() {
		//PRIX CALANDRE !
			Double[][] Calandre = {{1.0,8.0,52.0,32.656, 4.082, 32.656, 2.0},{8.0,56.0,35.168,4.396,35.168}};

		
		//PRIX SECHOIR:!!
			Double[][] sechoir1 = {{1.0,0.75,21.2,0.0,0.0,2.2078125,	0.0,0.0,2.2078125},
					{2.0,0.75,	36.0,0.0,0.0,3.8563125,0.0,	0.0,	3.8563125},
					{3.0,	0.75,	25.0,	0.0,	0.0,	1.953178125,	0.0,	0.0,	1.953178125}};

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
			
			double prixElec = 0.14;
			double prixGaz =  0.0785;
			double prixDelEau = 0.995;
				
		
		//PRIX ML
		double[] dureeHeures = {0.1,
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
				
		double[] prixEau = {0.3383,
				0.277605,
				0.60695,
				0.207955,
				0.08557};
		double[] prixChauffage = {1.266086957,
				0.423111111,
				2.92173913,
				0.255652174,
				0.109565217};

		double[] prixMoteur = new double[5];
		double[] prixLessive = new double[5];
		double[] Total = new double[5];	
		
		double[][] prixProgramme = new double[26][6];
		for (int i=1; i<=25; i++) {
			for (int j=1; j<=5; j++) {
				if (i<=11) {
					if (j==2) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+2.54;
									 break;
							case 2 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+0.92;
									 break;
							case 3 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+2.565;break;
							
							case 4 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+1.6;break;
							
							case 7 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+0.91;break;
							
							case 5 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+1.16;break;
							
							case 8 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+1.66;break;

						}
					}
					if (j==5) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+2.54;break;
						
							case 2 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+0.92;break;
						
							case 3 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+2.565;break;
						
							case 4 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+1.6;break;
						
							case 7 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+0.91;break;
						
							case 5 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+1.16;break;
						
							case 8 : prixProgramme[i][j] = prixEau[4]+prixChauffage[4]+(60/46)*prixElec*dureeHeures[i-1]*0.25+1.66;break;
						

						}
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
						case 10 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+1.66;break;

					}
					}
					if (j==4) {
						switch(i) {
						case 10 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.54;break;
					
						case 11 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.92;break;
					
						case 12 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.565;break;
					
						case 13 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.6;break;
					
						case 14 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.91;break;
					
						case 16 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+0.85;break;
					
						case 17 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+2.27;break;
						
						case 18 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.16;break;
						
						case 19 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.99;break;
						
						case 20 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.66;break;
						
						case 21 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.41;break;
						
						case 22 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.31;break;
						
						case 24 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+1.66;break;

					}
					}
				}
			}
		}
		
		System.out.println(prixProgramme[1][2]);
		double[] prixSechoir = {2.2078125,
				3.8563125,
				1.953178125};
		
		// PROCESS
		int[] BoutonsValeurs = {1 , 1, 1, 1, 1, 1, 1, 1 , 1, 1, 1, 1};
		System.out.println(BoutonsValeurs[3]);
		double[] ResultatsIntermediaires = new double[12];
		double[] ResultatsMachines = new double[5];
		
		ResultatsIntermediaires[0] = tMoyen[0]*coutMO[1]*BoutonsValeurs[0];
		
		ResultatsIntermediaires[2] = MoyPresechage*BoutonsValeurs[2];
		
		switch(BoutonsValeurs[3]) {
		
			case 1 : ResultatsIntermediaires[3] = prixSechoir[0];
				     break;
			
			case 2 : ResultatsIntermediaires[3] = prixSechoir[1];
		     		 break;
		     		 
			case 3 : ResultatsIntermediaires[3] = prixSechoir[2];
		     		 break;
		     		 
			case 0 : ResultatsIntermediaires[3] = 0;
		     		 break;
			
		}
		
		
		ResultatsIntermediaires[4] = tMoyen[0]*coutMO[4]*2*BoutonsValeurs[4]+tMoyen[1]*Calandre[0][4];
		
		ResultatsIntermediaires[5] = tMoyen[2]*coutMO[4]*BoutonsValeurs[5];
		
		ResultatsIntermediaires[6] = tMoyen[3]*coutMO[4]*BoutonsValeurs[6];
		
		ResultatsIntermediaires[7] = tMoyen[4]*coutMO[4]*BoutonsValeurs[7];
		
		double Resultat = 0;
		
		for (int i=0; i<ResultatsIntermediaires.length; i++) {
			if (i<ResultatsMachines.length) {
				Resultat += ResultatsMachines[i];
			}
			Resultat += ResultatsIntermediaires[i];
		}
		
		switch(BoutonsValeurs[1]) {
			case 1 : ResultatsMachines[1] = prixProgramme[1][2];
			
			case 2 : ResultatsMachines[1] = prixProgramme[2][2];
			
			case 3 : ResultatsMachines[1] = prixProgramme[3][2];
			
			case 4 : ResultatsMachines[1] = prixProgramme[4][2];
			
			case 5 : ResultatsMachines[1] = prixProgramme[5][2];
			
			case 7 : ResultatsMachines[1] = prixProgramme[6][2];
			
			case 8 : ResultatsMachines[1] = prixProgramme[7][2];
			
			case 9 : ResultatsMachines[1] = prixProgramme[8][2];
			
			case 10 : ResultatsMachines[1] = prixProgramme[9][2];
			
			case 11 : ResultatsMachines[1] = prixProgramme[2][2];
			
			case 12 : ResultatsMachines[1] = prixProgramme[3][2];
			
			case 13 : ResultatsMachines[1] = prixProgramme[4][2];
			
			case 14 : ResultatsMachines[1] = prixProgramme[5][2];
			
			case 15 : ResultatsMachines[1] = prixProgramme[7][2];
			
			case 18 : ResultatsMachines[1] = prixProgramme[8][2];
			
			case 20 : ResultatsMachines[1] = prixProgramme[3][2];
			
			case 22 : ResultatsMachines[1] = prixProgramme[7][2];
			
			case 24 : ResultatsMachines[1] = prixProgramme[3][2];
			
		
		}
		
		System.out.println(ResultatsIntermediaires[3]);
		
	}
	
	public static void main(String[] args) {
		Donnees d= new Donnees();
		
	}
}
