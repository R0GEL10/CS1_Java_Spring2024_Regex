/*
This Java code was written by Rogelio Guzman for Lab 15 homework 
Class: Intro to Computer Science @ Modesto Junior College Spring 2024
via Professor Edward Walsh.
Purpose of this exercise: learn and use regular expressions (regex). 
*/


import java.util.Scanner;
public class CheckExpression{

	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in); 
			
		
		while(true){
		System.out.println("Enter your first and last name:" );	
		String name = scanner.nextLine();
		
		// ?[]+ allows for last name to be optional 
		// parenthesis within expression allows for hyphenated last name
		if(name.matches("^[a-zA-Z]+ ?[a-zA-Z]+(-[a-zA-Z]+)?$")){
		System.out.println("You entered: " + name);
			break; 
		}else{
		System.out.println("Error! Please enter your first and last name. Do not use a middle initial.");
		}
		} // end name whileloop
		
		
		while(true){
		System.out.println("Enter your MJC student number (starting with W followed by numbers):" );
		String studentNumber = scanner.nextLine(); 
		
		//[Ww]brakets allow both upper and lowercase W
		if(studentNumber.matches("^[Ww]\\d+$")) {
		System.out.println("You entered: " + studentNumber);
			break;  
		}else {
		System.out.println("Error! Please ensure your MJC student ID starts with 'W' and is followed by numbers.");
		}
					
		}// end studentNumber whileloop
		
		while(true){
		System.out.println("Enter your MJC email address (ex: UserID@my.yosemite.edu):");
		String email = scanner.nextLine(); 
		if(email.matches("^\\w+@my.yosemite.edu$")){
			System.out.println("You entered: " + email);
			break; 
		} else{
		System.out.println("Error! Please ensure your MJC email address is entered correctly."); 
		}
		}// end email whileloop
		
		while(true){
		System.out.println("Enter your phone number using XXX-XXX-XXXX format:");
		String phone = scanner.nextLine(); 
		if(phone.matches("^\\d\\d\\d\\-\\d\\d\\d\\-\\d\\d\\d\\d$")){
			System.out.println("You entered: " + phone);
			break;
		} else{
			System.out.println("Error! Please ensure you follow the correct format XXX-XXX-XXXX.");
		}
					
		}// end phone number whileloop
		
		while(true){
		System.out.println("Enter your ZIP code (12345) or ZIP + 4 code (12345-1234):");
		String zip = scanner.nextLine(); 
		
		// 4+ code parenthesis within expression is optional input  
		if(zip.matches("^\\d\\d\\d\\d\\d(-\\d\\d\\d\\d)?$")){
			System.out.println("You entered: " + zip);
			break;
		} else{
			System.out.println("Error! Please ensure your ZIP code follows formats (12345) or ZIP + 4 code (12345-1234).");
		}
	
			
		} //end social security whileloop
			
		}
	}
	

