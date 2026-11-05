package osmanedelja;

public class zadatak2sakolokvijuma {
	
	public static String konverutujVrijeme(String vrijeme, String format,String zeljeniFormat) {
	
	int iSat = format.indexOf("HH");
	int imin = format.indexOf("MM");
    int isek = format.indexOf("SS");
    
    String sati = vrijeme.substring(iSat+2);
    String minuti = vrijeme.substring(imin+2);
    String sekundi = vrijeme.substring(isek+2);
    
    String razultat = zeljeniFormat;
    
    razultat = razultat.replace("HH",sati);
    razultat = razultat.replace("MM",minuti);
    razultat = razultat.replace("SS",sekundi);
    
    return razultat;
    
}
    @SuppressWarnings("unused")
	public static void main(String[]args) {
    	String r = konverutujVrijeme("12:20:23", "HH:MM:SS","HHh-MMmi");
    			
    }
}
