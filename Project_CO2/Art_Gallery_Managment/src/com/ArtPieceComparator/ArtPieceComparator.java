package com.ArtPieceComparator;
import java.util.Comparator;

import com.ArtPiece.ArtPiece;
public class ArtPieceComparator implements Comparator<ArtPiece>{

	@Override
	public int compare(ArtPiece o1, ArtPiece o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}
	

}
