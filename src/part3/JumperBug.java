import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class JumperBug extends Bug {
    
    private int steps;

    /**
     * Constructs a box bug that traces a square of a given side length
     * 
      * @param length
     *            the side length
     */
    public JumperBug() {
        steps = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act() {
        if (canMove()) {
            move();
            move();
            steps++;
        } else {
            turn90();
        }
    }
    
    public void turn90() {
        turn();
        turn();
    }
    
    public boolean canMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return false;
        }

        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection());

        if (!gr.isValid(next2)) {
            return false;
        } else if (!gr.isValid(next)) {
            return true;
        }

        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
}

