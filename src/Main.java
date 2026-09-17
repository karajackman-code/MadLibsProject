/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		System.out.println("State an adjective that starts with s and ends with y");
		String adjs1 = in.nextLine();
		System.out.println("Give me a noun that starts with s");
		String nouns1 = in.nextLine();
		System.out.println("Give me an adjective");
		String adj = in.nextLine();
		System.out.println("Name a sport");
		String sport1 = in.nextLine();
		System.out.println("Name a famous person");
		String person1 = in.nextLine();
		System.out.println("State a whole number (anything over 10)");
		int price1 = in.nextInt();
		in.nextLine();
		System.out.println("Give me an adjective");
		String adj1 = in.nextLine();
		System.out.println("State a type of shoe");
		String shoe1 = in.nextLine();
		System.out.println("Name an authority figure in your life");
		String person2 = in.nextLine();
		System.out.println("Give me a food");
		String food1 = in.nextLine();
		System.out.println("State an adjective");
		String adj2 = in.nextLine();
		System.out.println("State a past tense verb");
		String verb1 = in.nextLine();
		System.out.println("Give me a noun");
		String noun1 = in.nextLine();
		System.out.println("State a verb");
		String verb2 = in.nextLine();
		
		System.out.println("I was strolling through my local mall, when something in the window of the "+adjs1+" "+nouns1+" store caught my eye. In the window was a "+adj+" display for "+person1+"'s");
		System.out.println("new "+sport1+" sneakers for only $"+price1+".99! Looking down at my "+adj1+" "+shoe1+", I knew that I neeeded to buy "+person1+"'s new shoes." );
		in.close();//Don't forget to clean up after yourselves!
	}

}
