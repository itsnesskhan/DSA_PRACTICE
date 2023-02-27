package com.object.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	private String username;
	private transient String password;
	private transient String email;
	private transient long pin;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		String encryptedPass = 123+this.password;
		String encryptedemail = 123+this.email;
		long encryptedPin = 424+this.pin;
		out.writeObject(encryptedPass);	
		out.writeObject(encryptedemail);
		out.writeObject(encryptedPin);
	}
	
	private void readObject(ObjectInputStream oin) throws ClassNotFoundException, IOException {
		oin.defaultReadObject();
		Object readObject = oin.readObject();
		System.out.println(readObject);
		String encryptedPass = (String)readObject;
		password = encryptedPass.substring(3);
		
		Object readObject2 = oin.readObject();
		String encryptedemail = (String)readObject;
		email = encryptedemail.substring(3);
		
		long encryptedPin =  (long)oin.readObject();
		pin = encryptedPin-424;
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", pin=" + pin + "]";
	}

	

	
	
	

}
