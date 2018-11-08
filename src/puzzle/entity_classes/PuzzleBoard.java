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
		BackgroundTile piece1 = new BackgroundTile(1, 2, false);
		BackgroundTile piece2 = new BackgroundTile(2, 2, true);
		BackgroundTile piece3 = new BackgroundTile(1, 2, false);
		BackgroundTile piece4 = new BackgroundTile(1, 2, false);
		BackgroundTile piece5 = new BackgroundTile(1, 1, false);
		BackgroundTile piece6 = new BackgroundTile(1, 1, false);
		BackgroundTile piece7 = new BackgroundTile(1, 2, false);
		BackgroundTile piece8 = new BackgroundTile(1, 1, false);
		BackgroundTile piece9 = new BackgroundTile(1, 1, false);
		BackgroundTile piece10 = new BackgroundTile(2, 1, false);
		
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
	
	// Creates a board that is one move away from winning.
	PuzzleBoard(int nothing){
		BackgroundTile piece1 = new BackgroundTile(1, 2, false);
		BackgroundTile piece2 = new BackgroundTile(2, 2, true);
		BackgroundTile piece3 = new BackgroundTile(1, 2, false);
		BackgroundTile piece4 = new BackgroundTile(1, 2, false);
		BackgroundTile piece5 = new BackgroundTile(1, 1, false);
		BackgroundTile piece6 = new BackgroundTile(1, 1, false);
		BackgroundTile piece7 = new BackgroundTile(1, 2, false);
		BackgroundTile piece8 = new BackgroundTile(1, 1, false);
		BackgroundTile piece9 = new BackgroundTile(1, 1, false);
		BackgroundTile piece10 = new BackgroundTile(2, 1, false);
		
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
		
		this.tiles = new PuzzleBoard().gettiles();
		
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
		
		boolean isTileWinnerCase = this.selectedtile.isThisTileWinner();
		boolean isTileInWinningPositionsCase = cords.contains(21) && cords.contains(22);
		
		// Check if selected tile is capable of moving to win the game and has coordinates in the winning locations, if true then it is the winning move
		if (isTileWinnerCase && isTileInWinningPositionsCase) {	return true;} else { return false; }		
	}
	
	public boolean ismoveillegal(LinkedList<Integer> newcords, LinkedList<Integer> oldcords) {
		for (int i = 0; i < newcords.size(); i++) {
			
			int newcord = newcords.get(i);
			
			boolean isTileAboveBoardCase = newcord < 0;
			boolean isTileBelowBoardCase = newcord > 19;
			boolean isCellFullCase = isFullWithOther(newcord);
			
			if (isTileAboveBoardCase || isTileBelowBoardCase || isCellFullCase) {
				return true;	
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
	
	boolean isFullWithOther(int i) {
		return tiles.get(i) != null && tiles.get(i) != selectedtile;
	}

}
