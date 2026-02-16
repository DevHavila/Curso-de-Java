package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		/* Como eu fiz
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Map <String, Integer> vote = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				String userName = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				vote.put(userName, vote.getOrDefault(userName, 0) + votes);
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(String key : vote.keySet()) {
			System.out.println(key + ": " + vote.get(key));
		}
		
		sc.close();
		
		Como o professor Resolveu!!!
		
		*/
		
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
