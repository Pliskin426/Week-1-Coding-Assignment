
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
		//
		int myAge = 31;
		System.out.println("I am " + myAge + " years old");
		int numberOfFriends = 10;
		System.out.println("and I have " + numberOfFriends + " really good friends");
		int friendsPerYear = numberOfFriends / myAge; 
		System.out.println("Which means I gain " + friendsPerYear + " new friends per year");
		//
		double moneyInWallet = 88.67;
		System.out.println("I have " + moneyInWallet + " in my wallet.");
		double itemPrice = 45.78;
		System.out.println("The item price is " + itemPrice);
		double netRemaining = moneyInWallet - itemPrice;
		System.out.println("I have " + netRemaining + " leftover.");
	}

}
