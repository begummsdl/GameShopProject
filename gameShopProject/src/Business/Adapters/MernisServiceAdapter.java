package Business.Adapters;

import Business.Abstract.UserValidationService;
import Entities.Concrete.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean Validate(User user) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), 
					user.getFirstName().toUpperCase(), 
					user.getLastName().toUpperCase(), 
					user.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}