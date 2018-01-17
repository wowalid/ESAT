package Abstraction;

public class Donnees {
	
	public Donnees() {
		//PRIX CALANDRE !
			Double[][] Calandre = {{1.0,8.0,52.0,32.656, 4.082, 32.656, 2.0},{8.0,56.0,35.168,4.396,35.168}};

		
		//PRIX SECHOIR:!!
			Double[][] sechoir1 = {{1.0,0.75,21.2,0.0,0.0,2.2078125,	0.0,0.0,2.2078125},
					{2.0,0.75,	36.0,0.0,0.0,3.8563125,0.0,	0.0,	3.8563125},
					{3.0,	0.75,	25.0,	0.0,	0.0,	1.953178125,	0.0,	0.0,	1.953178125}};

		
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
			
			double prixElec;
			double prixGaz;
			double prixDelEau;
				
		
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
				
		double[] prixEau = new double[5];
		double[] prixChauffage = new double[5];
		double[] prixMoteur = new double[5];
		double[] prixLessive = new double[5];
		double[] Total = new double[5];	
		
		double[][] prixProgramme = new double[26][6];
		for (int i=1; i<=25; i++) {
			for (int j=1; j<=5; j++) {
				if (i<=11) {
					if (j==2) {
						switch(i) {
							case 1 : prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.6+
						}
					}
					if (j==5) {
						prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+0.25*prixElec*dureeHeures[i-1]*(60/46)+
					}
				}
				if (i>=12) {
					if (j==1) {
						prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.8+
					}
					if (j==3) {
						prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*1.4+
					}
					if (j==4) {
						prixProgramme[i][j] = prixEau[1]+prixChauffage[1]+(60/46)*prixElec*dureeHeures[i-1]*0.55+
					}
				}
			}
		}
		

		
	}
}
