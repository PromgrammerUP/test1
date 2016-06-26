package serializable;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6069336702899799780L;
	private String name;
	private String number;
	private double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Account(String name, String number, double money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}
	public Account() {
		super();
	}
	
}
