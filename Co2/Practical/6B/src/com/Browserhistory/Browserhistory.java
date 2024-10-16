package com.Browserhistory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Browserhistory {

	private static Scanner value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> backstack=new ArrayDeque<>();
		Deque<String> forwardstack=new ArrayDeque<>();
		String currentPage = "Home Page";
		System.out.println("1:new page");
		System.out.println("2:Go back");
		System.out.println("3:Go forward");
		System.out.println("4:Exit");
		value = new Scanner(System.in);
		int n=value.nextInt();
		switch(n) {
		case 1:
			System.out.print("enter new page");
			String newpage=value.nextLine();
			backstack.push(currentPage);
			currentPage=newpage;
			forwardstack.clear();
			break;
		case 2:
			System.out.print("going back");
			if(!backstack.isEmpty()) {
				forwardstack.push(currentPage);
				currentPage=backstack.pop();
			}
			else {
				System.out.print("no back possible");
			
			}
			break;
		case 3:
			System.out.print("Go forward");
			if(!forwardstack.isEmpty()) {
				backstack.push(currentPage);
				currentPage=backstack.pop();
			}
			else {
				System.out.print("no forward possible");
			
			}
			break;
	}

}
}
