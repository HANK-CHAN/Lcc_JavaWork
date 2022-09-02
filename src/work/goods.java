package work;

import java.io.PrintStream;

public class goods {
	
	private String Commodit;
	private int price;
	private String Manufacturer ;
	
	public goods() {
		
	}
	
	public goods(String commodit,int price,String manufacturer) {
		this.Commodit = commodit;
		this.price = price;
		this.Manufacturer = manufacturer;
	}
	
	
	public String getCommodit() {
		
		return Commodit;
		
	}
	public  void setCommodit(String commodit) {
		this.Commodit = commodit;
	}
	public  int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.Manufacturer = manufacturer;
	}
	
}
