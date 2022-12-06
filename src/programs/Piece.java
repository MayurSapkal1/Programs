package programs;


/**
 * A piece corresponds to an object that a player moves
 * from square to square around a board.
 * 
 * A piece has an id, a name, and knows the square upon which it sits
 *
 * @author (your name and student number here)
 */
public class Piece
{
    private int id;
    private String name;
    private Square whereAt;

    /**
     * Constructors 
     */
    public Piece()
    {
        this.id = 0;
        this.name="";
        this.whereAt=null;
    }

    public Piece(int id, String name,Square liesOn)
    {
        this.id = id;
        this.name=name;
        this.whereAt=liesOn;
    }
    
    // COMPLETE the following so there are getters and setters for all fields
    // and so the equals method works as described

    public String getName(){
        return name;
    }
    
    public void setName(String name) {
		this.name = name;
	}
    public String getWhereAt(){
        return whereAt.getName();
    }
    
    public void setWhereAt(Square lieson) {
		this.whereAt = lieson;
	}

    public String toString ()
    {
        return id+" "+name+" "+whereAt;
    }
}
