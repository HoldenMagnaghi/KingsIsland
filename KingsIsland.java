import java.util.Scanner;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int numPeople;
		double parkCost;
		double foodCost;
		double costPerPerson;
		double totalCost;
		double ticket=32.99;
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person

		System.out.print("How many people: ");
		//Prompt for and read in the number of people in the group
		numPeople=input.nextInt();

		System.out.print("How much is parking: ");
		//Prompt for and read in the cost of parking
		parkCost=input.nextDouble();

		System.out.print("How much have you spent on food: ");
		//Prompt for and read in the amount spent on food
		foodCost=input.nextDouble();

		totalCost=parkCost+foodCost+ticket;
		//Calculate the total expenses


		//Calculate the average per person
		costPerPerson=totalCost/numPeople;

		System.out.println("number of people:"+numPeople);
		System.out.println("Parking cost: $"+parkCost);
		System.out.println("Food cost: $"+foodCost);
		System.out.println("Total cost: $"+totalCost);
		System.out.println("Average cost per person: $"+costPerPerson);
		//Display results



	}
}