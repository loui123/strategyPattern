package strategy.strategyImpl;

import strategy.Strategy;

public class OperationMpCost implements Strategy{
	@Override
	public void doOperation(int hp, int mp,int atk) {
		if(atk<5){
			System.out.println( "�����O��֤F");
		}else if(atk>5){
			System.out.println( "�����O�W�[�F");
		}
	}
}
