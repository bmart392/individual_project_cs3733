package puzzle.entity_classes;

import junit.framework.TestCase;

public class TestBackgroundTile extends TestCase{
	
	public void testTileWinner() {
		BackgroundTile tile = new BackgroundTile(2,2,true);
		
		assertTrue (tile.isThisTileWinner() == true);
	}
	
	public void testGetX() {
		BackgroundTile tile = new BackgroundTile(2,2,true);
		
		assertEquals (2, tile.getsizex());
	}
	
	public void testGetY() {
		BackgroundTile tile = new BackgroundTile(2,2,true);
		
		assertEquals (2, tile.getsizey());
	}
	
}
