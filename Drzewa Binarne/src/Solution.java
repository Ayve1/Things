import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static int solution(Tree root,int id){
		int k=0;
		int i=0;
		int j=0;
		int n=0;
		Tree t = root;
		List<Tree> stack = new ArrayList<Tree>();
		//sprawdzenie roota;
		if(t.id == id)
			return k;
		stack.add(t);
		i++;
		//dodanie dzieci do stosu
		k++;
		if(t.l != null)
			stack.add(t.l);
		if(t.r != null)
			stack.add(t.r);
		//przejscie po elementach stosu
		while(j != i){
			j=i;
			n=stack.size();
			while(i<n){
				t = stack.get(i);
				if(t.id == id)
					return k;
				i++;
			}
			i=j;
			//dodanie dzieci wszystkich elementow nastepnego poziomu
			k++;
			while(i<n){
				t = stack.get(i);
				if(t.l != null)
					stack.add(t.l);
				if(t.r != null)
					stack.add(t.r);
				i++;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Tree root = new Tree(10);
		root.r = new Tree(50);
		root.l = new Tree(30);
		root.l.r = new Tree(88);
		root.l.l = new Tree(74);
		root.r.l = new Tree(13);
		root.r.r = new Tree(95);
		root.r.r.r = new Tree(101);
		root.l.l.l = new Tree(100);
		root.l.l.l.l = new Tree(150);
		root.l.l.l.l.l = new Tree(200);
		root.l.l.l.l.l.l = new Tree(300);
		
		/* Test z wprowadzaniem danych:
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		System.out.println(solution(root,x));
		*/
		//Test roota
		System.out.println(solution(root, 10));
		//Test 1 poziomu
		System.out.println(solution(root, 50));
		//Test 2 poziomu
		System.out.println(solution(root, 13));
		//Test 3 poziomu
		System.out.println(solution(root, 101));
		//Test 6 poziomu
		System.out.println(solution(root, 300));
		//Test braku znalezionej wartości
		System.out.println(solution(root, 1000));
	}
}
