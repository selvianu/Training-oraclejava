package com.chainsys.product_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		System.out.println("dd-mm-yyyy");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
		System.out.println(date1);
	}

}
