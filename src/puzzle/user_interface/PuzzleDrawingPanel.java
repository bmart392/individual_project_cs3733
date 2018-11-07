package puzzle.user_interface;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JPanel;

import puzzle.entity_classes.BackgroundTile;
import puzzle.entity_classes.PuzzleBoard;

public class PuzzleDrawingPanel extends JPanel{
	
	int tileheight;
	int tilewidth;
	int buffer;
	PuzzleBoard layout;
	
	public PuzzleDrawingPanel(PuzzleBoard layout){
		this.buffer = 10;
		this.layout = layout;
	}
	
	public int getbuffer() {
		return this.buffer;
	}
	
	public int gettileheight() {
		return this.tileheight;
	}
	
	public int gettilewidth() {
		return this.tilewidth;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int raw_height = (this.getHeight() - (6*this.buffer)) % 5;
		if (raw_height!= 0) {
			this.tileheight = ((this.getHeight() - (6*this.buffer)) - raw_height)/5;
		} else {
			this.tileheight = (this.getHeight() - (6*this.buffer));
		}
		
		int raw_width = (this.getWidth() - (6*this.buffer)) % 5;
		if (raw_width!= 0) {
			this.tilewidth = ((this.getWidth() - (5*this.buffer)) - raw_width)/5;
		} else {
			this.tilewidth = (this.getWidth() - (5*this.buffer))/4;
		}
		
		LinkedList<BackgroundTile> drawntiles = new LinkedList<BackgroundTile>();
		
		for (int index = 0; index < layout.getlengthtiles(); index++) {
			BackgroundTile currentTile = layout.gettile(index);
			if (currentTile == null || drawntiles.contains(currentTile)) { continue; }
						
			if (currentTile.gettilestatus()) { 
				g.setColor(Color.red);
			} else if (currentTile == layout.getselectedtile()) {
				g.setColor(Color.blue);
			} else {
				g.setColor(Color.gray);
			}
			
			int col = index % 4;
			int xpos = buffer * (col + 1) + (col * tilewidth);
			
			int row = (index - col) / 4;
			int ypos = buffer * (row + 1) + row * tileheight;
			
			int width = currentTile.getsizex() * tilewidth + (currentTile.getsizex() - 1) * buffer;
			int height = currentTile.getsizey() * tileheight + (currentTile.getsizey() - 1) * buffer;
			
			g.fillRect(xpos, ypos , width , height);
			
			drawntiles.add(currentTile);
		}
	}


}
