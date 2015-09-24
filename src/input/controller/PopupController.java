package input.controller;

import input.view.PopupDisplay;

public class PopupController 
{
	private PopupDisplay myPopups;
		
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in: " + temp);
		
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -999999;
		}
		
		myPopups.showResponse("You typed " + myAge);
		
		String temp = myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myPopups.showResponse("You typed" + myWeight);
		
		myTestThing = new Thingy(myName, myAge,myWeight);
	}
		
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean is double = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an double - bad value will be used");
		}
		
		return isDouble;
	}
}
	
