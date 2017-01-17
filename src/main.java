

import java.util.Scanner;

import model.Person;
import strategy.strategyImpl.OperationHpCost;
import strategy.strategyImpl.OperationMpCost;
import strategy.strategyImpl.OperationAtkCost;


public class main {

	public static void main(String[] args) {
	      Person person = new Person();	
	      System.out.println("目前人物 hp:5,mp:5,atk:5");
	      Scanner in = new Scanner(System.in);
	      System.out.println("輸入hp");
	      int hp=in.nextInt();
	      System.out.println("輸入mp");
	      int mp=in.nextInt();
	      System.out.println("輸入atk");
	      int atk=in.nextInt();

	      person = new Person(new OperationHpCost());	
	      person.executeStrategy(hp,mp,atk);
	      person = new Person(new OperationAtkCost());		
	      person.executeStrategy(hp,mp,atk);
	      person = new Person(new OperationMpCost());	
	      person.executeStrategy(hp,mp,atk);
	}
}
