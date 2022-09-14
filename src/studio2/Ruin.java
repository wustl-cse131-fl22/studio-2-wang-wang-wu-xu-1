package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		//input
		Scanner in = new Scanner(System.in);
		System.out.print("Input start amount: ");
		int startAmount = in.nextInt();
		System.out.print("Input win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Input win limit: ");
		int winLimit = in.nextInt();
		System.out.print("Input total simulations: ");
		int totalSimulations = in.nextInt();
		//
		int loses = 0;
		for (int time=1; time<=totalSimulations; time++) {
			
			int count = 0;
			int amount = startAmount;
			while (0<amount && amount<winLimit) {
			    count++;
			    //win
			    if (Math.random()<winChance) {
			    	amount++;
			    }
			    else {
			    	amount--;
			    }
			}
			System.out.print("Simulation "+time+": "+count);
			if (amount <= 0) {
				System.out.println(" LOSE");
				loses++;
			}
			else {
				System.out.println(" WIN");
			}
		}
		System.out.println("Losses: "+loses+" Simulations: "+totalSimulations);
		double ruinRate = (double)loses/totalSimulations;
		System.out.print("Ruin Rate from Simulation: "+ruinRate);
		//
		double expectedRuinRate = 1-startAmount/winLimit;
		if (winChance != 0.5) {
			double a = (1-winChance)/winChance;
			expectedRuinRate = (Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1-Math.pow(a,winLimit));
		}
		System.out.println(" Expected Ruin Rate: "+expectedRuinRate);
		
	}

}
