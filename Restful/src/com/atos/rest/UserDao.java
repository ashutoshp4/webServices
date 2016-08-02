package com.atos.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public List<User> getAllUsers() {
		List<User> userList = null;
		try {
			File file = new File("Users.dat");
			
			if (!file.exists()) {
				User user = new User(1, "ashutosh", "S/w engg");
				userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
			} else {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream inputStream = new ObjectInputStream(fis);
				userList = (List<User>) inputStream.readObject();
				inputStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return userList;
	}

	private void saveUserList(List<User> userList) {
		try {
			File file = new File("Users.dat");
			FileOutputStream stream = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(stream);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
