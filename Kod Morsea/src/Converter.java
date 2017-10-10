
public class Converter {
	
	String s;
	public Converter(){
		s = "";
	}
	public Converter(String text){
		s = text;
	}
	
	public String changeAToM(){
		String text;
		StringBuilder sB = new StringBuilder();
		for(int i=0; i<s.length(); i++){
			char x = s.charAt(i);
			sB.append(aToM(x));
			sB.append(" ");
		}
		text = sB.toString();
		return text;
	}
	
	public String changeMToA(){
		String[] parts = s.split(" ");
		int n = parts.length;
		String text;
		StringBuilder sB = new StringBuilder();
		for(int i=0; i<n; i++){
			sB.append(mToA(parts[i]));
		}
		
		text = sB.toString();
		return text;
	}
	
	public String aToM(char x){
		switch(x){
		case 'A':
			return ".-";
		case 'B':
			return "-...";
		case 'C':
			return "-.-.";
		case 'D':
			return "-..";
		case 'E':
			return ".";
		case 'F':
			return "..-.";
		case 'G':
			return "--.";
		case 'H':
			return "....";
		case 'I':
			return "..";
		case 'J':
			return ".---";
		case 'K':
			return "-.-";
		case 'L':
			return ".-..";
		case 'M':
			return "--";
		case 'N':
			return "-.";
		case 'O':
			return "---";
		case 'P':
			return ".--.";
		case 'Q':
			return "--.-";
		case 'R':
			return ".-.";
		case 'S':
			return "...";
		case 'T':
			return "-";
		case 'U':
			return "..-";
		case 'W':
			return ".--";
		case 'V':
			return "...-";
		case 'X':
			return "-..-";
		case 'Y':
			return "-.--";
		case 'Z':
			return "--..";
		case '1':
			return ".----";
		case '2':
			return "..---";
		case '3':
			return "...--";
		case '4':
			return "....-";
		case '5':
			return ".....";
		case '6':
			return "-....";
		case '7':
			return "--...";
		case '8':
			return "---..";
		case '9':
			return "----.";
		case '0':
			return "-----";
		default:
			return "";
		}
	}
	
	public char mToA(String text){
		if(text.equals(".-"))
			return 'A';
		if(text.equals("-..."))
			return 'B';
		if(text.equals("-.-."))
			return 'C';
		if(text.equals("-.."))
			return 'D';
		if(text.equals("."))
			return 'E';
		if(text.equals("..-."))
			return 'F';
		if(text.equals("--."))
			return 'G';
		if(text.equals("...."))
			return 'H';
		if(text.equals(".."))
			return 'I';
		if(text.equals(".---"))
			return 'J';
		if(text.equals("-.-"))
			return 'K';
		if(text.equals(".-.."))
			return 'L';
		if(text.equals("--"))
			return 'M';
		if(text.equals("-."))
			return 'N';
		if(text.equals("---"))
			return 'O';
		if(text.equals(".--."))
			return 'P';
		if(text.equals("--.-"))
			return 'Q';
		if(text.equals(".-."))
			return 'R';
		if(text.equals("..."))
			return 'S';
		if(text.equals("-"))
			return 'T';
		if(text.equals("..-"))
			return 'U';
		if(text.equals(".--"))
			return 'W';
		if(text.equals("...-"))
			return 'V';
		if(text.equals("-..-"))
			return 'X';
		if(text.equals("-.--"))
			return 'Y';
		if(text.equals("--.."))
			return 'Z';
		if(text.equals(".----"))
			return '1';
		if(text.equals("..---"))
			return '2';
		if(text.equals("...--"))
			return '3';
		if(text.equals("....-"))
			return '4';
		if(text.equals("....."))
			return '5';
		if(text.equals("-...."))
			return '6';
		if(text.equals("--..."))
			return '7';
		if(text.equals("---.."))
			return '8';
		if(text.equals("----."))
			return '9';
		if(text.equals("-----"))
			return '0';
		return ' ';
	}
	
}
