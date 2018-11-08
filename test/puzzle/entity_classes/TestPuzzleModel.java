package puzzle.entity_classes;

import java.util.LinkedList;

import junit.framework.TestCase;

public class TestPuzzleModel extends TestCase{
	
	public void testGetMoves() {
		PuzzleModel m = new PuzzleModel();
		
		assertEquals (0, m.getnummoves());
	}
	
	public void testGetLayout() {
		PuzzleModel m = new PuzzleModel();
		
		assertEquals (m.currentpuzzle, m.getcurrentlayout());
	}
	
	public void testIncreaseMoves() {
		PuzzleModel m = new PuzzleModel();
		
		m.increasemovecount();
		
		assertEquals (1, m.getnummoves());
	}
	
	public void testResetPuzzle() {
		PuzzleModel m1 = new PuzzleModel();
		PuzzleModel m2 = m1;
		
		m1.currentpuzzle = new PuzzleBoard(0);
		m1.resetpuzzle();
		
		assertEquals (m2.getcurrentlayout(), m1.getcurrentlayout());
	}
	
	public void testIsTileSelected() {
		PuzzleModel m1 = new PuzzleModel();
		PuzzleModel m2 = new PuzzleModel();

		m1.currentpuzzle.setselectedtile(1);
		
		
		assertTrue (m1.isatileselected());
		assertFalse (m2.isatileselected());
	}
	
	public void testGetCurrentLocation() {
		PuzzleModel m1 = new PuzzleModel();

		m1.currentpuzzle.setselectedtile(0);
		
		LinkedList<Integer> cord = new LinkedList<Integer>();
		cord.add(0);
		cord.add(4);
		
		assertEquals (cord, m1.getcurrenttilelocation());
	}

	public void testIsMoveIllegal() {
		PuzzleModel m1 = new PuzzleModel();
		
		
		m1.currentpuzzle.setselectedtile(17);
	
		LinkedList<Integer> newcord1 = new LinkedList<Integer>();
		newcord1.add(-1);
		newcord1.add(20);

		LinkedList<Integer> newcord2 = new LinkedList<Integer>();
		newcord2.add(18);
		newcord2.add(19);
	
		assertTrue (m1.ismoveillegal(newcord1));
		assertFalse (m1.ismoveillegal(newcord2));
	}
	
	public void testIsWinning() {
		PuzzleModel m1 = new PuzzleModel();
		m1.currentpuzzle = new PuzzleBoard(0);
		
		m1.currentpuzzle.setselectedtile(13);
		
		LinkedList<Integer> newcord = new LinkedList<Integer>();
		newcord.add(17);
		newcord.add(18);
		newcord.add(21);
		newcord.add(22);
		
		m1.currentpuzzle.setselectedtilelocation(newcord, m1.getcurrenttilelocation());
		
		assertTrue (m1.iswinningmove(m1.getcurrenttilelocation()));
	}
	

	public void testSetSelectedTileLocation() {
		PuzzleModel m1 = new PuzzleModel();
		
		m1.currentpuzzle.setselectedtile(17);
		
		LinkedList<Integer> newcord = new LinkedList<Integer>();
		newcord.add(18);
		newcord.add(19);
			
		m1.setselectedtilelocation(newcord, m1.currentpuzzle.gettilelocation());
		
		assertEquals (newcord, m1.currentpuzzle.gettilelocation());
	}
	
	public void testSetSelectedIndex() {
		PuzzleModel m1 = new PuzzleModel();
		
		m1.selecttile(17);
		
		LinkedList<Integer> newcord = new LinkedList<Integer>();
		newcord.add(17);
		newcord.add(18);
		
		assertEquals (newcord, m1.currentpuzzle.gettilelocation());
	}
}
