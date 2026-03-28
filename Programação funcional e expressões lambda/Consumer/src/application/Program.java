package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List <Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));		
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));		
	
		/*
		 Implementação da Interface
		 
			list.forEach(new PriceUpdate());
		*/
		
		/*
		 Reference method com método stático
		 
			list.forEach(Product :: staticPriceUpdate);
		*/
		
		/*
		 Reference method com método não stático
		 
			list.forEach(Product :: nonStaticPriceUpdate);
		*/
		
		/*
		 	Expressão lambda declarada
		 
			double factor = 1.1;
		
			Consumer <Product> cons = p -> {
				p.setPrice(p.getPrice() * factor);
			};
		
			list.forEach(cons);
		*/
		
		//Expressão lambda inline
		
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out :: println);
		
	}

}
