package com.TicketSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketSytem {

	private static Scanner value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> tic=new LinkedList<>();
		value = new Scanner(System.in);
		System.out.println("1:Add tickets");
		System.out.println("2:Process new Ticket");
		System.out.println("3:pending tickets");
		System.out.println("4:Exit");
		int n=value.nextInt();
		switch(n) {
		case 1:
			System.out.print("enter the tic");
			String gap=value.nextLine();
			tic.add(gap);
			break;
		case 2:
			if(!tic.isEmpty()) {
				String coll=tic.poll();
				System.out.print(coll);
			}
			else {
				System.out.print("No proccess tic");
			}
			break;
		case 3:
			if(tic.isEmpty()) {
				System.out.print("no pending tic");
			}
			else {
				for(String t:tic) {
					System.out.print(t);
				}
			}
			break;
		case 4:
			System.out.print("Exit");
		}
		
	}

}
