package command;


public class BuyStock implements Order{

	private Stock abcStock;
	
	public BuyStock(Stock stock) {
		
		this.abcStock=stock;
	}
	
	@Override
	public void excute() {
		abcStock.buy();
	}

}
