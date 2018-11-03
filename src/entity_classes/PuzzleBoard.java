package entity_classes;

public class PuzzleBoard {
	
	String[][] tilelocations;
	BackgroundTile[] tiles;
	BackgroundTile selectedtile;
	
	PuzzleBoard(String[][] tilelocations, BackgroundTile[] tiles){
		this.tilelocations = tilelocations;
		this.tiles = tiles;
		this.selectedtile = null;
	}

}
