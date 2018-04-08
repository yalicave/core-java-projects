package com.venkat.tech.management.app.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.venkat.tech.management.app.domain.User;

public class UserFileRepository implements UserRepository {
	File f = null;

	public UserFileRepository() {
		f = new File("src/resource/user.db");
	}

	@Override
	public void save(User user) {

	}

	@Override
	public void findAll() {
		FileReader filereader = null;
		BufferedReader buf = null;

		try {
			filereader = new FileReader(f);
			buf = new BufferedReader(filereader);
			int count = 0;
			String s = "";
			while ((s = buf.readLine()) != null) {
				count++;
				System.out.println(count + ". " + s);
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buf != null) {
					buf.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
