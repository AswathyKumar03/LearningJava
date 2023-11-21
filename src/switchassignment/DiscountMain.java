package switchassignment;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		DiscountPromo promoObject = new DiscountPromo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Price");
		promoObject.productPrice = sc.nextFloat();
		System.out.println(
				"Enter the PromoCode if you have..\n1 for promo5 \n2 forpromo10\n" + "3 for promo20\n4 for nopromo");
		promoObject.promoCode = sc.nextInt();
		promoObject.promoCodeCheck();
		sc.close();
	}

}
