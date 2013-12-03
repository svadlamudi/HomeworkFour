// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Restaurant extends AbsRated{
	
	//Restaurant Constructor
	public Restaurant(String name, Location location, int rating){
		super(name, location, rating);	
	}

	//Returns the name of the activating attraction
	public String getName() {
		return this.name;
	}
	
	//Returns true if the activating object matches the given criteria
	public boolean accept(ISelect select) {
		return select.choose(this);
	}
}
