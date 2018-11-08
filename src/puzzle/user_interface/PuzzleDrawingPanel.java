package puzzle.user_interface;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

		this.tileheight = (this.getHeight() - (7*this.buffer))/6;
		
		this.tilewidth = (this.getWidth() - (5*this.buffer))/4;
		
		LinkedList<BackgroundTile> drawntiles = new LinkedList<BackgroundTile>();
		
		for (int index = 0; index < layout.getlengthtiles(); index++) {
			BackgroundTile currentTile = layout.gettile(index);
			if (currentTile == null || drawntiles.contains(currentTile)) { continue; }
						
			if (currentTile.isThisTileWinner()) { 
				g.setColor(Color.red);
			} else {
				g.setColor(Color.gray);
			} if (currentTile == layout.getselectedtile()) {
				g.setColor(Color.blue);
			} 
			
			int col = index % 4;
			int xpos = buffer * (col + 1) + (col * tilewidth);
			
			int row = (index - col) / 4;
			int ypos = buffer * (row + 1) + row * tileheight;
			
			int width = currentTile.getsizex() * tilewidth + (currentTile.getsizex() - 1) * buffer;
			int height = currentTile.getsizey() * tileheight + (currentTile.getsizey() - 1) * buffer;
			
			g.fillRect(xpos, ypos , width , height);
			//g.drawRect(0 , 0, width, height);
			
			drawntiles.add(currentTile);
		}
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.green);
		g2.drawRect(0 , 0, this.getWidth() - 1, this.getHeight() - (int)(1.5 * buffer) - tileheight);
		
		g2.setColor(Color.black);
		g2.drawLine((int)(1.5 * buffer) + tilewidth, this.getHeight() - (int)(1.5 * buffer) - tileheight, (int)(3.5 * buffer) + 3 * tilewidth, this.getHeight() - (int)(1.5 * buffer) - tileheight);
	}


}
