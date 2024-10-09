package com.NumberPrinter;
import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class NumberPrinter extends Thread {
	private static Thread thread4;
	private static Thread thread3;
	private static Thread thread2;
	private static Thread thread6;
	private static Thread thread5;
	public class PrintTwo implements Runnable {

		@Override
		public void run() {
				int i;
				for(i=0;i<15;i++) {
					if(i%2==0) {
						System.out.println("by 2");
					}
				}
			}
		}
	public class PrintThree implements Runnable {

		@Override
		public void run() {
			int i;
			for(i=0;i<15;i++) {
				if(i%3==0) {
					System.out.println("by 3");
				}

		}
		}
	}

	static class Printfour implements Runnable{
		public void run() {
			int i;
			for(i=0;i<15;i++) {
				if(i%4==0) {
					System.out.println("by 4");
				}
			}
		}
	}
	static class Printfive implements Runnable{
		public void run() {
			int i;
			for(i=0;i<15;i++) {
				if(i%5==0) {
					System.out.println("by 5");
				}
			}
		}
	}
	static class Number implements Runnable{
		public void run() {
			int i;
			for(i=0;i<15;i++) {
				if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
					System.out.println("no number divisible by 2 ,3,4,5");
				}
			}
		}
	}
	public static void main(String[] args) {
//		setThread2(new Thread(new PrintTwo()));
		setThread3(new Thread(new PrintThree()));
		setThread4(new Thread(new Printfour()));
		setThread5(new  Thread(new Printfive()));
		setThread6(new Thread(new  Number()));
		
		thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        
		
		

	}
	public static Thread getThread4() {
		return thread4;
	}
	public static void setThread4(Thread thread4) {
		NumberPrinter.thread4 = thread4;
	}
	public static Thread getThread3() {
		return thread3;
	}
	public static void setThread3(Thread thread3) {
		NumberPrinter.thread3 = thread3;
	}
	public static Thread getThread2() {
		return thread2;
	}
	public static void setThread2(Thread thread2) {
		NumberPrinter.thread2 = thread2;
	}
	public static Thread getThread6() {
		return thread6;
	}
	public static void setThread6(Thread thread6) {
		NumberPrinter.thread6 = thread6;
	}
	public static Thread getThread5() {
		return thread5;
	}
	public static void setThread5(Thread thread5) {
		NumberPrinter.thread5 = thread5;
	}

}