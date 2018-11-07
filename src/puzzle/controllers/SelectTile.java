package puzzle.controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import puzzle.entity_classes.PuzzleModel;
import puzzle.user_interface.PuzzleBoundary;
import puzzle.user_interface.PuzzleDrawingPanel;

public class SelectTile extends MouseAdapter{
	
	PuzzleModel model;
	PuzzleBoundary boundary;
	
	public SelectTile(PuzzleModel model, PuzzleBoundary boundary){
		this.model = model;
		this. boundary = boundary;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
				
		int thistile = this.convertpixelstoindex(e.getX(),e.getY());
		
		this.model.selecttile(thistile);
		
		this.boundary.repaint();
	}
	
	public int convertpixelstoindex(int x, int y) {
		PuzzleDrawingPanel view = boundary.getPuzzleDrawingPanel();
		
		int col = (x - view.getbuffer()) / (view.getbuffer() + view.gettilewidth());
		
		int row = (y - view.getbuffer()) / (view.getbuffer() + view.gettileheight());
		
		return 4 * row + col;
	}

}
