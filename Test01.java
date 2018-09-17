package com.softeem01.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
		
		
		String str = "adved";
		
		System.out.println(str.matches(".*ad.*"));
		
		
		//先变异正则表达式，编译好的表达式存放在p中
		Pattern p = Pattern.compile(".*a.*");
		//用编译好的正则表达式匹配字符串，pattern调用matcher（），返回matcher对象
		Matcher m = p.matcher("avdsef");
		//Matcher有个方法是用来
		boolean flag1 = m.matches();
		System.out.println(flag1);
		
		
		
	}
}
