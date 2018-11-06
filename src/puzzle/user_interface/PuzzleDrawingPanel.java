package puzzle.user_interface;

import java.awt.Color;
import java.awt.Graphics;

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
		this.tileheight = (this.getHeight() - (6*this.buffer))/5;
		this.tilewidth = (this.getWidth() - (5*this.buffer))/4;
		this.layout = layout;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int index = 0; index < layout.getlengthtiles(); index++) {
			BackgroundTile currentTile = layout.gettile(index);
			if (currentTile.gettilestatus()) {
				g.setColor(Color.red);
			} else if (currentTile == layout.getselectedtile()) {
				g.setColor(Color.blue);
			} else {
				g.setColor(Color.gray);
			}
			
			g.fillRect(buffer + ((index % 4) * tilewidth),buffer + ((index % 5) * tileheight), currentTile.getsizex() * (tilewidth - (2 * buffer)), currentTile.getsizey() *(tileheight - (2 * buffer)));
		}
	}


}
