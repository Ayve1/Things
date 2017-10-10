
public class Palindrom {
	
	public static void isPalindrom(int[] tab){
		int l = 0;
		if(tab[3] == 0){
			if(tab[0] == tab[2]){
				l = 100* tab[2]+ 10* tab[1]+ tab[0];
				isResult(l);
			}
		}else{
			if(tab[0] == tab[3] && tab[1] == tab[2]){
				l = 1000* tab[3]+ 100* tab[2]+ 10* tab[1]+ tab[0];
				isResult(l);
			}
		}
	}
	
	public static Boolean isResult(int l){
		int k = 0;
		for(int i=10;i<100;i++)
			for(int j=i;j<100;j++){
				k = i*j;
				if(l == k){
					System.out.println(l+" = "+i+" * "+j);
					return true;
				}
				else if(l < k){
					j=100;
				}
			}
		return false;
	}

	public static Boolean search(){
		// zakres 100 - 9801
		int[] tab = {0, 0, 1, 0};
		//od 100 do 999
		for(int s=1; s<10; s++){
			tab[2]=s;
			for(int d=0; d<10; d++){
				tab[1]=d;
				for(int j=0; j<10; j++){
					tab[0]=j;
					isPalindrom(tab);
				}
			}
		}
		//od 1000 do 9800
		for(int t=1; t<10; t++){
			tab[3]=t;
			for(int s=0; s<10; s++){
				tab[2]=s;
				if(tab[3]==9 && tab[2]==8)
					return true;
				for(int d=0; d<10; d++){
					tab[1]=d;
					for(int j=0; j<10; j++){
						tab[0]=j;
						isPalindrom(tab);
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		search();
	}

}
