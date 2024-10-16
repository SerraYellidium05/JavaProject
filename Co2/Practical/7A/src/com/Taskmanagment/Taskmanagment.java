package com.Taskmanagment;

import java.util.ArrayList;
import java.util.Scanner;

public class Taskmanagment {

	private static Scanner value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> task=new ArrayList<>();
		value = new Scanner(System.in);
		task.add("abcd");
		task.add("apple");
		task.add("mango");
		task.add("kiwi");
		task.add("orange");
		task.add("roughe");
		
		System.out.println("1: to addd");
		System.out.println("2: to update");
		System.out.println("3: to remove");
		System.out.println("4: to display");
		System.out.print("\n");
		int n=value.nextInt();
		value.nextLine();
		switch(n){
			case 1:
				System.out.print("enter the value to add");
				String entry=value.nextLine();
				task.add(entry);
			    break;
			case 2:
				System.out.print("enter the index");
				int ind=value.nextInt();
				if(ind>0 && ind<task.size()) {
					System.out.print("enter the value");
					String putit=value.nextLine();
					task.set(ind, putit);
					break;
				}
			case 3:
				System.out.print("Enter the index to remove");
				int time=value.nextInt();
				if(time>0 && time<task.size()) {
					task.remove(time);
				}
				break;
			case 4:
				System.out.print("display the values");
				for(int i=0;i<task.size();i++) {
					System.out.print(i+" "+task.get(i));	
				}
		}
		}
}


