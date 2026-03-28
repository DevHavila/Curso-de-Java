package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List <Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
		
		/*
		 Implementação de Interface
		 
		  List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		*/
		
		/*
			Reference method com método estático
			
			List <String> names = list.stream().map(Product :: staticUpperCaseName).collect(Collectors.toList());
		*/
		
		/*
		 	Reference method com método não estático
		
			List <String> names = list.stream().map(Product :: nonStaticUpperCaseName).collect(Collectors.toList());
		 
		*/
		
		/*
		Function <Product, String> func = p -> p.getName().toUpperCase();
		
		
	 		Expressão Lambda declarada
	
		List <String> names = list.stream().map().collect(Collectors.toList());
	 
		 */
		
		// Expressão Lambda inline
		
		List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		 
		names.forEach(System.out::println);
		
		
	}

}
