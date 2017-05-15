package com.integle.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {

	public static String getOrderNum(String prefix) {
		return prefix + getOrderNum();
	}
	
	public static String getOrderNum() {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyMMddHHmmss");
		String result = format.format(d);
		int r = new Random().nextInt(1000);
		String str = String.format("%04d", r);    
		
		return result + str;
	}
	
}
