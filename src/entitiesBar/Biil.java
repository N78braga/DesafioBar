package entitiesBar;

public class Biil {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	

	public double cover() {
		return 4.00;
	}

	public double feeding() {
		return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
	}

	public double ticket() {
		return (gender == 'M') ? 10.00 : 8.00;
	}

	public double total() {
		return (this.feeding() > 30.00) ? this.feeding() + this.ticket()
				: this.feeding() + this.cover() + this.ticket();
	}

}
