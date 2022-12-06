package programs;

/*
 * A square on a board game
 * each square has an id and a name
 *
 * @author (your name and student number here)
 */
public class Square
{
    private int id;
    private String name;
    /**
     * Constructor for objects of class initialize Squares
     */
    public Square(int id, String name)
    {
        this.id = id;
        this.name=name;
    }
    
    // COMPLETE the following so there are getters and setters for all fields
    // and so the equals method works as described
	

    public String toString(){
        return id+"\t" +name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
}
