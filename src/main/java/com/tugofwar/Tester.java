package com.tugofwar;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		Set<Player> sortTest = new TreeSet<>(new PlayerComparator());
		// () -> new TreeSet<> this means we are assigning nothing () to a
		// TreeSet<>
		FriendsList JohnF = new FriendsList(new TreeSet<>(new PlayerComparator()));
		FriendsList JillF = new FriendsList(new TreeSet<>(new PlayerComparator()));
		FriendsList JakeF = new FriendsList(new TreeSet<>(new PlayerComparator()));
		FriendsList JackF = new FriendsList(new TreeSet<>(new PlayerComparator()));
		FriendsList HughF = new FriendsList(new TreeSet<>(new PlayerComparator()));
		Player JohnS = new Player("John Smith", 10, 1, JohnF); 
		Player JillJ = new Player("Jill Johnsan", 40, 2, JillF);
		Player JakeG = new Player("Jake Gyllenhaal", 50, 4, JakeF);
		Player JackH = new Player("Jack Human", 15, 3, JackF);
		Player HughJ = new Player("Hugh Jackman", 5, 3, HughF);

		//Testing sort method (using comparator)
		sortTest.add(JohnS);
		sortTest.add(JillJ);
		sortTest.add(JakeG);
		sortTest.add(JackH);
		sortTest.add(HughJ);
//		System.out.println("\nPrior to sort : \n" + sortTest);
//		Supplier<TreeSet<Player>> supplier = () -> new TreeSet<>(new PlayerComparator());
//		System.out.println("\nPost sort : \n" + sortTest.stream().limit(3).collect(Collectors.toCollection(supplier)));

		//Testing score board ordering method
//		ScoreBoard scoreB = new ScoreBoard(sortTest);
//		System.out.println("\nTesting score board subset function : \n" + scoreB.listTopPlayers(3));

		//Testing FriendsList
		JohnS.addFriend(JakeG);
		System.out.println("John's Friendlist : " + JohnS.getFriendsList());

	}
}
