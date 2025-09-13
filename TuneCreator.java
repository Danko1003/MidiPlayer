
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // initialise instance variables
        player = new MidiPlayer();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CreateAndPlay()
    {
        SimpleTune tune = new SimpleTune();
        
        
        tune.addNote("A",5);
        tune.addNote("B",5);
        tune.addNote("C",5);
        tune.addNote("D",5);
        tune.addNote("E",5);
        tune.addNote("F",5);
        
        player.playTune(tune);
    }
    
    
}