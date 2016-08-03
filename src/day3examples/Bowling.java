package day3examples;

public class Bowling {
	public static void main(String[] args) {
		int numPins;
		int[] scores = new int[12];
		char[] bonus = new char[12];
		int[] finalScore = new int[12];
		int totalScore = 0;
		
		for (int i = 0; i < 10; i++) {
			numPins = 10;
			int frame = 0;
			for(int j = 0; j<2; j++){
				int roll = (int)((Math.random()*(numPins+1)));
				System.out.println((i+1)+ "." + (j+1) + ": " + roll);
				if (roll == 10){
					bonus[i] = 'X';
				} 
				numPins -= roll;
				frame += roll;
			}
			scores[i] = frame;
			if(frame==10){
				if(bonus[i] == 'X'){
					//do nothing
				}else{
					bonus[i] = '/';
				}
			}
			if(i==9 && frame==10){            //Bonus roll
				if(bonus[9]=='X'){			//two bonus rolls
					scores[10]=(int)((Math.random()*(11))); //first bonus roll
					if (scores[10]==10){
						bonus[10]='X';
					}
					if (bonus[10]=='X'){  						//if first bonus roll is strike, reset pins & second bonus roll
						scores[11]=(int)((Math.random()*(11)));
					}else{
						scores[11]=(int)((Math.random()*(11-scores[10]))); //else roll again without resetting pins
					}
				}else{
					scores[10]=(int)((Math.random()*(11)));		//spare = One bonus roll
					if (scores[10]==10){
						bonus[10]='X';
					}
				}
			}
		}
		System.out.print("Frame:\t");
		for(int i=0; i<scores.length; i++){
			System.out.print(i+1 + "\t");
		}
		
		//System.out.print("\n\t");
		/*for(int i=0; i<bonus.length; i++){
			System.out.print(bonus[i] + "\t");
		}*/
		
		System.out.print("\nScores:\t");
		for(int i=0; i<scores.length; i++){
			if(bonus[i] == 'X' || bonus[i] == '/'){
				System.out.print(bonus[i] + "\t");
			}else{
				System.out.print(scores[i] + "\t");
			}
		}
		
		//calculate score using actual bowling scoring
		for(int i=0; i<finalScore.length; i++){
			
		}
		for (int i=0;i<scores.length; i++){
			totalScore += scores[i];
		}
		System.out.println();
		System.out.println("The total score is: " + totalScore);
		
		//Calculate total scoring using real bowling rules
		//for(int i=0; i<
	}
}