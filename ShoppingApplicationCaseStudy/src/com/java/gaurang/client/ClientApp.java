package com.java.gaurang.client;
import com.java.gaurang.framework.ShopFactory;
import com.java.gaurang.framework.PrimeAcc;
import com.java.gaurang.framework.NormalAcc;
import java.util.Scanner;
import com.java.gaurang.application.GSNormalAcc;
import com.java.gaurang.application.GSPrimeAcc;
import com.java.gaurang.application.GSShopFactory;

public class ClientApp {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		int[] prod_id = {1,2,3,4,5};
		String[] prod_name  = {"Headphones","Smartphones","SmartWatch","Backpack","Gaming Mouse"};
		float[] price = {1499,24999,5999,1999,899};
		System.out.println("Product ID\tProduct Name\tPrice");
		for(int i=0;i<5;i++) {
			System.out.println(prod_id[i]+"\t\t"+prod_name[i]+"\t"+price[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Type: [Normal/Prime]: ");
		String type = sc.next();
		if(type.equalsIgnoreCase("prime")) {
			System.out.println("For Prime Account: ");
			System.out.println("Enter Account Number: ");
			int accno = sc.nextInt();
			System.out.println("Enter Account holder's name: ");
			String accnm = sc.next();
			System.out.println("Enter Product ID to Purchase: ");
			int pid = sc.nextInt();
			System.out.println("Enter Quantity: ");
			float qty = sc.nextFloat();
			PrimeAcc pc= new GSPrimeAcc(accno, accnm, price[pid-1], true);
			pc.bookProduct(qty);
			pc.toString();
		}
		else if(type.equalsIgnoreCase("normal")) {
			System.out.println("For Normal Account: ");
			System.out.println("Enter Account Number: ");
			int accno = sc.nextInt();
			System.out.println("Enter Account holder's name: ");
			String accnm = sc.next();
			System.out.println("Enter Product ID to Purchase: ");
			int pid = sc.nextInt();
			NormalAcc nc = new GSNormalAcc(accno, accnm, price[pid-1], 369);
			System.out.println("Enter Quantity: ");
			float qty = sc.nextFloat();
			nc.bookProduct(qty);
			nc.toString();
			
		}
		sc.close();
	}

}
