package com.tugofwar;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	// returns positive int if p1 score > p2 score
	public int compare(Player p1, Player p2) {
		return p2.getScore() - p1.getScore();
	}

}
