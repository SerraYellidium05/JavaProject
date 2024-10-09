package com.ArtGallery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ArtPiece.ArtPiece;

public class ArtGallery implements Cloneable, Iterable<ArtPiece> {
    public List<ArtPiece> collection;
    private int currentIndex;

    public ArtGallery() {
        this.collection = new ArrayList<>();
        this.currentIndex = 0;
    }

    public void addArtPiece(ArtPiece artPiece) {
        collection.add(artPiece);
    }

    public void displayCollection() {
        for (ArtPiece artPiece : collection) {
            System.out.println(artPiece);
        }
    }
    public Iterator<ArtPiece> iterator() {
        return extracted(); 
    }

	private Iterator<ArtPiece> extracted() {
		Iterator<ArtPiece> iterator2 = (Iterator<ArtPiece>) this;
		Iterator<ArtPiece> iterator = iterator2;
		return iterator;
	}

    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    public ArtPiece next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        return collection.get(currentIndex++);
    }

    @Override
	public ArtGallery clone() throws CloneNotSupportedException {
        ArtGallery clonedGallery = (ArtGallery) super.clone();
        clonedGallery.collection = new ArrayList<>(this.collection);
        return clonedGallery;
    }
}
