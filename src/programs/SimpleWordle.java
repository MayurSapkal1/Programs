package programs;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*; 
public class SimpleWordle { 

	public static void main(String args[]) { 
		String f = ""; 
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random(); 

		String arr[] = {}; 

		try
		{
			arr = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\git\\Programs\\code\\src\\words.txt"))).split(" ");

		}catch(Exception e)
		{
			System.out.println("Error 404: File \"words.txt\" not found");
			System.exit(404);
		}

		int rand_int1 = rand.nextInt((int)(Math.random()*arr.length)); 
		f = arr[rand_int1]; 
		System.out.println("Let's play Wordle!"); 
		System.out.println("Enter the words.You have only 6 tries"); 
		int i, j; 
		String z = ""; 
		for (i = 1; i < 7; i++) { 
			String str = sc.nextLine(); 
			str = str.toUpperCase(); 
			if (str.length() > 5 || str.length() < 5) { 
				System.out.println("Your guess must be 5 letters in length. Guess again:"); 
				str = sc.nextLine(); 
				str = str.toUpperCase(); 
			} 
			String x = ""; 
			for (j = 0; j < str.length(); j++) { 
				x = ""; 
				char ch = str.charAt(j); 

				Boolean check = f.contains(Character.toString(ch));

				if (check && str.indexOf(ch) == f.indexOf(ch)) { 
					x =x+ Character.toUpperCase(ch) + " "; 

				} else if (check &&  str.indexOf(ch) != f.indexOf(ch)) { 
					x =x+ Character.toLowerCase(ch) + " "; 

				} else if (!check) { 
					x = x+"_ "; 
				} 
				z =z+  x  ;
			} 
			System.out.println("Guess #"+i+": "+str.toUpperCase()); 
			System.out.println(z);
			z = ""; 
			if (str.equalsIgnoreCase(f)) { 
				System.out.println("Congrats! You guessed today's Wordle!");  
				System.exit(0); 
			} 
		} 
		System.out.println("Sorry, not today! Answer: "  + f); 

	} 
} 