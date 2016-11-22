
public class UebungOhneArrays {



	public static void main(String[] args) {

		int anzahlEins = 0;
		int anzahlZwei = 0;
		int anzahlDrei = 0;
		int anzahlVier = 0;
		int anzahlFuenf = 0;
		int anzahlSechs = 0;

		for (int i=1; i<=50000000; i++)
		{
			int wurf = Zufall.getZufallInt(1,6);
			
			if (wurf == 1)
			{
				anzahlEins++;
			}
			if (wurf == 2)
			{
				anzahlZwei++;
			}
			if (wurf == 3)
			{
				anzahlDrei++;
			}
			if (wurf == 4)
			{
				anzahlVier++;
			}
			if (wurf == 5)
			{
				anzahlFuenf++;
			}
			if (wurf == 6)
			{
				anzahlSechs++;
			}
		}
		
		System.out.println(anzahlEins);
		System.out.println(anzahlZwei);
		System.out.println(anzahlDrei);
		System.out.println(anzahlVier);
		System.out.println(anzahlFuenf);
		System.out.println(anzahlSechs);
	}

}
