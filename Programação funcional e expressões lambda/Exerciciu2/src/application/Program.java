package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String caminho = sc.nextLine();
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			List <Employee> list = new ArrayList<>();
			
			String linha = br.readLine();			
			while (linha != null) {
				String [] path = linha.split(",");
				list.add(new Employee(path[0], path[1],Double.parseDouble(path[2])));
				linha = br.readLine();
			}
			
			Comparator <String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List <String> names = list.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getGmail())
					.sorted()
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			

			double sum = list.stream()
					.filter(p -> p.getName()
					.startsWith("M"))
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name stats with 'M':" + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
