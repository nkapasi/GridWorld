1.
    1. No, not if it is turning
    2. Clockwise
    3. Turns
    4. Flowers
    5. turns clockwise till next available grid
    6. it turn clockwise to avoid it
    7. no
    8. changes color when the bug goes over it
    9. No, the rock is stationary
    10. No if bug is placed, character underneath is deleted.

    0 North
    45 NorthEast
    90 East
    135 South East
    180 South
    225 SouthWest
    270 West
    315 NorthWest
    360 North

    2. Index out of bounds if you try to move it outside the grid. You can move it as far as you want inside the grid
    3. Set Color method
    4. The rock deletest the bug
2.
    1. Gives the length of the side of the bug box
    2. Steps counts the number of steps the bug takes in one line
    3. One Turn method only turns the bug 90 degrees
    4. Because BoxBug Extends the bug class
    5. Yes, You can set the length again in the runner
    6. No, it only travels in a box
    7. When the BoxBug Turns

3.
    1. getrow()
       getcol()
    2. false
    3. (4,4)
    4. 135
    5. The parameter is passed into the function
4. 
    1. ArrayList<Location> getValidAdjacentLocations( Location loc)
    2. get(Location loc)
    3. these methods are in the parent class
    4. No because an array List can store different variables and strings better than a n array can

5. 
    1. Location, Direction, Color
    2. The direction and color passed into it, it can be removed and replaced
    3. It can be used in the extended bug flower and rock class
    4. No there can only be one location for each actor
    5. setDirection() or call turn() twice
7. 
    1. act(), getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove()
    2. getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove()
    3. Yes, Some actors/Critters may have blindspots and be sensitive to only some tiles not all
    4. Check if flower then remove from grid. Check if empty then move, or check if not critter, and not rock
    5. getMoveLocations() returns an array of usable locations on the grid, SelectMoveLocation, selects one of those locations, makeMove, moves the critter to that location
    6. Because Different types of critters have different constructors meaning a critter constructor would be useless.

8. 
    1. Because the chameleon critter overrides the critters proccess actors method which is used in the act() method
    2. It uses the makemove() method of Critter
    3. uses bug in the makemove method
    4. It doesnt have to
    5. Actor class
    6. getGrid() method in the actor class
9. 
    1. 
