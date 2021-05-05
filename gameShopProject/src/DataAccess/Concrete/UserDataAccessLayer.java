package DataAccess.Concrete;

import DataAccess.Abstract.UserDal;
import Entities.Concrete.User;

public class UserDataAccessLayer extends EntityRepositoryBase<User> implements UserDal {

	@Override
	public void add(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullan�c� kaydedildi.");
	}

	@Override
	public void update(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullan�c� g�ncellendi.");
	}

	@Override
	public void delete(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullan�c� silindi.");
	}

}
