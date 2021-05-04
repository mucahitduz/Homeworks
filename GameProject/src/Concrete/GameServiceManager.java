package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameServiceManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getNameOfGame() + " isimli oyun oyunlara eklendi");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getNameOfGame() + " isimli oyun oyunlardan silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getNameOfGame() + " isimli oyun güncellendi");
		
	}
	
}
