package Abstraction;

import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;

public class Excel{
	private String path;
	private String sheetName;
	private Donnees donnees;

    public Excel(String path, String sheetName, Donnees donnees) {
		this.path = path;
		this.sheetName = sheetName;
		this.donnees = donnees;
	}

	public void Exporter(){
		String[] pieces = {"ALESE 1 place",
				"ALESE 2 places",
				"ALESE ENFANT",
				"ALEZE DE TAIE",
				"BLOUSE ",




				"BONNET",
				"CASQUETTE",
				"CASQUETTES AVEC COQUES",
				"CHASUBLES",
				"CHAUSSETTES DE FOOTBALL",
				"CHEMISES",

				"COMBINAISON",


				"COTTE TRAVAIL",
				"COUETTE 1 PLACE",
				"COUETTE 2 PLACES",
				"COUETTE ENFANT",
				"COUPE VENT",
				"COUSSINS",
				"COUVERTURE 1 PLACE",
				"COUVERTURE 2 PLACES",

				"COUVERTURE D'ENFANT",
				"CRAVATTE",
				"DESSUS DE LIT",


				"DRAP HOUSSE 1 PLACE",
				"DRAP HOUSSE 2 PLACES",
				"DRAP HOUSSE ENFANT",
				"DRAP PLAT 1 PLACE",
				"DRAP PLAT 2 PLACES",
				"DRAP PLAT ENFANT",
				"DRAPEAU",
				"DUVET",

				"FRANGE",
				"GANT",
				"GILET SAUVETAGE",
				"HOUSSE COUETTE 1 PLACE",
				"HOUSSE COUETTE ENFANT",
				"HOUSSE DE COUETTE 2 PLACES",
				"HOUSSE DE COUSSIN",
				"HOUSSE MATELAS 1 PLACE",
				"HOUSSE MATELAS 2 PLACES",
				"KIMONO",
				"MAILLOT ",
				"NAPPE 12 COUVERTS",
				"NAPPE 14 COUVERTS",
				"NAPPE 18 COUVERTS",
				"NAPPE 8 COUVERTS",
				"PANTALON",
				"PANTALON DE CUISINE",

				"PANTALON DE SURVETEMENT",
				"PANTALON DE TOILE",
				"PANTALON DE TRAVAIL",
				"PANTALON GRAISSE",
				"PANTALON GRAND FROID",
				"PARKA",
				"PEIGNOIR",
				"PELUCHE AU KG",
				"POLO",

				"RIDEAU DE DOUCHE M²",
				"RIDEAU M²",
				"RIDEAU PLASTIFIE M²",

				"SAC A DOS",
				"SAC LINGE",
				"SAC MEDICAL",
				"SERPILLERE",
				"SERVIETTE DE TABLE",
				"SERVIETTE DE TOILETTE",
				"SHORT",
				"SORTIE DE BAIN",

				"SWEAT SHIRT",
				"TABLIER OU A BAVETTE",
				"TABLIER BAS DE CUISINE",
				"TABLIER DE PEINTURE",
				"TAIE OREILLER",
				"TAIE TRAVERSIN",
				"TAPIS DE BAIN",
				"TEE SHIRT",
				"TORCHONS",
				"TROUSSE DE TOILETTE",
				"VESTE DE TRAVAIL",
				"VESTE DE SURVEMENT",
				"VESTE D'ESCRIME",
				"CHEMISE ENFANT REPASSAGE",
				"CHEMISE REPASSAGE",
				"HOUSSE COUETTE REPASSAGE 2 PLACES",
				"JUPE REPASSAGE",
				"TAIE REPASSAGE",
				"TEE SHIRT ENFANT REPASSAGE",
				"TEE SHIRT REPASSAGE",
				"TORCHON ROULEAU",
		};
        try {
        	java.text.DecimalFormat df = new java.text.DecimalFormat("0.###");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet(this.sheetName);  

            HSSFRow rowhead = sheet.createRow((short)0);
            for (int i=1; i<=5; i++) {
            	rowhead.createCell(i).setCellValue("Machine" + (i) + "(€)");
            }
            
            rowhead.createCell(0).setCellValue("Pièce");
            HSSFRow row = sheet.createRow((short)1);
            row.createCell(0).setCellValue(pieces[this.donnees.valeurPiece]);
            for (int p=1; p<=5; p++) {
                	row.createCell(p).setCellValue(df.format(donnees.ResultatParMachine[p-1]));         	
            }


            FileOutputStream fileOut = new FileOutputStream(this.path);
            workbook.write(fileOut);
            fileOut.close();
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}