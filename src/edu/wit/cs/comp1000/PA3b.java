package edu.wit.cs.comp1000;

/**
 * PA3b
 * @author Miles Macchiaroli
 *
 */
import java.util.Scanner; //Link Scanner Utility
public class PA3b {//Begin Class
/**
 * This Program Calculates the Astrological Sign
* Based on the user's birthday
* @param args
*/
	public static void main(String[] args) {//Begin Main String execution
		Scanner input = new Scanner(System.in); //Call for Scanner Utility
	//INIT VARS
		int month, day;
		String sign="sign";
	//Begin Request
		System.out.printf("Enter your birth month (1-12): ");
		month = input.nextInt(); // request month
		System.out.printf("Enter your birth day (1-31): ");
		day = input.nextInt(); // request day
	//End Request
	//Begin Input Check
		if ((month < 1) || (month > 12)){
		System.out.printf("Month must be between 1 and 12!%n");
		System.exit(0);
	}
		else if ((day < 1) || (day > 31)){
			System.out.printf("Day must be between 1 and 31!%n");
			System.exit(0);
		}
	//End Input Check
	//Begin tedious sign declaration
	
	//MONTHS
		if (month == 1) {//JANUARY
			if (day < 20) {
				sign=" Capricorn";
			}
			else {
				sign="n Aquarius";
			}
		}
		if (month == 2) {//FEB
			if (day < 19) {
				sign="n Aquarius";
			}
			else {
				sign=" Pisces";
			}	
		}
		if (month == 3) {//MAR
			if (day < 21) {
				sign=" Pisces";
			}
			else {
				sign="n Aries";
			}	
		}
		if (month == 4) {//APRIL
			if (day < 20) {
				sign="n Aries";
			}
			else {
				sign=" Taurus";
			}	
		}
		if (month == 5) {//MAY
			if (day < 21) {
				sign=" Taurus";
			}
			else {
				sign=" Gemini";
			}	
		}
		if (month == 6) {//JUNE
			if (day < 22) {
				sign=" Gemini";
			}
			else {
				sign=" Cancer";
			}	
		}
		if (month == 7) {//JULY
			if (day < 23) {
				sign=" Cancer";
			}
			else {
				sign=" Leo";
			}	
		}
		if (month == 8) {//AUG
			if (day < 23) {
				sign=" Leo";
			}
			else {
				sign=" Virgo";
			}	
		}
		if (month == 9) {//SEP
			if (day < 23) {
				sign=" Virgo";
			}
			else {
				sign=" Libra";
			}	
		}
		if (month == 10) {//OCT
			if (day < 23) {
				sign=" Libra";
			}
			else {
				sign=" Scorpio";
			}	
		}
		if (month == 11) {//NOV
			if (day < 22) {
				sign=" Scorpio";
			}
			else {
				sign=" Sagittarius";
			}	
		}
		if (month == 12) {//DEC
			if (day < 22) {
				sign=" Sagittarius";
			}
			else {
				sign=" Capricorn";
			}	
		}
//END tedious sign declaration
	//OUTPUT
		System.out.printf("You are a%s!%n", sign);
		System.out.printf("[Insert super cool (totally original) horoscope for the user that is a%s]%n", sign);
		
}}
