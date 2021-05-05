package Entities.Concrete;

import java.time.LocalDate;

import Entities.Abstract.Entity;

public class Order implements Entity {
	private int id;
	private int userId;
	private int gameId;
	private LocalDate date;
	
	public Order() {
		
	}

	public Order(int id, int userId, int gameId, LocalDate date) {
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
