package DataAccess.Concrete;

import DataAccess.Abstract.GameDal;
import Entities.Concrete.Game;

public class GameDataAccessLayer extends EntityRepositoryBase<Game> implements GameDal {

	@Override
	public void add(Game entity) {
		System.out.println(entity.getGameName() + " oyunu kaydedildi.");
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName() + " oyunu güncellendi.");
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getGameName() + " oyunu silindi.");
	}

}
