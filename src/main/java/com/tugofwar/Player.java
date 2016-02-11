package com.tugofwar;

public class Player {
	private String name;
	private int score;
	private int id;

	public Player(String name, int score, int id) {
		this.name = name;
		this.score = score;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	// Getters & Setters Below
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
