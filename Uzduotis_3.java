public class Uzduotis_2
{
   public static void main(String[] args)
   {
    int[][] matrix = {
	{1, 2, 3, 4, 5},
	{10, 20, 30, 40, 50},
	{100, 200, 300, 400, 500}
    };
	
	int eil = 0;
	int stulp = 0;
	int eilSuma = 0;
	int eilSumuSuma = 0;
	int stulpSuma = 0;
	int stulpSumuSuma = 0;

System.out.println("Duotas masyvas int[][] matrix = {");
System.out.println("{1, 2, 3, 4, 5},");
System.out.println("{10, 20, 30, 40, 50},");
System.out.println("{100, 200, 300, 400, 500}");
System.out.println("};");
System.out.println();

	for (eil = 0; eil < matrix.length; eil++) { // einam per eilutes
	    eilSuma = 0; /// nunulinam eilutes elementu suma, kitaip susdes antra prie pirmos ir t.t.
        for (stulp = 0; stulp < matrix[eil].length; stulp++) { //einam per eilutes elementus
			eilSuma += matrix[eil][stulp]; // sumuojam eilutes elementus
		}
		System.out.println("Eilutės " + eil + " elementų suma: " + eilSuma);
		eilSumuSuma = eilSumuSuma + eilSuma;
	}
	   System.out.println("Visų eilucių elementų suma yra lygi: " + eilSumuSuma);
	   System.out.println();
	

    // Einam per stulpelius
    // laikom kad eiluciu ilgiai vienodi
    for (stulp = 0; stulp < matrix[0].length; stulp++) {
		stulpSuma = 0;
         for (eil = 0; eil < matrix.length; eil++) {
            stulpSuma += matrix[eil][stulp];
        }
        System.out.println("Stulpelio " + stulp + " elementų suma: " + stulpSuma);
		stulpSumuSuma = stulpSumuSuma + stulpSuma;
    }
    System.out.println("Visų stulpelių elementų suma yra lygi: " + stulpSumuSuma);
	
  }
}