
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
	}

	public static void generate_DNA(String dna){
		for (char c : dna.toCharArray()){

			// Simplified If-Else & Case switch
			System.out.print(c == 'A' ? 'T' : c== 'T' ? 'A': c== 'C' ? 'G': c== 'G' ? 'C' : "Error");
		}
		
		// Next Steps:
		// If codon matches statement input
		// Display the protein it creates

	}


}
