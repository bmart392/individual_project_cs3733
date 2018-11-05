package entity_classes;

import java.util.LinkedList;

public class PuzzleBoard {
	
	LinkedList<BackgroundTile> tiles;
	BackgroundTile selectedtile;
	
	/* ----- Tile Board Layout within array -----
	 * Board is laid out in a 4 x 5 grid, the index of the object within the tiles array corresponds to the location of the tile on the board.
	 * Tiles are stored at multiple points on the board, to represent their size.
	 * 
	 *  -------------
	 * | 0  1  2  3  |
	 * | 4  5  6  7  |
	 * | 8  9  10 11 | 
	 * | 12 13 14 15 |
	 * | 16 17 18 19 |
	 *  -------------
	 *      21 22    --- winning row 
	*/
	
	PuzzleBoard(LinkedList<BackgroundTile> tiles){
		this.tiles = tiles;
		this.selectedtile = null;
	}
	
	public BackgroundTile getselectedtile() {
		return this.selectedtile;
	}
	
	public void setselectedtile(int newtile) {
		this.selectedtile = tiles.get(newtile);		
	}
	
	public LinkedList<Integer> gettilelocation() {
		LinkedList<Integer> tilelocations = new LinkedList<Integer>();
		
		for ( int i = 0; i < this.tiles.size(); i++ )
			if( tiles.get(i) == this.selectedtile) {
				tilelocations.add(i);
			}
		return tilelocations;
	}
	
	public boolean iswinningmove(LinkedList<Integer> cords) {
		for (int i = 0; i < cords.size(); i++) {
			if (!(cords.get(i) == 17 || cords.get(i) == 18 || cords.get(i) == 21 || cords.get(i) == 22)) {
				return false;
			}			
		}
		return true;

	}
	
	public boolean ismoveillegal(LinkedList<Integer> cords) {
		for (int i = 0; i < cords.size(); i++) {
			if (cords.get(i) < 0 || cords.get(i) > 19 || (this.tiles.get(cords.get(i)) != null)) {
				return false;
			}			
		}
		return true;

	}
	
	public void setselectedtilelocation(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		for (int i = 0; i < newcords.size(); i++) {
			tiles.set(newcords.get(i), selectedtile);						
		}
		for (int i = 0; i < oldcords.size(); i++) {
			tiles.remove(oldcords.get(i));						
		}
	}

}
