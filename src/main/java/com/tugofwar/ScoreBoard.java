package com.tugofwar;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//USE /** annotations for javadoc(umentation)
/* What do I need for the score board?
 * -Filters by:		//use lambda	| check for apache library?
 *		-Name?
 *		-Score	(Work on 1st)
 *		-Location?
 *		-Friends (Work on 2nd)
 * 		
 * What main objects or variables do/might I need?
 * Variables:
 * 	-scores private (done)
 *  
 * 
 * Objects:
 *  -Players (done)
 *  -Score Board (made)
 *  -
 * 
 * 
 */

/**
 * @author Ben
 * @since 2/10/2016
 * @version 1.0
 * @see com.tugofwar.Player 
 */
public class ScoreBoard {

	public ScoreBoard(Set<Player> scoreBoard) {
		this.scoreBoard = scoreBoard;
	}
	
	/**
	 * Comparator info:
	 * 
	 * @see <a href=
	 *      "http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html">
	 *      http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html
	 *      </a>
	 */
	private Set<Player> scoreBoard = new TreeSet<>(new PlayerComparator());

	// listTopPlayers will return a score-ordered subset of the score board with
	// size 'amount'
	public Set<Player> listTopPlayers(int amount) {
		Supplier<TreeSet<Player>> supplier = () -> new TreeSet<>(new PlayerComparator());
		return scoreBoard.stream().limit(amount).collect(Collectors.toCollection(supplier));
		// //This is one alternative method for returning
		// //doesn't need if because of how limit works
		// //returns the appropriate subset as a Set (not tested to confirm if
		// sorting holds)
		// return (Set<Player>) Iterables.limit(scoreBoard, amount);
	}

	public void addPlayer(Player p) {
		scoreBoard.add(p);
	}

	public void removePlayer(Player p) {
		scoreBoard.remove(p);
	}

	public Set<Player> getScoreBoard() {
		return scoreBoard;
	}

	// public Player getPlayer() {
	//
	// }
}
