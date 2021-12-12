package com.uni;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uni.Game;
import com.uni.GameBoard;
import com.uni.Tile;

public class PBHummel009 {
	
	@Test
	void testStart() {
	    Game game = new Game();
		game.start();
		assertEquals(game.isRunning(), true);
	}

	@Test
	void testSpawn() {
		GameBoard game = new GameBoard(0, 0);
		game.spawnRandom();
		assertEquals(game.isNotValid(), false);
	}
	
	@Test
	void testMove() {
		GameBoard game = new GameBoard(0, 0);
		game.move(0, 0, 0, 0, null);
		assertEquals(game.isMove(), false);
	}
	
	@Test
	void testTile() {
		Tile game = new Tile(0, 0, 0);
		game.setCanCombine(false);
		assertEquals(game.isCanCombine(), false);
	}
	
	@Test
	void testValue() {
		Tile game = new Tile(0, 0, 0);
		game.setValue(0);
		assertEquals(game.getValue(), 0);
	}
	
	@Test
	void testX() {
		Tile game = new Tile(0, 0, 0);
		game.setX(0);
		assertEquals(game.getX(), 0);
	}
	
	@Test
	void testY() {
		Tile game = new Tile(0, 0, 0);
		game.setY(0);
		assertEquals(game.getY(), 0);
	}
}