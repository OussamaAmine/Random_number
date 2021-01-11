import java.util.Scanner;

public class RAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner SC = new Scanner(System.in);
			
			
			while(true) {
				System.out.println("If you want a random number type 1");
				int s = SC.nextInt();
			if(s==1) {
				System.out.println("Your random number is : "+(int) (Math.random()* (99999 - 3 + 1) + 3));
			}
			else {
				break;
			}
					
			}
			SC.close();
			
	}

}
