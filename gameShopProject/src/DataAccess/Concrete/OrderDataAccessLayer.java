package DataAccess.Concrete;

import DataAccess.Abstract.OrderDal;
import Entities.Concrete.Order;

public class OrderDataAccessLayer extends EntityRepositoryBase<Order> implements OrderDal {

	@Override
	public void add(Order entity) {
		System.out.println(entity.getGameId() + " id'li oyun satýþý kaydedildi.");
	}

	@Override
	public void update(Order entity) {
		System.out.println(entity.getGameId() + " id'li oyun satýþý güncellendi.");
	}

	@Override
	public void delete(Order entity) {
		System.out.println(entity.getGameId() + " id'li oyun satýþý silindi.");
	}

}
