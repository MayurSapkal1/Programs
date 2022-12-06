package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * A board consists of many squares. 
 * On each square there may sit a piece.
 *
 * @author (your name and student number here)
 */
public class Board
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //initiallize the board using the squares file
        ArrayList<Square> board = new ArrayList<>();
        Scanner squares = new Scanner(new File("C:\\Users\\Dell\\javacode\\code\\src\\squares.txt"));
        while (squares.hasNext()){
            board.add(new Square(squares.nextInt(),squares.next()));
        }
        // the sequence of squares in the arraylist corresponds
        // to the sequence of squares on the board

        // display squares on the board 
        System.out.println("Board squares are:\nid\tname");
        for (Square s: board) System.out.println(s);

        // initiallize each piece placing it on the start square
        Scanner pieces = new Scanner(new File("C:\\Users\\Dell\\javacode\\code\\src\\pieces.txt"));
        ArrayList<Piece> gamePieces =  new ArrayList<>();
        while (pieces.hasNext()){
            Piece p = new Piece(pieces.nextInt(), pieces.next(), board.get(0));
            gamePieces.add(p);
        }
        
        // COMPLETE THIS:
        // move each piece randomly and separately
        int numberOfMoves;
        Random r = new Random();
       
        for(Piece p: gamePieces){
        	// enter your code that moves each piece a random number of squares
        	// in the clockwise direction
        	numberOfMoves = (int) (1 + Math.random() * (24 - 1));
        	// check for numberOfMoves are greater than equal to 12
        	if(numberOfMoves>board.size() || numberOfMoves==board.size()) {
        		// added one in numberOfMoves to avoid Start_Square place 
        		numberOfMoves=numberOfMoves+1;
        		// Subtracting no of squares on board for exact place of piece
        		int newNumberOfMoves=numberOfMoves-board.size();
        		List<Square> resultedList = board.stream()
        				.filter(id -> id.getId()==newNumberOfMoves)
        				.collect(Collectors.toList());
        		Square square= resultedList.get(0);
        		p.setName(p.getName());
        		p.setWhereAt(square);

        	}else {
        		// added one in numberOfMoves to avoid Start_Square place  
        		int numberOfMovesForLessThanList=numberOfMoves+1;
        		List<Square> resultedListNew = board.stream()
        				.filter(id -> id.getId()==numberOfMovesForLessThanList) 
        				.collect(Collectors.toList());

        		Square square= resultedListNew.get(0);
        		p.setName(p.getName());
        		p.setWhereAt(square);

        	}	


        }
        System.out.println("\n\nPieces have moved from their starting positions");
        for(Piece p: gamePieces){
            System.out.println(p.getName()+" is on "+p.getWhereAt());
        }
    }
}
