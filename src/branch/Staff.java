import src.order.Order;
import java.util.Scanner;

public class Staff {
	Scanner sc = new Scanner(System.in);
	private static Order currentOrder = new Order(); // Holds the order currently making ? 
	
	private String name;
	private String loginID;
	private char role;
	private char gender;
	private int age;
	private String branch;
	
	public staff(String name, String loginID, char role, char gender, int age, String branch) {
		this.name=name;
		this.loginID=loginID;
		this.role=role;
		this.gender=gender;
		this.age=age;
		this.branch=branch;		
	}
	
	public void displayOrders() {
		// are orders saved in a list?
	}
	public void viewDetails(Order order) {
		System.out.println("select order to view (input orderID): ");
		String currentOrder = sc.nextLine();
		currentOrder = 
	}
	public void processOrder() {
		System.out.println("select order to process (input orderID): ");
		String currentOrder = sc.nextLine();
		currentOrder = 	// not sure how to access the order?
		System.out.println("change status to 1: PREPARING, 2: READY, 3: CANCELLED");
		int choice = sc.nextInt();
		switch (choice) {
			case 1: currentOrder.status = OrderStatus.PREPARING;
				break;
			case 2: currentOrder.status = OrderStatus.READY;
				break;
			case 3:	currentOrder.status = OrderStatus.CANCELLED;
				break;
		}
	}
}
