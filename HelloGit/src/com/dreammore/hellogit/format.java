package com.dreammore.hellogit;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class format {
	double f = 111231.5585;

	public void m1() {
		BigDecimal bg = new BigDecimal(f);
		double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(f1);
	}

	/**
	 * DecimalFormat转换最简便
	 */
	public void m2() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(df.format(f));
	}

	/**
	 * String.format打印最简便
	 */
	public void m3() {
		System.out.println(String.format("%.2f", f));
	}

	public void m4() {
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(f));
	}
	
	public void m5(){
		BigDecimal funds = new BigDecimal("1.00");
	    int itemsBought = 0;
	    for (BigDecimal price = new BigDecimal(".10");
	         funds.compareTo(price) >= 0;
	         price = price.add(new BigDecimal(".10"))) {
	      funds = funds.subtract(price);
	      itemsBought++;
	    }
	    System.out.println(itemsBought + " items bought.");
	    System.out.println("Change: $" + funds);
	}
	

	public static void main(String[] args) {
		format f = new format();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		f.m5();
		
		double d1 = 5.85;
		double d2 = 3.21;
		System.out.println(d1 - d2);
		
		double d = (d1 * 100 - d2 * 100) / 100;
		System.err.println(d );
	}
}