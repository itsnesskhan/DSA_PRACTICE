package com.thread.example;

public class TestExample {

	public static void main(String[] args) throws InterruptedException {
		MythreadEx mythreadEx = new MythreadEx();
		MythreadEx mythreadEx2 = new MythreadEx();
		mythreadEx.start();
		mythreadEx.join();
		mythreadEx2.start();
	}
	
}
