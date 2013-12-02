// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public abstract class AbsRated extends AbsAttraction{
	
	//AbsRated Fields
	int rating;
	
	//AbsRated Constructor
	public AbsRated(String name, Location location, int rating){
		super(name, location);
		if(rating >= 1 && rating <= 5)
			this.rating = rating;
		else
			throw new RuntimeException("Rating should be an integer between 1 and 5");
	}
	
	//Returns true if the rated attraction is rated higher than a 3
	public boolean highlyRated(){
		return this.rating >= 4;
	}
}
