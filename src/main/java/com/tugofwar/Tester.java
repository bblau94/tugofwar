package com.tugofwar;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		Set<Player> test = new TreeSet<>(new PlayerComparator());
		// () -> new TreeSet<> this means we are assigning nothing () to a
		// TreeSet<>
		Supplier<TreeSet<Player>> supplier = () -> new TreeSet<>(new PlayerComparator());
		test.add(new Player("John Smith", 10, 1));
		test.add(new Player("Jill Johnsan", 40, 2));
		test.add(new Player("Jake Gyllenhaal", 50, 4));
		test.add(new Player("Jack Human", 15, 3));
		test.add(new Player("Hugh Jackman", 5, 3));
		System.out.println("\nPrior to sort : \n" + test);
		System.out.println("\nPost sort : \n" + test.stream().limit(10).collect(Collectors.toCollection(supplier)));

		ScoreBoard scoreB = new ScoreBoard(test);
		System.out.println("\nTesting score board subset function : \n" + scoreB.listTopPlayers(3));
	}
}
