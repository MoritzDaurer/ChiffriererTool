
public class Chiffrieren 

{
	public String chiffrierenCA (String inputtext, int schlüssel)
	{
		String ergVer= "";
		for(int i = 0; i<inputtext.length(); i++)
		{
			
			char x = inputtext.charAt(i);
			int wert = (int) x;
			wert = wert + schlüssel;
			char neu = (char)wert;
			ergVer = ergVer + neu;
			
		}
		return ergVer;
		
	}
		
	public String dechiffrierenCA (String ergVer, int schlüssel)
	{
		String text = ergVer;
		String ergEnt = "";
		System.out.println(ergVer);
		
		for(int i = 0; i<text.length(); i++)
		{
			char x = text.charAt(i);
			int wert = (int) x;
			wert = wert - schlüssel;
			char neu = (char)wert;
			ergEnt = ergEnt + neu;
			
		}
		return ergEnt;
		
	}
}
