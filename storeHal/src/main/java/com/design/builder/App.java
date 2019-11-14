package com.design.builder;

public class App {
public static void main(String[] args) {
	Computer computer1=Computer.getComputerBuilder("MyHDD", "MyCPU").buiid();
	Computer computer2=Computer.getComputerBuilder("MyHDD", "MyCPU")
			.setBluetoothEnabled(true)
			.setWiFiEnabled(true)
			.buiid();
	
	System.out.println(computer1);
	System.out.println(computer2);
}
}
