package bowling;

public class bowlingGame {
	public static void main(String[] args) {

		// declare variable to be used
		int numPins;// declare variable number of pins
		int numFrames = 10;// declare variable and set number of frames to 10
		int numBonusRolls = 0;// declare variable number of bonus rolls and set
								// to 0
		int rollsPerFrame = 2;// declare variable number of rolls per frame and
								// set to 2
		int[][] scores = new int[numFrames + 2][rollsPerFrame];// initialize
																// array to
																// store value
																// of each roll
		int[] boxScore = new int[numFrames + 2];// initialize array to score box
												// score after each frame
		int totalScore;// initialize variable to hold total score per frame
		int finalScore = 0;// initialize variable for final score and set to 0
		int countRolls = 1; // declare variable to properly store bonus rolls in
							// array

		// bowl 10 frames, store scores in array
		for (int i = 0; i < numFrames; i++) {
			numPins = 10;// set number of pins to 10 to start frame
			for (int j = 0; j < rollsPerFrame; j++) {
				int roll = (int) ((Math.random() * (numPins + 1)));// roll a
																	// ball!
																	// Store
																	// number of
																	// pins
																	// knocked
																	// down in
																	// new
																	// variable
																	// roll
				scores[i][j] = roll;// store number of pins knocked down in
									// scores array
				numPins -= roll;// update number of pins remaining for second
								// roll of frame
			}

			// check for bonus rolls
			if ((i == 9) && (scores[i][0] == 10)) {
				numBonusRolls = 2; // if the last frame and bowled a strike, two
									// bonus rolls are earned
			} else if ((i == 9) && ((scores[i][0] + scores[i][1]) == 10)) {
				numBonusRolls = 1; // if the last frame and bowled a spare, one
									// bonus roll is earned
			}

			// bowl bonus rolls if applicable
			if (numBonusRolls == 2) {
				numPins = 10; // reset pins to 10
				int bonusRoll = (int) ((Math.random() * (numPins + 1)));// store
																		// number
																		// of
																		// pins
																		// knocked
																		// down
																		// in
																		// bonus
																		// roll
																		// in
																		// new
																		// variable
																		// bonus
																		// roll
				scores[i + countRolls][0] = bonusRoll;
				countRolls++;
				if (scores[10][0] == 10) {// if first bonus roll was a strike
					numPins = 10; // reset pins to 10
					bonusRoll = (int) ((Math.random() * (numPins + 1)));// store
																		// number
																		// of
																		// pins
																		// knocked
																		// down
																		// in
																		// second
																		// bonus
																		// roll
																		// in
																		// variable
																		// bonus
																		// roll
					scores[i + countRolls][0] = bonusRoll;
				} else { // else roll second bonus roll without resetting the
							// pins
					bonusRoll = (int) ((Math.random() * ((numPins - scores[10][0]) + 1)));
					scores[i + 1][1] = bonusRoll;
				}
			} else if (numBonusRolls == 1) {
				numPins = 10; // reset pins to 10
				int bonusRoll = (int) ((Math.random() * (numPins + 1)));// store
																		// number
																		// of
																		// pins
																		// knocked
																		// down
																		// in
																		// bonus
																		// roll
																		// in
																		// new
																		// variable
																		// bonus
																		// roll
				scores[i + countRolls][0] = bonusRoll;
			}
		}

		// calculate score
		for (int i = 0; i < scores.length; i++) {
			totalScore = 0;// set total score to 0 to begin each loop
			if (scores[i][0] == 10) {// if we bowled a strike add the value of
										// the next two rolls to the frame and
										// store in box score
				if (scores[i + 1][0] == 10) {// if rolled two strikes in a row,
												// get second roll value from
												// next frame
					totalScore = scores[i][0] + scores[i + 1][0] + scores[i + 2][0];
					boxScore[i] = totalScore;
				} else {// else add the score from the next two rolls to the
						// previous frame
					totalScore = scores[i][0] + scores[i + 1][0] + scores[i + 1][1];
					boxScore[i] = totalScore;
				}
			} else if ((scores[i][0] + scores[i][1]) == 10) {// if we bowled a
																// spare add the
																// value of the
																// next roll to
																// the frame and
																// store in box
																// score
				totalScore = scores[i][0] + scores[i][1] + scores[i + 1][0];
				boxScore[i] = totalScore;
			} else {// if not a strike or spare, combine the the number of pins
					// knocked down in that frame for the box score
				totalScore = scores[i][0] + scores[i][1];
				boxScore[i] = totalScore;
			}
		}

		// print box score & calculate total
		// Print the table header for frames
		System.out.print("Frame: \t");
		for (int i = 0; i < (boxScore.length - 2); i++) {
			System.out.print(i + 1 + "\t");
		}
		System.out.println();

		// print the result of each roll
		System.out.print("Roll: \t");
		for (int i = 0; i < boxScore.length; i++) {
			if (scores[i][0] == 10) {
				System.out.print("X\t");
			} else if ((scores[i][0] + scores[i][1]) == 10) {
				System.out.print(scores[i][0] + " /\t");
			} else {
				System.out.print(scores[i][0] + " " + scores[i][1] + "\t");
			}
		}
		System.out.println();

		// print the box score
		System.out.print("Score: \t");
		for (int i = 0; i < (boxScore.length - 2); i++) {
			System.out.print(boxScore[i] + "\t");
			finalScore += boxScore[i];
		}
		System.out.println();

		// print the final score through 10 frames
		System.out.println("The final score is " + finalScore);
	}
}
