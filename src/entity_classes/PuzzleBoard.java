package entity_classes;

public class PuzzleBoard {
	
	String[][] tilelocations;
	BackgroundTile[] tiles;
	
	PuzzleBoard(String[][] tilelocations, BackgroundTile[] tiles){
		this.tilelocations = tilelocations;
		this.tiles = tiles;
	}

}
