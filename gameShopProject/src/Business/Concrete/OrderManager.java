package Business.Concrete;

import Business.Abstract.OrderService;
import DataAccess.Abstract.OrderDal;
import Entities.Concrete.Order;

public class OrderManager implements OrderService {
	private OrderDal orderDal;

	public OrderManager(OrderDal orderDal) {
		this.orderDal = orderDal;
	}

	@Override
	public void add(Order order) {
		orderDal.add(order);
	}

	@Override
	public void update(Order order) {
		orderDal.update(order);
	}

	@Override
	public void delete(Order order) {
		orderDal.delete(order);
	}

}
