import java.util.Scanner;

public class mechanism {
	
	public static Boolean funkcja(String text){
		int k=0, i=0;
		while(i<text.length()){
			switch(text.charAt(i)){
			case '(':
				k++;
				break;
			case ')':
				k--;
				break;
			}
			i++;
			if(k<0)
				break;
		}
		if(k==0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		/*	Test z wprowadzaniem linii tekstu:
		Scanner reader = new Scanner(System.in);
		String text = reader.nextLine();
		System.out.println(funkcja(text));
		*/
		//Przykłady z zadania
		System.out.println("(a(c) = "+funkcja("(a(c)") );
		System.out.println(")b  = "+funkcja(")b") );
		System.out.println("(b(s)) = "+funkcja("(b(s))"));
		//Długi tekst
		String s = "ALKSGJ(ASLKGJASLGKJSA sakflfasgdsgj;lakgDJSGLKSDJG(sgkladsgj))gkdsljgksd()gjdsklgjdslg(dslgkjdslgkjdslgksjdlg)gjdksgjl           ()()";
		System.out.println(s+" = "+funkcja(s));
		//Zamknięcie bez otwarcia z poprawna liczba nawiasow
		s = "() )(";
		System.out.println(s+" = "+funkcja(s));
		//Poprawny przypadek
		s = "(((((((((((((((((()))))))))))))))()())))";
		System.out.println(s+" = "+funkcja(s));
		
	}
}
