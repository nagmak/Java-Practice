
import java.util.Scanner;

public class DNAReplication{
	
	public static void main(String[] args){

		System.out.println("  DNA REPLICATION MACHINE");
		System.out.println("------------------------------");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a single stranded DNA");
		String dna = keyboard.next();
		generate_DNA(dna);
		System.out.print('\n');
		// if there is a letter a, then generate a t
		// if there is a letter c, generate a g, etc
		// needs to go through the entire string and look for single letters
		//error checking
	}

	public static void generate_DNA(String dna){
		for (char c : dna.toCharArray()){
			//simplified if-else & case switch
			System.out.print(c == 'A' ? 'T' : c== 'T' ? 'A': c== 'C' ? 'G': c== 'G' ? 'C' : "Error");
		}
		
		//if codon matches somethig in the statement input
		//display the protein it creates?

	}


}
