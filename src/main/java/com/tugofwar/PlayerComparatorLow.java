package com.tugofwar;

import java.util.Comparator;

public class PlayerComparatorLow implements Comparator<Player> {
		// This comparator orders players with the lowest score in the first position
		public int compare(Player p1, Player p2) {
			return p1.getScore() - p2.getScore();
		}
	}