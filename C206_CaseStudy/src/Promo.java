

public class Promo {//YY
	private String PromoName;
	private String Description;
	
	public Promo(String PromoName, String Description) {
		this.PromoName = PromoName;
		this.Description = Description;
	}
	public String getPromoName(){
		return PromoName;
	}
	public String gerDescription() {
		return Description;
	}
	public void display() {

		System.out.printf("%-30s %-20s\n",PromoName, Description);

	}
	

}
