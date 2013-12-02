// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public abstract class AbsAttraction implements IAttraction{
	
	//Attraction Fields
	String name;
	Location location;
	
	//Attraction Constructor
	public AbsAttraction(String name, Location location){
		this.name = name;
		this.location = location;
	}
}
