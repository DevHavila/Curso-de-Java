package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set <Integer> A = new HashSet<>();
		Set <Integer> B = new HashSet<>();
		Set <Integer> C = new HashSet<>();
		
		System.out.print("How many students for course A ? ");
		int n = sc.nextInt();
			
		for(int i = 0; i < n;i++) {
			int student = sc.nextInt();
			A.add(student);
		}
		
		System.out.print("How many students for course B ? ");
		n = sc.nextInt();
			
		for(int i = 0; i < n;i++) {
			int student = sc.nextInt();
			B.add(student);
		}
		
		System.out.print("How many students for course A ? ");
		n = sc.nextInt();
			
		for(int i = 0; i < n;i++) {
			int student = sc.nextInt();
			C.add(student);
		}
		
		Set <Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total Students: " + total.size());
		
		
	}
}
