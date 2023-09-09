package com.accessmodifier;

public class Vivomobile {

	private String vivomobilecamera() {
		String s = "camera is 35mp";
		return s;
	}
	
	public float vivomobileprice() {
		float f=3500.75f;
		return f;
	}
	
	protected String vivomobilebattery() {
		String v="5000mah";
		return v;
	}

	String displaysize() {
		String c="5.5 inch screen size";
		return c;

	}
	
	public void vivoprocessor() {
		int i=2;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Vivomobile obj = new Vivomobile();
		System.out.println(obj.vivomobilecamera());
		System.out.println(obj.vivomobileprice());
		System.out.println(obj.vivomobilebattery());
		System.out.println(obj.displaysize());
		
	}
}
