package edu.iis.powp.command;

public class ShapeFactory {

	public static PlotterCommand getRectangleCommand() {
		
		ComplexCommand rectCommand = new ComplexCommand();
		
		rectCommand.addCommand(new CommandSetPosition(-100, 100));
		rectCommand.addCommand(new CommandDrawLineToPosition(100, 100));
		rectCommand.addCommand(new CommandDrawLineToPosition(100, -100));
		rectCommand.addCommand(new CommandDrawLineToPosition(-100, -100));
		rectCommand.addCommand(new CommandDrawLineToPosition(-100, 100));
		
		return rectCommand;
	}

	public static PlotterCommand getTriangleeCommand() {
		
		ComplexCommand triangleCommand = new ComplexCommand();
		
		triangleCommand.addCommand(new CommandSetPosition(0, -100));
		triangleCommand.addCommand(new CommandDrawLineToPosition(100, 100));
		triangleCommand.addCommand(new CommandDrawLineToPosition(-100, 100));
		triangleCommand.addCommand(new CommandDrawLineToPosition(0, -100));
		
		return triangleCommand;
	}
	
}
