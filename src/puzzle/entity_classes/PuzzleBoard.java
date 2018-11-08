package puzzle.entity_classes;

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
	 *      
	 *  -------------
	 * | 1  2  2  3  |
	 * | 1  2  2  3  |
	 * | 4  5  6  7  |
	 * | 4  8  9  7  |
	 * | *  10 10 *  |
	 *  -------------
	 *  
	 * starting piece configuration
	*/
	
	PuzzleBoard(LinkedList<BackgroundTile> tiles){
		this.tiles = tiles;
		this.selectedtile = null;
	}
	
	PuzzleBoard(){
		BackgroundTile piece1 = new BackgroundTile("1", 1, 2, false);
		BackgroundTile piece2 = new BackgroundTile("2", 2, 2, true);
		BackgroundTile piece3 = new BackgroundTile("3", 1, 2, false);
		BackgroundTile piece4 = new BackgroundTile("4", 1, 2, false);
		BackgroundTile piece5 = new BackgroundTile("5", 1, 1, false);
		BackgroundTile piece6 = new BackgroundTile("6", 1, 1, false);
		BackgroundTile piece7 = new BackgroundTile("7", 1, 2, false);
		BackgroundTile piece8 = new BackgroundTile("8", 1, 1, false);
		BackgroundTile piece9 = new BackgroundTile("9", 1, 1, false);
		BackgroundTile piece10 = new BackgroundTile("10", 2, 1, false);
		
		this.tiles = new LinkedList<BackgroundTile>();
		this.tiles.add(piece1);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(piece3);
		
		this.tiles.add(piece1);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(piece3);
		
		this.tiles.add(piece4);
		this.tiles.add(piece5);
		this.tiles.add(piece6);
		this.tiles.add(piece7);
		
		this.tiles.add(piece4);
		this.tiles.add(piece8);
		this.tiles.add(piece9);
		this.tiles.add(piece7);
		
		this.tiles.add(null);
		this.tiles.add(piece10);
		this.tiles.add(piece10);
		this.tiles.add(null);
		
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		
		this.selectedtile = null;
	}
	
	PuzzleBoard(int nothing){
		BackgroundTile piece1 = new BackgroundTile("1", 1, 2, false);
		BackgroundTile piece2 = new BackgroundTile("2", 2, 2, true);
		BackgroundTile piece3 = new BackgroundTile("3", 1, 2, false);
		BackgroundTile piece4 = new BackgroundTile("4", 1, 2, false);
		BackgroundTile piece5 = new BackgroundTile("5", 1, 1, false);
		BackgroundTile piece6 = new BackgroundTile("6", 1, 1, false);
		BackgroundTile piece7 = new BackgroundTile("7", 1, 2, false);
		BackgroundTile piece8 = new BackgroundTile("8", 1, 1, false);
		BackgroundTile piece9 = new BackgroundTile("9", 1, 1, false);
		BackgroundTile piece10 = new BackgroundTile("10", 2, 1, false);
		
		this.tiles = new LinkedList<BackgroundTile>();
		this.tiles.add(piece1);
		this.tiles.add(piece5);
		this.tiles.add(piece6);
		this.tiles.add(piece3);
		
		this.tiles.add(piece1);
		this.tiles.add(piece8);
		this.tiles.add(piece9);
		this.tiles.add(piece3);
		
		this.tiles.add(piece4);
		this.tiles.add(piece10);
		this.tiles.add(piece10);
		this.tiles.add(piece7);
		
		this.tiles.add(piece4);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(piece7);
		
		this.tiles.add(null);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(null);
		
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		
		this.selectedtile = null;
	}
	
	public void resettiles() {
		BackgroundTile piece1 = new BackgroundTile("1", 1, 2, false);
		BackgroundTile piece2 = new BackgroundTile("2", 2, 2, true);
		BackgroundTile piece3 = new BackgroundTile("3", 1, 2, false);
		BackgroundTile piece4 = new BackgroundTile("4", 1, 2, false);
		BackgroundTile piece5 = new BackgroundTile("5", 1, 1, false);
		BackgroundTile piece6 = new BackgroundTile("6", 1, 1, false);
		BackgroundTile piece7 = new BackgroundTile("7", 1, 2, false);
		BackgroundTile piece8 = new BackgroundTile("8", 1, 1, false);
		BackgroundTile piece9 = new BackgroundTile("9", 1, 1, false);
		BackgroundTile piece10 = new BackgroundTile("10", 2, 1, false);
		
		this.tiles = new LinkedList<BackgroundTile>();
		this.tiles.add(piece1);
		this.tiles.add(piece5);
		this.tiles.add(piece6);
		this.tiles.add(piece3);
		
		this.tiles.add(piece1);
		this.tiles.add(piece8);
		this.tiles.add(piece9);
		this.tiles.add(piece3);
		
		this.tiles.add(piece4);
		this.tiles.add(piece10);
		this.tiles.add(piece10);
		this.tiles.add(piece7);
		
		this.tiles.add(piece4);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(piece7);
		
		this.tiles.add(null);
		this.tiles.add(piece2);
		this.tiles.add(piece2);
		this.tiles.add(null);
		
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		this.tiles.add(null);
		
		this.selectedtile = null;
	}
	
	public int getlengthtiles() {
		return this.tiles.size();
	}
	
	public void settiles(LinkedList<BackgroundTile> tiles){
		this.tiles = tiles;;
	}
	
	public LinkedList<BackgroundTile> gettiles(){
		return this.tiles;
	}
	
	public BackgroundTile gettile(int index) {
		return this.tiles.get(index);
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
		if (!this.selectedtile.gettilestatus()) {
			return false;
		}
		for (int i = 0; i < cords.size(); i++) {
			if (!(cords.get(i) == 17 || cords.get(i) == 18 || cords.get(i) == 21 || cords.get(i) == 22)) {
				return false;
			}			
		}
		return true;

	}
	
	public boolean ismoveillegal(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		for (int i = 0; i < newcords.size(); i++) {
			boolean case2a = newcords.get(i) > 19;
			boolean case2b = this.tiles.get(oldcords.get(i)).gettilestatus();
			boolean case2 = (case2a && case2b ); 
			
			if(case2) {
				continue;
			} else {
				boolean case1 = newcords.get(i) < 0;
				boolean case3 = (this.tiles.get(newcords.get(i)) != null && this.tiles.get(newcords.get(i)) != this.selectedtile);
				if (case1 || case3) {
					return true;
				}		
			}
		}
		return false;

	}
	
	public void setselectedtilelocation(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		for (int i = 0; i < oldcords.size(); i++) {
			tiles.set(oldcords.get(i), null);						
		}
		for (int i = 0; i < newcords.size(); i++) {
			tiles.set(newcords.get(i), selectedtile);						
		}
	}

}
