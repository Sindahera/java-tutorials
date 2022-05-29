package io.github.sindahera.controlstatements;

public class SwitchStatement {

	public static void main(String[] args) {
		 
		int month = 6;
		
		String monthString;
		
		switch (month) {
		case 1:
			monthString = "january";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		default:
			monthString = "Invalid month";
			break;
			
		}
		
		System.out.println(monthString);

	}

}
