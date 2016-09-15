package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> commands = new ArrayList<>();
	
	public void addCommand(PlotterCommand command) {
		commands.add(command);
	}
	
	@Override
	public void execute(IPlotter plotter) {
		for (PlotterCommand command : commands) {
			command.execute(plotter);
		}
	}

}
