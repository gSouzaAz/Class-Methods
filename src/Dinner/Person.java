package Dinner;

public class Person {

	String name;
	double weight;
	
	Person(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	double eat(Food food) {
		return this.weight += food.weight;
	}
	
}
