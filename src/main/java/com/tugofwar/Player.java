package com.tugofwar;

import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Player {
	private String name;
	private int score;
	private int id;
	private FriendsList friendslist;

	public Player(String name, int score, int id, FriendsList f) {
		this.name = name;
		this.score = score;
		this.id = id;
		this.friendslist = f;
	}

	public void addFriend(Player p) {
		this.friendslist.addPlayer(p);
	}

	public void removeFriend(Player p) {
		this.friendslist.removePlayer(p);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	// Getters & Setters Below
	/**
	 * Work on getting getFriendsList to work
	 */
	public FriendsList getFriendsList() {
		Supplier<TreeSet<Player>> supplier = () -> new TreeSet<>(new PlayerComparator());
		return friendslist;
		//return friendslist.stream().limit(3).collect(Collectors.toCollection(supplier));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
