// Package for use with commercial applications. I am using jetbrains as there is no business need for this right now.
package com.jetbrains;

/* Import swing class called JOptionPane from javax. This allows me to bring up option pane for dialog as seen in
   my main method. */
import javax.swing.JOptionPane;

/* Begin Starbase13HangarBayLanding class. This is creating my own personal class called Starbase13HangarBayLanding, allowing custom steps be made
   rather than relying on premade classes such as JOptionPane, LocalDate, Etc. */
public class Starbase13HangarBayLanding
{
	// Begin main, where all program steps are taken and run.
	public static void main(String[] args)
	{
        /* Brings up a dialog pane that outputs the string entered below and sets user input as variable "name" and
           stores it for later use. */
		String name = JOptionPane.showInputDialog("HAL: 'My name is Heuristacally Programmed Algorithmic Computer! You can " +
				"call me HAL for short. What is your name?'");

		// Basic println statement, but includes /n to drop down a line, as well as calling the entered name in the middle.
		System.out.println("\nHAL: 'Identity confirmed. Thank you " + name + ". You will be arriving at Starbase 13 " +
				"momentarily.'");

		// Begin storytelling, using println statements that outputs the strings I've designated below.
		System.out.println("\nThe over-friendly computer voice fades away with a quiet beep.");
		System.out.println("The window covers hum quietly as they all rise at once automatically.");
		System.out.println("The vast expanse and reflective light from Earth is what's seen first as the blinds open. " +
				"This makes you extremely nervous to say the least.");
		System.out.println("After a minute or so, you notice your destination coming into view.");
		System.out.println("Printed in large, stencil like numbers on the side of the structure is the number 13.");
		System.out.println("'This must be Starbase 13', you think to yourself.");
		System.out.println("The station is absolutely massive and covered in all sorts of devices I couldn't even " +
				"begin to explain.");
		System.out.println("Surprisingly enough, the color is very grey which was a boring choice.");
		System.out.println("The tender docks smoothly with Starbase 13 near a large group of solar panels which provide" +
				" power to the base.");
		System.out.println("Being in the back of the tender, you wait patiently for other passengers to depart.");
		System.out.println("Finally. Your turn. You exit the transpo ship and enter the hangar bay...\n\n");

		// Hangar bay assignment and storytelling begins.
		System.out.println("Upon entering the large hangar space, you notice the diverse cultures and ship types aboard.");
		System.out.print("The first thing that catches your eye is an alien life form. It has ");

		// Lifeform objects.
		// Create the lifeformOne object from the Lifeform class and sets the description.
		Lifeform lifeformOne = new Lifeform("blue skin and feelers coming from multiple extremities.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		lifeformOne.printDescription();

		System.out.println("As this sparks your interest, you begin taking in all of the other life forms in the bay. ");
		System.out.print("Another alien life form you notice has ");

		// Create the lifeformTwo object from the Lifeform class and sets the description.
		Lifeform lifeformTwo = new Lifeform("red skin and horns growing from their head like a demon.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		lifeformTwo.printDescription();

		System.out.print("A third alien ");

		// Create the lifeformThree object from the Lifeform class and sets the description.
		Lifeform lifeformThree = new Lifeform("looks like it's completely made of stone.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		lifeformThree.printDescription();

		System.out.print("A fourth alien has ");

		// Create the lifeformFour object from the Lifeform class and sets the description.
		Lifeform lifeformFour = new Lifeform("grey skin and large black eyes, just like they always" +
				" talked about on television and movies.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		lifeformFour.printDescription();

		System.out.print("The last alien race has ");

		// Create the lifeformFive object from the Lifeform class and sets the description.
		Lifeform lifeformFive = new Lifeform("blond hair and looks just like we do but plastic. Strange.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		lifeformFive.printDescription();

		System.out.println("There were all types of life forms roaming about. After the initial shock, the spaceships" +
				" catch your attention.");
		System.out.println("There were 5 different ship types as well, likely for the 5 separate races.\nThere was:");

		// Ship objects.
		// Create the shipOne object from the Spaceship class and sets the description.
		Spaceship shipOne = new Spaceship("A white one with blue stripes.");
		// Uses the printDescription method to print the description given from the above object creation.
		shipOne.printDescription();

		// Create the shipTwo object from the Spaceship class and sets the description.
		Spaceship shipTwo = new Spaceship("A blue one covered in green dots.");
		// Uses the printDescription method to print the description given from the above object creation.
		shipTwo.printDescription();

		// Create the shipThree object from the Spaceship class and sets the description.
		Spaceship shipThree = new Spaceship("A chrome orb with no attributable features.");
		// Uses the printDescription method to print the description given from the above object creation.
		shipThree.printDescription();

		// Create the shipFour object from the Spaceship class and sets the description.
		Spaceship shipFour = new Spaceship("A dull silver disc type craft.");
		// Uses the printDescription method to print the description given from the above object creation.
		shipFour.printDescription();

		// Create the shipFive object from the Spaceship class and sets the description.
		Spaceship shipFive = new Spaceship("A militaristic one that looks like a Blackbird military craft.\n");
		// Uses the printDescription method to print the description given from the above object creation.
		shipFive.printDescription();

		System.out.println("You stare in awe at the sights a moment longer and your story continues...");
	}
	// End main.
}
// End Starbase13HangarBayLanding class.