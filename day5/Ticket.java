package com.day5;
import java.util.Scanner;
public class Ticket {
	private int ticketId;
	private int price;
	static int avtickets;
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvtickets() {
		return avtickets;
	}
	public static void setAvtickets(int avtickets) {
		Ticket.avtickets = avtickets;
		if(Ticket.avtickets<0) {
			System.out.println("zero and negative method ");
		}
	}
	public int calculateTicketCost(int nooftickets) {
		int s=getAvtickets();
		if(s>0) {
			s=s-nooftickets;
			int total=nooftickets*getPrice();
			setAvtickets(s);
			return total;
		}else  {
			return -1;
		}
	}
	
	
}
class Main1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings");
		int n=sc.nextInt();
		System.out.println("Enter no of available tickets");
		int at=sc.nextInt();
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the price");
		int pr=sc.nextInt();
		Ticket t=new Ticket();
		t.setAvtickets(at);
		t.setTicketId(id);
		t.setPrice(pr);
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.println("Enter no of tickets:");
			int tick=sc.nextInt();
			int p=t.calculateTicketCost(tick);
			System.out.println("total amt "+p);
			System.out.println("Avilable Tickets "+t.getAvtickets());
		}
		
	}
}
