package command;

public class SellStock implements Order{

	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock=abcStock;
	}
	@Override
	public void excute() {
		abcStock.buy();
	}

}
