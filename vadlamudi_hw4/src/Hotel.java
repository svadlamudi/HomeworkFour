// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Hotel extends AbsRated implements IVisitable{
	
	//Hotel Object Constructor
	public Hotel(String name, Location location, int rating){
		super(name, location, rating);
	}

	//Returns the given name of the activating attraction
	public String getName() {
		return this.name;
	}

	//Returns true if the activating object matches the given criteria
	public boolean accept(ISelect select) {
		return select.choose(this);
	}
}
