package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {

	private DrawPanelController drawPanelController;
	private ILine line;
	
	public LinePlotterAdapter(ILine line) {
		this.drawPanelController = ApplicationWithDrawer.getDrawPanelController();
		this.line = line;
	}
	
	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
		this.drawPanelController = drawPanelController;
		this.line = line;
	}
	
	@Override
	public void drawTo(int x, int y) {
		line.setEndCoordinates(x, y);
        drawPanelController.drawLine(line);
        line.setStartCoordinates(x, y);
	}

	@Override
	public void setPosition(int x, int y) {
		line.setStartCoordinates(x, y);
	}
	
	@Override
    public String toString() {
        return "Line Plotter Adapter";
    }

}
