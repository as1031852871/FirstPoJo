package com.softeem01.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
		
		
		String str = "adved";
		
		System.out.println(str.matches(".*ad.*"));
		
		
		//�ȱ���������ʽ������õı��ʽ�����p��
		Pattern p = Pattern.compile(".*a.*");
		//�ñ���õ�������ʽƥ���ַ�����pattern����matcher����������matcher����
		Matcher m = p.matcher("avdsef");
		//Matcher�и�����������
		boolean flag1 = m.matches();
		System.out.println(flag1);
		
		
		
	}
}
