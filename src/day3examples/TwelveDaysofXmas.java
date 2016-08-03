package day3examples;

public class TwelveDaysofXmas {

	public static void main(String[] args) {
		// sing the 12 days of Christmas
		String[] gifts  = new String[12];
			gifts[0] = "A Partridge in a Pear Tree";
			gifts[1] = "2 Turtle Doves";
			gifts[2] = "3 French Hens";
			gifts[3] = "4 Calling Birds";
			gifts[4] = "5 Golden Rings";
			gifts[5] = "6 Geese a Laying";
			gifts[6] = "7 Swans a Swimming";
			gifts[7] = "8 Maids a Milking";
			gifts[8] = "9 Ladies Dancing";
			gifts[9] = "10 Lords a Leaping";
			gifts[10] = "11 Pipers Piping";
			gifts[11] = "12 Drummers Drumming";
			
			
		for (int i = 1; i <= 12; i++) {
			//Write beginning statement
			String start = null;
			String middle = " day of Christmas my true love sent to me: ";
			switch (i) {
			case 1:
				start = "On the " + i + "st" + middle;
				break;
			case 2:
				start = "On the " + i + "nd" + middle;
				break;
			case 3:
				start = "On the " + i + "rd" + middle;
				break;
			default:
				start = "On the " + i + "th" + middle;
				break;
			}
			
			switch (i) {
			case 1:
				System.out.println(start + gifts[i-1]);
				System.out.println();
				break;
			case 2:
				System.out.println(start + gifts[i-1] + " and " + gifts[0]);
				System.out.println();
				break;
			case 3:
				System.out.print(start);
				int j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 4:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 5:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 6:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 7:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 8:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 9:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 10:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 11:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			case 12:
				System.out.print(start);
				j = i-1;
				while (j>=0){
					if(j==1){
						System.out.print(gifts[j] + " and ");
					}else if(j==0){
						System.out.print(gifts[j] + "\n");
					}else{
						System.out.print(gifts[j] + ", ");
					}
					j--;
				}
				System.out.println();
				break;
			default:
				break;
			}
		}

	}

}
