package Business.Abstract;

import Entities.Concrete.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
}
