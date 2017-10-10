import java.io.*;
import java.util.*;

public class PersonalData {
	String imie;
	String nazwisko;
	GregorianCalendar dataUrodzenia;
	int numerTelefonu;
	
	public PersonalData(){
		imie = "";
		nazwisko = "";
		dataUrodzenia = new GregorianCalendar(2000,01,01);
		numerTelefonu = 0;
	}
	public PersonalData(String i, String n, int y, int m, int d){
		imie = i;
		nazwisko = n;
		dataUrodzenia = new GregorianCalendar(y,m,d);
		numerTelefonu = 0;
	}
	public PersonalData(String i, String n, int y, int m, int d, int nT){
		imie = i;
		nazwisko = n;
		dataUrodzenia = new GregorianCalendar(y,m,d);
		numerTelefonu = nT;
	}
	public void showPD(int w){
		System.out.println("Imie = "+imie);
		System.out.println("Nazwisko = "+nazwisko);
		System.out.println("Wiek = "+w);
		System.out.println("Telefon = "+numerTelefonu);
	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(new File("dane.txt"));
		String buf = "";
		String dane[] = new String[4];
		String data[] = new String[3];
		dane[3] = null;
		List<PersonalData> people = new ArrayList<PersonalData>();
		PersonalData person;
		int y,m,d,nT;
		int l=0;
		while(s.hasNextLine()){
			buf = s.nextLine();
			dane = buf.split(",");
			l = dane.length;
			data = dane[2].split("-");
			y = Integer.parseInt(data[0]);
			m = Integer.parseInt(data[1]);
			d = Integer.parseInt(data[2]);
			if(l == 4){
				nT = Integer.parseInt(dane[3]);
				person = new PersonalData(dane[0],dane[1],y,m,d,nT);
				people.add(person);
			} else {
				person = new PersonalData(dane[0],dane[1],y,m,d);
				people.add(person);
			}
		}
		s.close();
		int year = 2017;
		int max = 0;
		int wiek = 0;
		int index = 0;
		nT = 0;
		for(int i=0;i<people.size();i++)
			if(people.get(i).numerTelefonu != 0){
				wiek = year - people.get(i).dataUrodzenia.get(Calendar.YEAR);
				if(wiek > max){
					max = wiek;
					index = i;
				}
			}
		System.out.println("Ilosc uzytkownikow: " + people.size());
		System.out.println("Uzytkownik najstarszy z telefonem:");
		people.get(index).showPD(max);
		
		
	}

}
