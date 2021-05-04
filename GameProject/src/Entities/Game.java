package Entities;

public class Game {
	int id;
	String nameOfGame;
	int priceOfGame;
	
	public Game(int id, String nameOfGame, int priceOfGame) {
		this.id = id;
		this.nameOfGame = nameOfGame;
		this.priceOfGame = priceOfGame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfGame() {
		return nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}

	public int getPriceOfGame() {
		return priceOfGame;
	}

	public void setPriceOfGame(int priceOfGame) {
		this.priceOfGame = priceOfGame;
	}
}
