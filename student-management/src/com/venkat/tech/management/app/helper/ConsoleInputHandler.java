package com.venkat.tech.management.app.helper;

import java.util.Scanner;

import com.venkat.tech.management.app.domain.Address;
import com.venkat.tech.management.app.domain.User;

public class ConsoleInputHandler implements InputHandler {

	private Scanner scanner;

	
	
	public ConsoleInputHandler(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

public int getOption() {
	System.out.println("Enter Options below");
	System.out.println("1. Register");
	System.out.println("2. Login");
	System.out.println("3. List");
	int opt = scanner.nextInt();
	
	return opt;
	
}


	public User getUser() {
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter username");
		String username = scanner.next();
		System.out.println("Enter Password");
		String password = scanner.next();
		System.out.println("Enter Email Address");
		String email = scanner.next();
		System.out.println("Enter Phone Number");
		String phone = scanner.next();
		
		 
		User user = new User();
		 
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setName(name);
		return user;
	}



	@Override
	public Address getAddress() {
		Address a =  new Address();
		a.setCountry("india");
		a.setLandmark("Postoffice");
		a.setLin1("First main road");
		a.setPincode(600100);
		return a;
	}

}
