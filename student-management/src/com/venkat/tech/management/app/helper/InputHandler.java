package com.venkat.tech.management.app.helper;

import com.venkat.tech.management.app.domain.Address;
import com.venkat.tech.management.app.domain.User;

public interface InputHandler {
	User getUser();
	Address getAddress();
	public int getOption();

}
