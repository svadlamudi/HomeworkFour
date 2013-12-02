// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class TopRated implements ISelect {

	//TopRated Constructor
	public TopRated(){}
	
	//Returns true if the given hotel is highly rated
	public boolean choose(Hotel hotel) {
		return hotel.highlyRated();
	}

	//Returns false as museums do not have a rating
	public boolean choose(Museum museum) {
		return false;
	}

	//Returns true if the given restaurant is highly rated
	public boolean choose(Restaurant restaurant) {
		return restaurant.highlyRated();
	}
}
