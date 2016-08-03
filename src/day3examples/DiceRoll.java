package day3examples;

public class DiceRoll {

	public static void main(String[] args) {
		int numberOfDice = 10;
		//User Bill = new User();

		/*for (int i = 0; i < numberOfDice; i++) {
			System.out.println((i + 1) + ". " + Bill.rollDice(6));
		}*/
	}

	class User {

		public User(String name){
			String userName = name;
		}
		
		public int rollDice(int numSides) {

			int sidesOnADie = numSides;
			int diceRoll = (int) ((Math.random() * sidesOnADie) + 1);
			return diceRoll;
		}
	}
}
