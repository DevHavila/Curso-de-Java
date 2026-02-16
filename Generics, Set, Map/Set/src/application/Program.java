package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("O HashSet é mais Rápido para o resultado, mas não garante a Ordem\n");
		
		Set <String> Has = new HashSet<>();
		
		Has.add("TV");
		Has.add("Tablet");
		Has.add("Notebook");

		System.out.println(Has.contains("Notebook"));
		
		Has.removeIf(x -> x.charAt(0) == 'T');
		
		for(String p : Has) {
			System.out.println(p);
		}
	
		System.out.println("\nO TreeSet ele ordena os Dados de forma alfabética\n");
		
		Set <String> Tree = new TreeSet<>();
		
		Tree.add("Tv");
		Tree.add("Tablet");
		Tree.add("Notebook");

		Tree.remove("Tablet");
		
		for(String p : Tree) {
			System.out.println(p);
		}
		
		System.out.println("\nO LinkedHashSet ele ordena os Dados\n");
		
		Set <String> Lhs = new LinkedHashSet<>();
		
		Lhs.add("Tv");
		Lhs.add("Tablet");
		Lhs.add("Notebook");

		Lhs.removeIf(x -> x.length() >= 3);
		
		for(String p : Lhs) {
			System.out.println(p);
		}
		
		
	}

}
