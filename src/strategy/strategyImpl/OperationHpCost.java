package strategy.strategyImpl;

import strategy.Strategy;

public class OperationHpCost implements Strategy{
	@Override
	public void doOperation(int hp, int mp,int atk) {
		if(hp<5){
			System.out.println( "生命力減少了");
		}else if(hp>5){
			System.out.println( "生命力增加了");
		}
	}
}
