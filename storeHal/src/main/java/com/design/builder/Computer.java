package com.design.builder;

public class Computer {
	
	private String HDD; 
	private String CPU;
	private boolean isBluetoothEnabled;
	private boolean isWifiEnabled;
	
	
	
public String getHDD() {
		return HDD;
	}

	public String getCPU() {
		return CPU;
	}
	
	

public boolean isBlueToothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isWifiEnabled() {
		return isWifiEnabled;
	}

private Computer(ComputerBuilder builder) {
	this.HDD=builder.HDD;
	this.CPU=builder.CPU;
	this.isBluetoothEnabled=builder.isBluetoothEnabled;
	this.isWifiEnabled=builder.isWifiEnabled;
}
	
	

public static class ComputerBuilder{
	private String HDD; 
	private String CPU;
	private boolean isBluetoothEnabled;
	private boolean isWifiEnabled;
	
	ComputerBuilder(String HDD,String CPU){
		this.HDD=HDD;
		this.CPU=CPU;
	}
	
	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled=isBluetoothEnabled;
		return this;
	}
	
	public ComputerBuilder setWiFiEnabled(boolean isWifiEnabled) {
		this.isWifiEnabled=isWifiEnabled;
		return this;
	}
	
	public Computer buiid() {
		return new Computer(this);
	}
}

public static ComputerBuilder getComputerBuilder(String HDD,String CPU ) {
	return new ComputerBuilder(HDD,CPU);
}

@Override
public String toString() {
	return "Computer [HDD=" + HDD + ", CPU=" + CPU + ", isBluetoothEnabled=" + isBluetoothEnabled + ", isWifiEnabled="
			+ isWifiEnabled + "]";
}





}
