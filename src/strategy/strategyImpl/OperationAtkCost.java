package strategy.strategyImpl;

import strategy.Strategy;

public class OperationAtkCost implements Strategy{
	@Override
	public void doOperation(int hp, int mp,int atk) {
		if(mp<5){
			System.out.println( "魔力減少了");
		}else if(mp>5){
			System.out.println( "魔力增加了");
		}
	}
}
