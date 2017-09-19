package lab3;

/**
 * CS 2003 Lab 3
 * @author Hannah James
 * @version "%I%, %G%"
 * @since 1.8
 * 
 */


public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	/**
	 * puts values in instance fields
	 * 
	 * @param name name of person
	 * @param year when person was born
	 */
	public Person(String name, int year){
		this.name = name;
		this.birthdate = year;
		age=current_year-birthdate;
	}

	/**
	 * sets birthdate equal to birth year
	 * 
	 * @param year when person was born
	 */
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	/**
	 * displays info about person
	 */
	public void display_info()
	{
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthdate);
		System.out.printf("\nI am %d years old ",age);
		display_age();
	}
	
	/**
	 * shows whether person is senior citizen or not
	 */
	public void display_age(){
		
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	/**
	 * main: creates a Person object which then shows info 
	 * about object
	 */
	public static void main(String[] args) {
		
		Person John = new Person("John",1957);
		John.display_info();
		
	}//end main

}//end class


