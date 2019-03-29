import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList; 
import java.awt.geom.Point2D;


public class KingCrab extends CrabCritter
{
  
  public void processActors(ArrayList<Actor> actors)
  {
    for (Actor actor : actors)
      if (!scare(actor))
        actor.removeSelfFromGrid();
  }

  
  private boolean scare(Actor actor)
  {
    for (Location loc : getGrid().getEmptyAdjacentLocations(actor.getLocation()))
    {
      if (this.distance(loc) > 1)
      {
        actor.moveTo(loc);
        return true;
      }
    }
    return false;
  }

  
  private double distance(Location loc)
  {
    return Point2D.distance(this.getLocation().getRow(),
                            this.getLocation().getCol(),
                            loc.getRow(),
                            loc.getCol());
  }
}