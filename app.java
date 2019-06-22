
public class app {

	public static void main(String[] args) {
		//
		String firstName = "Jack";
		System.out.println("Hi, my first name is " + firstName);
		String lastName = "Burton";
		System.out.println("My last name is " + lastName);
		char middleInitial = 'D';
		System.out.println("and my middle initial is " + middleInitial);
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("My full name is " + fullName);
		String bFName = "Bob";
		System.out.println("This is " + bFName);
		String bLName = "McDirk";
		System.out.println("His last name is " + bLName);
		char bMInitial = 'Q';
		String bFull = bFName + " " + bMInitial + " " + bLName;
		System.out.println("His full name is " + bFull);
		//
		int myAge = 31;
		System.out.println("I am " + myAge + " years old");
		int bAge = 30;
		System.out.println("and he is " + bAge + " years old");
		int numberOfFriends = 10;
		System.out.println("I have " + numberOfFriends + " really good friends");
		int bFriends = 0;
		System.out.println("and Bob has " + bFriends);
		int friendsPerYear = numberOfFriends / myAge; 
		System.out.println("Which means I gain " + friendsPerYear + " new friends per year");
		int bFPerYear = numberOfFriends / myAge; 
		System.out.println("and Bob gains  " + bFPerYear + " new friends per year");
		//
		double moneyInWallet = 88.67;
		System.out.println("I have $" + moneyInWallet + " in my wallet.");
		double bMoney = 47.55;
		System.out.println("Bob has $" + bMoney + " in his wallet.");
		double itemPrice = 45.78;
		System.out.println("The item price is $" + itemPrice);
		double netRemaining = moneyInWallet - itemPrice;
		System.out.println("I have $" + netRemaining + " leftover.");
		double bNet = bMoney - itemPrice;
		System.out.println("and Bob only has $" + bNet + " leftover.");
	}

}
