package entity_classes;

public class PuzzleBoard {
	
	String[][] tilelocations;
	BackgroundTile[] tiles;
	BackgroundTile selectedtile;
	BackgroundTile winningtile;
	int nummoves;
	
	PuzzleBoard(String[][] tilelocations, BackgroundTile[] tiles, BackgroundTile winningtile){
		this.tilelocations = tilelocations;
		this.tiles = tiles;
		this.selectedtile = null;
		this.winningtile = winningtile;
		this.nummoves = 0;
	}

}
