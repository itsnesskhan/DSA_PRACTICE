package com.java.design.patterns;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Optional;

public class DataBaseService {
	
	private static final HashMap<String, String> Mails = new HashMap<>() {
		
		{
			put("itsnesskhan","itsnesskhan@gmail.com");
			put("hahamda","hamdakhan@gmailcom");
			put("zoyasheikh", "zoyakhan123@gmail.com");
			put("imohit", "mohitkumrawat@gmail.com");
		}
		
		
	};
	
private static final HashMap<String, String> Phone_Numbers = new HashMap<>() {
		
		{
			put("itsnesskhan","9713216901");
			put("hahamda","73839393833");
			put("zoyasheikh", "87383939302");
			put("imohit", "9129393903");
		}
		
		
	};
	
	public String  getMailByUsername(String username) {
		Optional<String> map = Mails.entrySet().stream().filter(entry->entry.getKey().equals(username)).findFirst().map(s-> s.getValue());
		return map.get();
	}
	
	public String  getPhoneNumberByUsername(String username) {
		Optional<String> map = Phone_Numbers.entrySet().stream().filter(entry->entry.getKey().equals(username)).findFirst().map(s-> s.getValue());
		return map.get();
	}

}
