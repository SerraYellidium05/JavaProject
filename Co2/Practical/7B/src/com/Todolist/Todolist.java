package com.Todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todolist {

	private static Scanner value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> todo =new ArrayList<>();
		value = new Scanner(System.in);
		todo.add("red");
		todo.add("yellow");
		todo.add("orange");
		todo.add("white");
		System.out.println("1: to addd");
		System.out.println("2: to update");
		System.out.println("3: to remove");
		System.out.println("4: to display");
		System.out.print("\n");
		int n=value.nextInt();
		switch(n) {
		case 1:
			System.out.print("enter the value to add");
			String entry=value.nextLine();
			todo.add(entry);
		    break;
		case 2:
			System.out.print("enter the index");
			int ind=value.nextInt();
			if(ind>0 && ind<todo.size()) {
				System.out.print("enter the value");
				String putit=value.nextLine();
				todo.set(ind, putit);
				break;
			}
		case 3:
			System.out.print("Enter the index to remove");
			int time=value.nextInt();
			if(time>0 && time<todo.size()) {
				todo.remove(time);
			}
			break;
		case 4:
			System.out.print("display the values");
			for(int i=0;i<todo.size();i++) {
				System.out.print(i+" "+todo.get(i));	
			}
		}
	}
}
