package DataAccess.Concrete;

import DataAccess.Abstract.CampaignDal;
import Entities.Concrete.Campaign;

public class CampaignDataAccessLayer extends EntityRepositoryBase<Campaign>  implements CampaignDal {

	@Override
	public void add(Campaign entity) {
		System.out.println(entity.getCampaignName() + " isimli kampanya kaydedildi.");
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getCampaignName() + " isimli kampanya güncellendi.");
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getCampaignName() + " isimli kampanya silindi.");
	}

}
