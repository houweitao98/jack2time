/**
 * 2016年9月10日 下午4:44:25
 * @auto Jack.Hou
 * @Copyright 1999-2020 http://www.yihecloud.com/ Croporation Limited.
 */ 
package com.yihecloud.hwt;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 * time.java 
 */
public class time {

	public static int getTime(String sTime, String eTime) {
		 
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date start, end;
		int count = 0;
		try {
			start = df.parse(sTime);
			end = df.parse(eTime);
			long s = start.getTime(), e = end.getTime(), min = 0, diff;
			if (s < e) {
				diff = e - s;
			} else {
				diff = s - e;
			}
			min = diff / (60 * 1000);
			BigDecimal interval = new BigDecimal(65 + 5 / 11);
			count = (int) (min / (interval.longValue()));

		} catch (Exception e1) { 
			e1.printStackTrace();
		}

		return count;
	}
	
	public static void main(String[] args) {
		int count = getTime(args[0], args[1]);
		System.out.println("时针、分针、秒针一天重合" + count + "次！");

	} 

}
