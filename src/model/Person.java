package model;

import strategy.Strategy;
import strategy.strategyImpl.OperationHpCost;

public class Person {
		private final int hp=5;
		private final int mp=5;
		private final int atk=5;
	
	
	   private Strategy strategy;

	   public Person(){
	      this.strategy = new OperationHpCost();
	   }
	   public Person(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public void executeStrategy(int hp, int mp,int atk){
	      strategy.doOperation(hp, mp,atk);
	   }
}
