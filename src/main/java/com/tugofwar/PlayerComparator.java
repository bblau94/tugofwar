package com.tugofwar;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	// This comparator orders players with the highest score in the first position
	public int compare(Player p1, Player p2) {
		return p2.getScore() - p1.getScore();
	}

}
