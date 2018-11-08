package puzzle.entity_classes;

import java.util.LinkedList;

import junit.framework.TestCase;

public class TestPuzzleBoard extends TestCase {
	
	public void testReset() {
		PuzzleBoard board = new PuzzleBoard(0);
		
		board.resettiles();
		
		assertTrue (board.gettile(1).isThisTileWinner());	
	}
	
	public void testLengthTiles() {
		PuzzleBoard board = new PuzzleBoard();
		
		assertEquals (board.tiles.size(), board.getlengthtiles());	
	}
	
	public void testGetSelected() {
		PuzzleBoard board = new PuzzleBoard();
		
		assertEquals (null, board.getselectedtile());	
	}
	
	public void testSetTile() {
		PuzzleBoard board = new PuzzleBoard();
		
		board.setselectedtile(0);
		
		assertEquals (board.getselectedtile(), board.tiles.get(0));
	}
	
	public void testGetTileLocation() {
		PuzzleBoard board = new PuzzleBoard();
		
		LinkedList<Integer> cords = new LinkedList<Integer>();
		cords.add(0);
		cords.add(4);
		
		board.setselectedtile(0);
		
		assertEquals (cords.get(0), board.gettilelocation().get(0));
		assertEquals (cords.get(1), board.gettilelocation().get(1));
	}
	
	public void testSetTiles() {
		PuzzleBoard board1 = new PuzzleBoard();
		PuzzleBoard board2 = new PuzzleBoard(0);		
	
		board2.settiles(board1.tiles);
		
		assertEquals (board1.tiles, board2.tiles);
	}
	
	public void testIsWinningMove() {
		PuzzleBoard board1 = new PuzzleBoard(0);
		
		board1.setselectedtile(13);
		
		LinkedList<Integer> newcord = new LinkedList<Integer>();
		newcord.add(17);
		newcord.add(18);
		newcord.add(21);
		newcord.add(22);
		
		board1.setselectedtilelocation(newcord, board1.gettilelocation());
		
		assertTrue (board1.iswinningmove(board1.gettilelocation()));
	}
	
	public void testIsMoveIllegal() {
		PuzzleBoard board1 = new PuzzleBoard();

		board1.setselectedtile(17);
		
		LinkedList<Integer> newcord1 = new LinkedList<Integer>();
		newcord1.add(-1);
		newcord1.add(20);

		LinkedList<Integer> newcord2 = new LinkedList<Integer>();
		newcord2.add(1);
		newcord2.add(5);
				
		LinkedList<Integer> newcord3 = new LinkedList<Integer>();
		newcord2.add(18);
		newcord2.add(19);
		
		assertTrue (board1.ismoveillegal(newcord1));
		assertTrue (board1.ismoveillegal(newcord2));
		assertFalse (board1.ismoveillegal(newcord3));
	}
	
	public void testSetSelectedLocation() {
		PuzzleBoard board1 = new PuzzleBoard();
		
		board1.setselectedtile(17);
		
		LinkedList<Integer> newcord = new LinkedList<Integer>();
		newcord.add(18);
		newcord.add(19);
			
		board1.setselectedtilelocation(newcord, board1.gettilelocation());
		
		assertEquals (newcord, board1.gettilelocation());
	}
	
	public void testIsFullOther() {
		PuzzleBoard board1 = new PuzzleBoard();
		
		board1.setselectedtile(16);		
		
		assertTrue (board1.isFullWithOther(1)); // Test true && true
		assertFalse (board1.isFullWithOther(19)); // Test false && true
		assertFalse (board1.isFullWithOther(16)); // Test false && false
		
		board1.setselectedtile(3);
		assertFalse (board1.isFullWithOther(3)); // Test true && false	
	}
}
