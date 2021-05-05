package DataAccess.Concrete;

import DataAccess.Abstract.UserDal;
import Entities.Concrete.User;

public class UserDataAccessLayer extends EntityRepositoryBase<User> implements UserDal {

	@Override
	public void add(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullanýcý kaydedildi.");
	}

	@Override
	public void update(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullanýcý güncellendi.");
	}

	@Override
	public void delete(User entity) {
		System.out.println(entity.getFirstName() + " " + entity.getLastName() + " isimli kullanýcý silindi.");
	}

}
