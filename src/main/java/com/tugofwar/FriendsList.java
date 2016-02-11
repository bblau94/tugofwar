package com.tugofwar;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * 
 * @author ratdog123
 * @since 2/11/2016
 * @see com.tugofwar.PlayerComparatorLow
 * @see com.tugofwar.InvalidOrderException
 * Implemented a basic friends list. Can order friends from low to high or high to low (scores).
 */
public class FriendsList {
	public FriendsList(Set<Player> friendsList) {
		this.friendsList = friendsList;
	}

	//would this method be better?
//	private Set<Player> fList;
//	public FriendsList() {
//		this.friendsList = fList;
//	}
	
	private Set<Player> friendsList = new TreeSet<>(new PlayerComparator());

	//if order == 0 : sort players low score to high. If order == 1 : sort players high score to low	
	public Set<Player> filterByScore(int amount, int order) throws InvalidOrderException {
		if (order == 1) {
			Supplier<TreeSet<Player>> supplierHigh = () -> new TreeSet<>(new PlayerComparator());
			return friendsList.stream().limit(amount).collect(Collectors.toCollection(supplierHigh));
		} else if (order == 0) {
			Supplier<TreeSet<Player>> supplierLow = () -> new TreeSet<>(new PlayerComparatorLow());
			return friendsList.stream().limit(amount).collect(Collectors.toCollection(supplierLow));
		} else {
			throw new InvalidOrderException("Invalid Option for 'int order'");
		}
	}	


	public void addPlayer(Player p) {
		friendsList.add(p);
	}

	public void removePlayer(Player p) {
		friendsList.remove(p);
	}
//	
//	public Set<Player> getFriendsList() {
//		return friendsList;
//	}
	
}
