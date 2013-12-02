// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Museum extends AbsAttraction implements IVisitable{
	
	//Museum Fields
	int fee;
	
	//Museum Constructor
	public Museum(String name, Location location, int fee){
		super(name, location);
		this.fee = fee;
	}

	//Returns the name of the activating object
	public String getName() {
		return this.name;
	}
	
	//Returns true if the activating attraction matches the given criteria
	public boolean accept(ISelect select) {
		return select.choose(this);
	}
}
