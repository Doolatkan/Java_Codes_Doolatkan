package day27_arrays_part4;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {
		
		/*String[][] teams = new String[2][4];
		
		teams[0][0] = "Mike";
		teams[0][1] = "Tonny";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";
		teams[1][1] = "Emmy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";*/
		
		String[][] teams = {  {"Mike","Tonny","Smith","Evan"},   {"David","Emmy","John","Ryan"}   };
		
		System.out.println("Number of teams: " + teams.length);
		System.out.println("Number of people in first team: " + teams[0].length);
		System.out.println("Number of people in second team: " + teams[1].length);
		System.out.println("Players of first team: " + teams[0][0]+", "+ teams[0][1]+", "+ teams[0][2]+", "+ teams[0][3]+".");
		System.out.println("Players of second team: " + teams[1][0]+", "+ teams[1][1]+", "+ teams[1][2]+", "+ teams[1][3]+".");
		
	}

}
