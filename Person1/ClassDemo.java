//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassDemo {
	public static void main(String[] args) {
 
		
		//Add code to create an object repeatedly
		
		String name,ans;
		int age;
		Person p;
		
		do {
			
//			Scanner input = new Scanner(System.in);
			
			
//			System.out.println("Enter name :");
//			name = input.nextLine();
			name = JOptionPane.showInputDialog("Enter your name: ");
			
//			System.out.println("Enter age :");
//			age = input.nextInt();
			age = Integer.parseInt(
					JOptionPane.showInputDialog("Enter your age: ")
					);
			
			
			p = new Person(name,age);
			
//			System.out.println(p);// toString is called automatically here
//			System.out.println(p.getName() + 
//					   " You are " +p.getAge() + " Years old");
			JOptionPane.showMessageDialog(null,p);
			
			
//			System.out.println("Do you want to continue?");
//			ans = input.nextLine();
			ans = JOptionPane.showInputDialog("Do you want to continue: ");
		}while (ans.equals("y") );
		
//		input.close();
	}
}