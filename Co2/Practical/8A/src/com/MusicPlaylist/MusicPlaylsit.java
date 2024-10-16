package com.MusicPlaylist;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylsit {

	private static Scanner value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> music=new LinkedList<>();
		value = new Scanner(System.in);
		System.out.println("1:add song");
		System.out.println("2:remove back");
		System.out.println("3:rearrange");
		System.out.println("4:display");
		int n=value.nextInt();
		switch(n) {
		case 1:
			System.out.print("Add new song");
			String newsong=value.nextLine();
			music.add(newsong);
			break;
		case 2:
			System.out.print("give the song to remove it");
			String nosong=value.nextLine();
			music.remove(nosong);
			break;
		case 3:
			String moveSong = value.nextLine();
            if (music.contains(moveSong)) {
                System.out.print("Enter the new position (0 to " + (music.size() - 1) + "): ");
                int newPos = value.nextInt();
                music.remove(moveSong);
                music.add(newPos, moveSong);
            } else {
                System.out.println("Song not found in the playlist.");
            }
			break;
		case 4:
			System.out.print("display of all songs");
			for(String t:music) {
				System.out.print(t);
			}
		}

	}

}
