package welcomeToHybrid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		System.out.println("Hello, Welcome To Hybrid!");
		welcome obj = new welcome();
		obj.catsTask();
		//obj.gradesTask();
		//obj.hl7ParseTask();
	}
	
	private void catsTask() {
		//Create an array that can hold whatever cats and their information will be in the text file
		ArrayList<ArrayList<String>> organizedArray = new ArrayList<ArrayList<String>>(); 
		
		//Find file and location
		File file = new File("C:\\Users\\J-Dogg-PC\\git\\repository\\welcomeToHybrid\\welcome.txt");
		
		//Prepare to break down text file into arraylist (requires try/catch)
		try {
			Scanner scan = new Scanner(file);
			
			//Loop through the text file
			while(scan.hasNext()) {
				String line = scan.next();
				String[] breakdown = line.split("\\^");
				ArrayList<String> format = new ArrayList<>();
				format.add(breakdown[0]);
				format.add(breakdown[1]);
				format.add(breakdown[2]);
				//System.out.println(Arrays.toString(breakdown));
				organizedArray.add(format);
			}
			
			//Output 1 - Categorize each type of data
			int size = organizedArray.size();
			System.out.println("Cat Name: ");
			for(int i = 0; i < size; i++) {
				System.out.print((organizedArray.get(i).get(2)) + " ");
			}
			System.out.println("");
			System.out.println("Hair Length:");
			for(int i = 0; i < size; i++) {
				System.out.print((organizedArray.get(i).get(1)) + " ");
			}
			System.out.println("");
			System.out.println("Hair Color:");
			for(int i = 0; i < size; i++) {
				System.out.print((organizedArray.get(i).get(0)) + " ");
			}
			
			//Output 2 - Metrics (#'s)
			System.out.println("");
			System.out.println("");
			int t1=0, t2=0, t3=0, t4=0, t5=0, t6=0;
			
			for(int i = 0; i < size; i++) {
				if("black".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					t1++;
				} else if("black".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					t2++;
				} else if("white".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					t3++;
				} else if("white".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					t4++;
				} else if("orange".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					t5++;
				} else if("orange".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					t6++;
				}
			}
			
			System.out.println("Cats with short black hair: " + t1);
			System.out.println("Cats with long black hair: " + t2);
			System.out.println("Cats with short white hair: " + t3);
			System.out.println("Cats with long white hair: " + t4);
			System.out.println("Cats with short orange hair: " + t5);
			System.out.println("Cats with long orange hair: " + t6);
			
			
			System.out.println("");
			t1 = 1;
			
			
			//Output 3 - Display cat names in a numbered list for each category
			
			System.out.println("Cats with short black hair: ");
			for(int i = 0; i < size; i++) {
				if("black".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			t1 = 1;
			
			System.out.println("Cats with long black hair: ");
			for(int i = 0; i < size; i++) {
				if("black".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			t1 = 1;
			
			System.out.println("Cats with short white hair: ");
			for(int i = 0; i < size; i++) {
				if("white".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			t1 = 1;
			
			System.out.println("Cats with long white hair: ");
			for(int i = 0; i < size; i++) {
				if("white".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			t1 = 1;
			
			System.out.println("Cats with short orange hair: ");
			for(int i = 0; i < size; i++) {
				if("orange".equals(organizedArray.get(i).get(0)) && "shortHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			t1 = 1;
			
			System.out.println("Cats with long orange hair: ");
			for(int i = 0; i < size; i++) {
				if("orange".equals(organizedArray.get(i).get(0)) && "longHair".equals(organizedArray.get(i).get(1))) {
					System.out.println(t1 + ") " + organizedArray.get(i).get(2));
					t1++;
				}
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
