package main_package;
//I'm still a bit unclear regarding the responsibility of the store class. Feels like it should do more than just this, but
//I'm not really basing that off anything.

public class Store {

	private String address;
	private String drivers[] = new String[] {"John G","Dave B","Alicia M","Jared A","Jackie E","Winston N","Jessie J","Katie S"};
	private int driverIndex = 0;
	private boolean isOpen;


	public boolean isOpen() {
		return true;
	}
	
	public String nextDriver(){
		String driver = drivers[driverIndex];
		driverIndex = (driverIndex+1)%7;
		return driver;
	}
	

}
