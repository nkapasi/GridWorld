/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

//package part2;

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given siDancinge. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug {
	
	private int steps;
	private int sideLength;
	private int[] dance;
	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug(int length, int [] dancing) {
		steps = 0;
		sideLength = length;
		dance = dancing;
	}

	/**
	 * Moves to the next location of the square.
	 */

    int checker = 0;

	public void act() {
		if(steps < sideLength && canMove()){
			move();
			steps++;
		}else {
			if(checker >= dance.length){
				checker = 0;
			}
			for(int i = 0; i<dance[checker]; i++){
				turn();
			}
			checker++;
			System.out.println(checker);
			steps = 0;
		}
	}
}
