package switchassignment;

public class DiscountPromo {
    
	int promoCode;
	float discountedValue;
	float productPrice;
	float finalPrice;
    
    void promoCodeCheck() {
    	switch(promoCode) {
    	case 1:
    		discountedValue = (productPrice * 0.5f) * 1.05f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
			break;
    	case 2:
    		discountedValue = (productPrice * 0.5f) * 1.1f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
			break;
    	case 3:
    		discountedValue = (productPrice * 0.5f) * 1.2f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
			break;
    	case 4:
    		discountedValue = (productPrice * 50)/100;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
			break;
    	}
    }
    
}
