package com.java.design.patterns;

interface Inotifier {
	void sendNotification(String msg);

	String getusername();
}

class Notifier implements Inotifier {
	private String username;
	private DataBaseService databaseservice;

	public Notifier(String username) {
		super();
		this.username = username;
		this.databaseservice = new DataBaseService();
	}

	public void sendNotification(String msg) {
		String mail = databaseservice.getMailByUsername(username);
		System.out.println("Msg\s\"" + msg + "\" send to mail\s" + mail);
	}

	@Override
	public String getusername() {
		return username;
	}
}

class WhatsappNotifer implements Inotifier {
	private String username;
	private DataBaseService dataBaseService;

	public WhatsappNotifer(String username) {
		super();
		this.username = username;
		this.dataBaseService = new DataBaseService();
	}

	@Override
	public void sendNotification(String msg) {
		String phonenumber = dataBaseService.getPhoneNumberByUsername(getusername());
		System.out.println("Whatsapp msg\s\"" + msg + "\" send to phone number\s" + phonenumber);

	}

	@Override
	public String getusername() {
		return username;
	}

}

abstract class BaseDecorator implements Inotifier {

	protected final Inotifier notifer;
	protected final DataBaseService dataBaseService;

	public BaseDecorator(Inotifier notifer) {
		super();
		this.notifer = notifer;
		this.dataBaseService = new DataBaseService();
	}

	@Override
	public void sendNotification(String msg) {
		notifer.sendNotification(msg);

	}

	@Override
	public String getusername() {
		return notifer.getusername();
	}

}

class WhatsappDecorator extends BaseDecorator {

	public WhatsappDecorator(Inotifier notifer) {
		super(notifer);
	}

	@Override
	public void sendNotification(String msg) {
		super.sendNotification(msg);
		String phonenumber = dataBaseService.getPhoneNumberByUsername(getusername());
		System.out.println("Whatsapp msg\s\"" + msg + "\" send to phone number\s" + phonenumber);
	}

}

public class DecoratorDesignPatternEx2 {
	public static void main(String[] args) {
		Inotifier notifier = new WhatsappNotifer("itsnesskhan");
//		new WhatsappDecorator(notifier).sendNotification("Please Subscribe to my channel");
		notifier.sendNotification("Please Subscribe");
	}

}
