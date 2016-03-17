package com.simulator;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
	NORTH, SOUTH, EAST, WEST;

	public static Map<String, Direction> faces = new HashMap<String, Direction>();
	static {
		faces.put("NORTH", NORTH);
		faces.put("north", NORTH);
		faces.put("N", NORTH);
		faces.put("n", NORTH);
		faces.put("SOUTH", SOUTH);
		faces.put("south", SOUTH);
		faces.put("S", SOUTH);
		faces.put("s", SOUTH);
		faces.put("EAST", EAST);
		faces.put("east", EAST);
		faces.put("E", EAST);
		faces.put("e", EAST);
		faces.put("WEST", WEST);
		faces.put("west", WEST);
		faces.put("W", WEST);
		faces.put("w", WEST);
	}
}
