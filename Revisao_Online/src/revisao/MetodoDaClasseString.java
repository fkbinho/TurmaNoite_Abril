package revisao;

public class MetodoDaClasseString {
	public static void main(String[] args) {
		String original = "Hoje, SEGUNDA é uma SEGUNDA-feira chuvosa    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.substring(11);
		String s04 = original.substring(11, 18);
		String s05 = original.trim();
		String s06 = original.replace('a', 'A');
		String s07 = original.replace("UN", "NU");
		
		System.out.println("Original: " + "-" + original + "-");
		System.out.println("toLowerCase(): " + "-" + s01 + "-");
		System.out.println("toUpperCase(): " + "-" + s02 + "-");
		System.out.println("substring(4): " + "-" + s03 + "-");
		System.out.println("substring(11, 18): " + "-" + s04 + "-");
		System.out.println("trim(): " + "-" + s05 + "-");
		System.out.println("replace('a', 'A'): " + "-" + s06 + "-");
		System.out.println("replace(\"UN\", \"NU\"): " + "-" + s07 + "-");
		
		
		
		System.out.println("--------");
		char sexo = 'm';
		System.out.println(String.format("Valor %c  %d  %f", sexo, 10, 11.5));
	}
}
