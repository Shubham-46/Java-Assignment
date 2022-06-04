package com.question3;
import java.util.Scanner;

public enum Stadium {
	EDEN_GARDENS_STADIUM,
	WANKHEDE_STADIUM,
	CHIDAMBARAM_STADIUM,
	M_CHINNASWAMY_STADIUM;
}
class IPL{
	void homeTeamStadium(Stadium stadium) {
		switch(stadium){
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		default:
			break;
		}

		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the stadium name");
		String stadiumName=sc.next();
		IPL ipl=new IPL();
		Stadium stadium=Stadium.valueOf(stadiumName.toUpperCase());
		ipl.homeTeamStadium(stadium);
	}
}
