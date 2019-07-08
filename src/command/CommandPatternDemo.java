package command;

public class CommandPatternDemo {
	private void mian() {
		Stock abcStock=new Stock();
		BuyStock buyStockOrder=new BuyStock(abcStock);
		SellStock sellStockOrder=new SellStock(abcStock);
		Broker broker=new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}
}
