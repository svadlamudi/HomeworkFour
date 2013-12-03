// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class LocatedAbove implements ISelect {

	int aboveStreet;
	
	//LocatedAbove Constructor
	public LocatedAbove(int aboveStreet){
		this.aboveStreet = aboveStreet;
	}
	
	//Returns true if the given hotel is located above 65 street
	public boolean choose(Hotel hotel) {
		return hotel.location.street > this.aboveStreet;
	}

	//Returns true if the given museum is located above 65 street
	public boolean choose(Museum museum) {
		return museum.location.street > this.aboveStreet;
	}

	//Returns true if the given restaurant is located above 65 street
	public boolean choose(Restaurant restaurant) {
		return restaurant.location.street > this.aboveStreet;
	}
}
