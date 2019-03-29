import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
    private int courageFactor;

    public BlusterCritter(int c){
        super();
        courageFactor = c;
    } 
     
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>(); 
        Location loc = getLocation();
         for( int r = getLocation().getRow()-2; r < getLocation().getRow()+2; r++){
             for( int c = getLocation().getCol()-2; c < getLocation().getCol() +2; c++){
                 Location temp = new Location(r , c);
                 Actor a = getGrid().get(temp);
                 if(temp.get(loc) == null){
                 } else{
                     actors.add(a);
                 }
             }
         }
    }

    public void processActors(ArrayList<Actor> actors){
        if (actors.size() >= this.courageFactor)
            this.setColor(this.getColor().darker());
        else
            this.setColor(this.getColor().brighter());
 }
 }