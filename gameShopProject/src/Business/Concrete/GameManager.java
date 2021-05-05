package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.GameDal;
import Entities.Concrete.Game;

public class GameManager implements GameService {
	private GameDal gameDal;

	public GameManager(GameDal gameDal) {
		this.gameDal = gameDal;
	}

	@Override
	public void add(Game game) {
		gameDal.add(game);
	}

	@Override
	public void update(Game game) {
		gameDal.update(game);
	}

	@Override
	public void delete(Game game) {
		gameDal.delete(game);
	}

}
