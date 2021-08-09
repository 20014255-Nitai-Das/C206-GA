
public class PromotionOffers {
	
	private String promoDate;
	private String promoName;
	private String promoDishs;
	private int promoDiscount;
	
	
	public PromotionOffers (String promoDate, String promoName, String promoDishs, int promoDiscount) {
		
		this.promoDate = promoDate;
		this.promoDishs = promoDishs;
		this.promoName = promoName;
		this.promoDiscount = promoDiscount;
			
	}


	public String getPromoDate() {
		return promoDate;
	}

	
	public void setPromoDate(String promoDate) {
		this.promoDate = promoDate;
	}


	public String getPromoName() {
		return promoName;
	}


	public void setPromoNum(String promoName) {
		this.promoName = promoName;
	}


	public String getPromoDish() {
		return promoDishs;
	}


	public void setPromoDish(String promoDish) {
		this.promoDishs = promoDish;
	}


	public int getPromoDiscount() {
		return promoDiscount;
	}


	public void setPromoDiscount(int promoDiscount) {
		this.promoDiscount = promoDiscount;
	}


	public static void add(PromotionOffers Promo) {
		
		
	}



	
	


}
