import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		System.out.println("TIC TAC TOE GAME");
		System.out.println("----------------");
		initBoard();
		displayBoard();
		int user =1, count =0;

		while (user!=0){
			while (count<8){

				if (user ==1){
					System.out.print("'O', choose your location (row, col): ");
					makeSelection(1);
					count++;
					if (checkWinner(1) == true){
						user = 0;
						break;
					}
					else{
						user = 2;
					}
					
				}
				if (user ==2){
					System.out.print("'X', choose your location (row, col): ");
					makeSelection(2);
					count++;
					if (checkWinner(2) == true){
						user = 0;
						break;
					}
					else{
						user = 1;
					}
				}
			}
				
			System.out.print("'O', choose your location (row, col): ");
			makeSelection(1);
			System.out.println("END GAME.");
			user = 0;
		}

		// Checks for a tie
		if (count == 8 && checkWinner(user) == false){
			System.out.println("It's a tie!");
			user = 0;
		}
	}

	//Asks for user input to update board
	public static void makeSelection(int user){
		Scanner keyboard = new Scanner(System.in);
		int selRow = keyboard.nextInt();
		int selCol = keyboard.nextInt();
		updateBoard(selRow, selCol, user);
		return;
	} 

	public static boolean checkWinner(int user){
		char tic = '\0'; //initialize
		boolean win = false;
		if (user == 1){
			tic = 'O';
		}

		if (user == 2){
			tic = 'X';
		}
		

		if (board[0][0] == tic && board[0][1] == tic && board[0][2] == tic){
			System.out.print("User " + tic + " wins!");
			win = true;
		}

		else if (board[1][0] == tic && board[1][1] == tic && board[1][2] == tic){
			System.out.print("User " + tic + " wins!");
			win = true;
		}

		else if (board[2][0] == tic && board[2][1] == tic && board[2][2] == tic){
			System.out.print("User " + tic + " wins!");
			win = true;
		}

		else if (board[0][0] == tic && board[1][1] == tic && board[2][2] == tic){
			System.out.print("User " + tic + " wins!");
			win = true;
		}

		else if (board[0][2] == tic && board[1][1] == tic && board[2][0] == tic){
			System.out.print("User " + tic + " wins!");
			win = true;
		}

		return win;
	}

	//Initialize Board
	public static void initBoard(){
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}

	//Display an empty board
	public static void displayBoard(){
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	//Display Updating Game Board
	public static void updateBoard(int selRow, int selCol, int user){
		for (int r =0; r<3; r++){
			System.out.print("\t"+r+" ");
			for (int c=0; c<3; c++){
				System.out.print( board[r][c] + "" );
				if (r ==selRow && c ==selCol){
					if (board[r][c] == ' '){
						if (user ==1){
							// board[r][c] ;
							System.out.print(board[r][c]= 'O');
						}
						if (user ==2){
							// board[r][c] ;
							System.out.print(board[r][c]= 'X');
						}
					}
					else{
						System.out.print("\nError. That spot has a char. Enter a new row, col: ");
						makeSelection(user);
					}
				}
			}
			System.out.println();

		}
		System.out.println("\t  0 1 2 ");

	}
	
}

//Next steps:
//to check for winners, 3 in row/col/diagonally
//to check for tied game
//to prevent user from over-writing previous choices






