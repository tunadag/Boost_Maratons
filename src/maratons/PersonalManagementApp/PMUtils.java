package maratons.PersonalManagementApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PMUtils {
private static Scanner scan = new Scanner(System.in);
	
	
	public static void header(String title) {
		title = "Personal Management APPLICATION";
		int           len = title.length();
		StringBuilder row = new StringBuilder("");
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
		}
		System.out.println("\n\n\t\t" + row);
		System.out.println("\t\t** " + title.toUpperCase() + " **");
		System.out.println("\t\t" + row + "\n");
	}
	
	private static void showMenuItems(HashMap<Integer, String> menuItems) {
		// Set<Entry<Integer, String>> items = menuItems.entrySet();
		ArrayList<Integer> keys = new ArrayList<Integer>(menuItems.keySet());
		Collections.sort(keys);
		// for (int i = 0; i < keys.size(); i++) {
		// int key = keys.get(i);
		// System.out.println("\t(" + key + ") .... " + menuItems.get(key).trim());
		// }
		for (Integer key : keys) {
			System.out.println("\t(" + key + ") .... " + menuItems.get(key).trim());
		}
		System.out.println();
	}
	
	public static int menu(HashMap<Integer, String> menuItems) {
		boolean correctAnswer = false;
		int     selection     = -1;
		do {
			showMenuItems(menuItems);
			selection     = getUserSelection();
			correctAnswer = evaluateAnswer(menuItems, selection);
		} while (!correctAnswer);
		return selection;
	}
	
	public static int readInt(String query) {
		int retVal = Integer.MIN_VALUE;
		showQuery(query);
		try {
			retVal = scan.nextInt();
		}
		catch (Exception e) {
			System.out.println("Please enter a number");
		}
		finally {
			scan.nextLine();
		}
		return retVal;
	}
	
	private static void showQuery(String query) {
		System.out.print("\t" + query + ": ");
	}
	
	private static int getUserSelection() {
		return readInt("Please make your choice ");
	}
	
	private static boolean evaluateAnswer(HashMap<Integer, String> menuItems, int selection) {
		return menuItems.containsKey(selection);
	}
	
	public static boolean wantToEnd(String question, String negativeAnswer) {
		boolean retVal = true;
		showQuery(question);
		String answer = scan.next();
		retVal = answer.equalsIgnoreCase(negativeAnswer);
		scan.nextLine();
		return !retVal;
	}
	

}
