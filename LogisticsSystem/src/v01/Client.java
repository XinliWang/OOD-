package v01;

import java.util.List;

public class Client {
	private String name;
	private List<Order> orders;
	
	public void addOrders(Order order) {
		orders.add(order);
	}
	
	public List<Order> getOrders() {
		return orders;
	}
}
