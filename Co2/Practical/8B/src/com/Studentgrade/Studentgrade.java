package com.Studentgrade;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> grade=new LinkedList<>();
		Scanner value = new Scanner(System.in);
		System.out.println("1:Add student with grades ");
		System.out.println("2:insert");
		System.out.println("3:remove");
		System.out.println("4:Exit");
		int n=value.nextInt();
		switch(n) {
		case 1:
			System.out.print("adding new student ");
			int grades=value.nextInt();
			String name=value.nextLine();
			grade.add(grades, name);
			break;
		case 2:
			System.out.print("insert at specific pos");
			int ind=value.nextInt();
			if(ind>0 && ind<grade.size()) {
				String va=value.nextLine();
				grade.add(n, va);
			}
			break;
		case 3:
			System.out.print("remove at specific pos");
			int remidx=value.nextInt();
			if(remidx>0 && remidx<grade.size()) {
				grade.remove(remidx);
			}
			break;
		case 4:
			System.out.print("Display");
			for(String t:grade) {
				System.out.print(t);
			}
			
	}

}
}
