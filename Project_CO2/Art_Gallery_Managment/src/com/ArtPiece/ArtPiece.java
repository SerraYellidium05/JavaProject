package com.ArtPiece;

public class ArtPiece implements Comparable<ArtPiece>,Cloneable {
	private String title;
	private String artist;
	private int year;
	public ArtPiece(String title, String artist, int year) {
		this.title=title;
		this.artist=artist;
		this.year=year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compareTo(ArtPiece o) {
		return Integer.compare(this.year, o.year);
	}
	protected ArtPiece clone() throws CloneNotSupportedException{
		return (ArtPiece) super.clone();
	}
	public String toString() {
		return "Title:"+title+"Artist"+artist+", yr"+year;
	}
}
