import java.util.Scanner;

public class Adventure2{
	private static int nextroom = 1;
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		
		// int nextroom = 1;
		String choice = "", yesno;

		while (nextroom != 0){

			// The Haunted House Hallway Selection
			if (nextroom == 1){
				System.out.println("\nYou are in a haunted house! Would you like to go 'upstairs' or into the 'kitchen'?");
				System.out.println("To end the adventure now, say 'end'");
				choice = keyboard.nextLine();
				userChoice(choice);
			}

			// User Decisions Upstairs
			if (nextroom == 2 ){
				System.out.println( "You're upstairs." );
				System.out.println( "You see a hallway. At the end of the hallway is the master 'bedroom'. There is also a 'bathroom' off the hallways. Where would you like to go?");
				System.out.println( "If you're too scared, go 'back'");
				choice = keyboard.nextLine();
				userChoice(choice);
			}
			
			// User has entered the Kitchen
			else if (nextroom == 3)
			{
				System.out.println("There is a long countertop with dirty dishes everywhere. Off to the side");
				System.out.println("there is, as you'd expect, a refridgerator. You may open the 'fridge' or look in a 'cabinet'");
				System.out.println("If you're too scared, go 'back'");
				choice = keyboard.nextLine();
				userChoice(choice);
			}
			
			// User at the Fridge (kitchen)
			else if (nextroom == 4)
			{
				System.out.println("Inside the refridgerator you see mouldy food. Would you like a bite?");
				yesno = keyboard.next();

				//Food poisoning
				if (yesno.equals("yes"))
				{
					System.out.println("You get a stomachache, the food is poisoned! BYE BYE.");
					break;
				}

				//Starvation
				else if (yesno.equals("no"))
				{
					System.out.println("Well, you didn't get poisoned but you die of starvation... eventually.");
					break;
				}
				else
				{
					System.out.println("Input error! Bleargh.");
				}
			}

			// User at the Cabinet (upstairs)
			else if (nextroom == 5)
			{
				System.out.println("A hidden ghoul emergences from the cabinet! Will you 'run' or 'stay'?");
				yesno = keyboard.next();
				if (yesno.equals("run"))
				{
					System.out.println("You've escaped from the haunted house! Until next time...");
					break;
				}
				else if (yesno.equals("stay"))
				{
					System.out.println("The ghoul laughs maniacally. You are captured until his dark magic for eternity.");
					break;
				}
				else
				{
					System.out.println("Input error!");
				}
			}

			// User at bedroom (upstairs)
			else if (nextroom == 6)
			{
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade.");
					System.out.println("In the back of the room, the closet door is ajar. Would you like to open the door? ['yes' or 'no']");
					yesno = keyboard.next();

					// User decides to venture into the closet
					if (yesno.equals("yes"))
						{
							System.out.println("A quick zombie emerges and bites your arm off! YOU'RE INFECTED! Looks like you're next.");
							break;
						}
					// User is afraid and returns to the Upstairs hallway
					else if (yesno.equals("no"))
						{
							System.out.println("You hear the door begin to creek and choose to runaway. Guess you're safe now. Until next time...");
							nextroom = 2;
						}
			}

			// User at bathroom (upstairs)
			else if (nextroom == 7)
			{
				System.out.println("You are in a dirty bathroom. The wallpaper is coming off. The sink is running a brown water. Suddenly you're thirsty. Do you drink it? ('yes' or 'no')");
					yesno = keyboard.next();

					// User chooses to drink dirty water (dies)
					if (yesno.equals("yes"))
						{
							System.out.println("You can't stop drinking. You burst.");
							break;
						}
					// User still dies bc this is cursed or something lol
					else if (yesno.equals("no"))
						{
							System.out.println("You die of thirst.");
							break;
						}
					else 
						{
							System.out.println("Input error!");
						}
			}
		}

		System.out.println( "\nEND." );
	}

	public static void userChoice(String choice){
		// User Chooses to go Upstairs
		if (choice.equals("upstairs")){
			nextroom = 2;
		}
		
		// User Chooses to check out the Kitchen
		else if (choice.equals("kitchen")){
			nextroom = 3;
		}
		
		// User leaves game by choice
		else if (choice.equals("end")){
			System.out.println("You chose to end the adventure and leave. Lame.");
			nextroom = 0;
		}

		// Return to Haunted House Hallway
		else if ( choice.equals("back") ){
			nextroom = 1;
		}

		// User Decisions in Bedroom (Which is located upstairs)
		else if (choice.equals("bedroom")){
			nextroom = 6;
		}

		// User ventures into the Upstairs bathroom
		else if (choice.equals("bathroom")){
			nextroom = 7;
		}

		else if (choice.equals("fridge")){
			nextroom = 4;
		}
		
		else if (choice.equals("cabinet")){
			nextroom = 5;
		}
		
		else{
			System.out.println( "ERROR." );
		}
	}
	
}