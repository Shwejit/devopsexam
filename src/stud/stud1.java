package stud;
import java.io.*;
import java.util.*;
public class stud1 {
	Scanner sc = new Scanner(System.in);
	String name;
	int reg;
	void input() {
		System.out.println(" Enter the reg no. ");
		reg=sc.nextInt();
		System.out.println(" Enter the name : ");
		name=sc.next(); 
	}
	void display() {
		System.out.println(" The entered register number is : " +reg);
		System.out.println(" The entered name is : " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud1 s= new stud1();
		s.input();
		s.display();

	}

}
