package helloapp;

import java.util.Scanner;

public class Program {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in); //vvod/vivod na console
	        System.out.print("Input name: ");
	        String name = in.nextLine();
	        System.out.print("Input age: ");
	        int age = in.nextInt();
	        System.out.print("Input height: ");
	        float height = in.nextFloat();
	        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
	        in.close();
	        Human human = new Human("Bob",32);
	        human.display();
	        Builder builder = new Builder("Mike",38,"Build Co.");
	        builder.display();
	        Sailor sailor = new Sailor("Ron", 40, "Boo");
	        sailor.display();
	        Pilot pilot = new Pilot("Rico", 36, "Aeroflot", 125);
	        pilot.display();
	    }
}
class Human{
    
    String name;
    int age;
 
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        
        System.out.println("Name: " + name + ", Age:" + age);
    }
}

class Builder extends Human{
	  
    String company;
      
    public Builder(String name, int age, String company) {
      
        super(name, age);
        this.company=company;
    }
    
    @Override
    public void display(){
        
        System.out.println("Name: " + name + ", Age:" + age + ", Company:" + company);
    }
}

class Sailor extends Human{
	  
    String company;
      
    public Sailor(String name, int age, String company) {
      
        super(name, age);
        this.company=company;
    }
    
    @Override
    public void display(){
        
        System.out.println("Name: " + name + ", Age:" + age + ", Company:" + company);
    }
}

class Pilot extends Human{
	  
    String company;
    int license;
      
    public Pilot(String name, int age, String company, int license) {
      
        super(name, age);
        this.company=company;
        this.license=license;
    }
    
    @Override
    public void display(){
        
        System.out.println("Name: " + name + ", Age:" + age + ", Company:" + company + ", License:" + license);
    }
}