import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList; 


public class QuickCrab extends CrabCritter
{
  public ArrayList<Location> getMoveLocations()
  {
    ArrayList<Location> locs = new ArrayList<Location>();
    this.addIfPath(this.getDirection() + Location.LEFT, locs);
    this.addIfPath(this.getDirection() + Location.RIGHT, locs);
    
    if(locs.size() > 0)
      return locs;
    
    return super.getMoveLocations();
  }
  
  /**
   * Adds the location 2 spaces from this QuickCrab in the specified direction to
   * locs if and only if it and the intervening location are valid and empty. 
   */
  private void addIfPath(int direction, ArrayList<Location> locs)
  {
    Grid<Actor> gr = this.getGrid();
    Location loc = this.getLocation().getAdjacentLocation(direction);
    if(gr.isValid(loc) && gr.get(loc) == null)
    {
      loc = loc.getAdjacentLocation(direction);
      if(gr.isValid(loc) && gr.get(loc) == null)
        locs.add(loc);
    }
  }
}