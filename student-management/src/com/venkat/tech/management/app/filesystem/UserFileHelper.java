package com.venkat.tech.management.app.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.venkat.tech.management.app.domain.User;

public class UserFileHelper implements UserRepository{ 
	File f = null;
	public UserFileHelper() {
	f = new File("src/resource/user.db");
	}

	@Override
	public void save(User user) {
		
	}

	@Override
	public void findAll() {
		FileReader filereader;
		try {
			
			filereader = new FileReader(f);
			  BufferedReader buf = new BufferedReader(filereader);
		        int count=0;
		        String s = "";
		            while((s=buf.readLine())!=null){
		                count++;
		                System.out.println(count +". "+s);
		            }
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
      
	}


}
