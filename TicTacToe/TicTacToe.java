import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		System.out.println("TIC TAC TOE GAME");
		System.out.println("----------------");
		Scanner keyboard = new Scanner(System.in);
		initBoard();
		displayBoard();
		int user =1;

		while (user!=0){
			for(int count = 0; count<5; count++){

				if (count!=5){
					if (user ==1){
						System.out.print("'O', choose your location (row, col): ");
						int selRow = keyboard.nextInt();
						int selCol = keyboard.nextInt();
						updateBoard(selRow, selCol, 1);
						user = 2;
					}
					if (user ==2){
						System.out.print("'X', choose your location (row, col): ");
						int selRow = keyboard.nextInt();
						int selCol = keyboard.nextInt();
						updateBoard(selRow,selCol,2);
						user = 1;
					}
				}
				else{
					System.out.print("'O', choose your location (row, col): ");
					int selRow = keyboard.nextInt();
					int selCol = keyboard.nextInt();
					updateBoard(selRow, selCol, 1);
					System.out.println("END GAME.");
				}
				
			}
			user = 0;
		}


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
					if (user ==1){
						// board[r][c] ;
						System.out.print(board[r][c]= 'O');
					}
					if (user ==2){
						// board[r][c] ;
						System.out.print(board[r][c]= 'X');
					}
				}
			}
			System.out.println();

		}
		System.out.println("\t  0 1 2 ");

	}
	
}

//Next steps:
//need to check for winners, 3 in row/col/diagonally
//need to check for tied game