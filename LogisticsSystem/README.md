##问题描述

We have to design a logistics system where a client can place an order to get his/her items delivered to a given destination .

We have to keep track of status of all the orders . The admin of logistics charges some amount for delivering the orders (Items).

##思路历程
首先从object oriented方向来考虑，我们有：

Object:

1. client : name, orders, addOrder() 
2. order: track_number, starting, destination, time, items, price, setPrice()
3. admin: clients, trackOrders(), setPriceForOrder(double price, Order order)
4. item: name, number


##解决方案
首先物流系统，确定主要几个objects有client, order, admin, item. 
   
扩展:    
1. 使用enum来表明order的一些status,比如OrderStatus{DELIVERED, PROCESSING, CANCELLED;}, PaymentStatus{PAID, UNPAID;}, OrderPriority{LOW, MEDIUM, HIGH;}.    
2. 多考虑了一个因素，关于运输的车辆问题，Vehicle: vehicle_number, int capacity, Location position, VehicleStatus condition. 
3. 多添加了一个Location类，Location {float longitude; float latitude;} 
3. Vehicle使用enum的一些status，比如: VehicleStatus{FREE, BUSY, NOT_WORKING}.
4. 使用class Truck, Bike等extends Vehicle

对比:    
1. Order类中有client,而不是client中有orders
2. starting在client中为address, 而不在order中
3. 在order中有order delivery的时间
4. 有order的总重量
5. Item中有价格，重量和体积
6. Admin中有方法: take_order(Order order), process_order(Order order), Location track_order(int order_id).