package strategy.strategyImpl;

import strategy.Strategy;

public class OperationMpCost implements Strategy{
	@Override
	public void doOperation(int hp, int mp,int atk) {
		if(atk<5){
			System.out.println( "攻擊力減少了");
		}else if(atk>5){
			System.out.println( "攻擊力增加了");
		}
	}
}
