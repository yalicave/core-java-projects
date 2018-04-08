package com.venkat.tech.management.app;

import java.util.Scanner;

import com.venkat.tech.management.app.domain.Address;
import com.venkat.tech.management.app.domain.User;
import com.venkat.tech.management.app.helper.ConsoleInputHandler;
import com.venkat.tech.management.app.helper.InputHandler;
import com.venkat.tech.management.app.service.UserService;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InputHandler ih = new ConsoleInputHandler(scanner);
		UserService userService = new UserService();
		int opt = ih.getOption();
		switch (opt) {
		case 1:

			User user = ih.getUser();

			Address address = ih.getAddress();
			user.setAddress(address);

			// System.out.println(user);
			userService.save(user);
			break;
		case 2:

			break;
		case 3:
			userService.findAll();
			break;

		default:
			break;
		}
		scanner.close();

	}

}
