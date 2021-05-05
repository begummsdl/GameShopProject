package Business.Abstract;

import Entities.Concrete.User;

public interface UserValidationService {
	boolean Validate(User user);
}
