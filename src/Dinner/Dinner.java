package Dinner;


public class Dinner {
public static void main(String[] args) {
	
	Person p1 = new Person ("Gabriel", 83);
	Person p2 = new Person ("Patrick", 72);
	
	Food f1 = new Food("Rice", 0.200);
	Food f2 = new Food("Meat", 0.500);
	
	System.out.println("Inital weight of "+p1.name+": "+p1.weight);
	System.out.println("Inital weight of "+p2.name+": "+p2.weight);
	
	p1.eat(f2);
	p2.eat(f1);
	
	System.out.println("\nFinal weight of "+p1.name+": "+p1.weight);
	System.out.println("Final weight of "+p2.name+": "+p2.weight);
 }
}