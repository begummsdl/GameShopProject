package Business.Concrete;

import Business.Abstract.UserService;
import Business.Abstract.UserValidationService;
import DataAccess.Abstract.UserDal;
import Entities.Concrete.User;

public class UserManager implements UserService {
	private UserDal userDal;
	private UserValidationService userValidationService;
	

	public UserManager(UserDal userDal, UserValidationService userValidationService) {
		this.userDal = userDal;
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if (userValidationService.Validate(user)) {
			userDal.add(user);
		} else {
			System.out.println("Do�rulama ba�ar�s�z. Kay�t ba�ar�s�z.");
		}
		
	}

	@Override
	public void update(User user) {
		if (userValidationService.Validate(user)) {
			userDal.update(user);
		} else {
			System.out.println("Do�rulama ba�ar�s�z. Kay�t g�ncelleme ba�ar�s�z.");
		}
		
	}

	@Override
	public void delete(User user) {
		if (userValidationService.Validate(user)) {
			userDal.delete(user);
		} else {
			System.out.println("Do�rulama ba�ar�s�z. Kay�t silme i�lemi ba�ar�s�z.");
		}
		
	}

}
