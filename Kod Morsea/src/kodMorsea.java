import java.util.Scanner;

public class kodMorsea {
	
	public static String aToM(String text){
		Converter c = new Converter(text.toUpperCase());
		String s = c.changeAToM();
		return s;
	}
	
	public static String mToA(String text){
		Converter c = new Converter(text);
		String s = c.changeMToA();
		return s;
	}

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String text = reader.nextLine();
		if(text.charAt(0) == '-' || text.charAt(0) == '.'){
			text = mToA(text);
			System.out.println(text);
		}
		else {
			text = aToM(text);
			System.out.println(text);
		}
		reader.close();
	}
}
