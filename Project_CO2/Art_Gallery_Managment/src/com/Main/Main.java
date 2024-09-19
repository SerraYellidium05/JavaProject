package com.Main;

import java.util.Collections;

import com.ArtGallery.ArtGallery;
import com.ArtPiece.ArtPiece;
import com.ArtPieceComparator.ArtPieceComparator;

public class Main {

	public static void main(String[] args) {
		try {
			 ArtPiece art1 = new ArtPiece("Starry Night", "Vincent van Gogh", 1889);
	         ArtPiece art2 = new ArtPiece("Mona Lisa", "Leonardo da Vinci", 1503);
	         ArtGallery gallery = new ArtGallery();
	         gallery.addArtPiece(art1);
	         gallery.addArtPiece(art2);
	         System.out.println("Original Gallery:");
	         gallery.displayCollection();
	         Collections.sort(gallery.collection);
	         System.out.println("Galary sorted by yr: ");
	         gallery.displayCollection();
	         Collections.sort(gallery.collection,new ArtPieceComparator());
	         System.out.println("Gallery sorted by Title: ");
	         gallery.displayCollection();
	         ArtGallery clonedGallery=gallery.clone();
	         System.out.println("Cloned gallery ");
	         clonedGallery.displayCollection();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
