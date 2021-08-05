
public class PromotionOffers {
	
	private String promoDate;
	private int promoNum;
	private String promoDishs;
	private int promoDiscount;
	
	
	public PromotionOffers (String promoDate, int promoNum, String promoDishs, int promoDiscount) {
		
		this.promoDate = promoDate;
		this.promoDishs = promoDishs;
		this.promoNum = promoNum;
		this.promoDiscount = promoDiscount;
			
	}


	public String getPromoDate() {
		return promoDate;
	}

	
	public void setPromoDate(String promoDate) {
		this.promoDate = promoDate;
	}


	public int getPromoNum() {
		return promoNum;
	}


	public void setPromoNum(int promoNum) {
		this.promoNum = promoNum;
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
	
	


}
