package jrJava.nestedClass3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockTradeGUI gui = new StockTradeGUI();
		StockTradeGUI.BuyAgent agent = gui.new BuyAgent();
		StockTradeGUI.BuyAgent agent2 = new StockTradeGUI().new BuyAgent();
		
		
		
	}

}
