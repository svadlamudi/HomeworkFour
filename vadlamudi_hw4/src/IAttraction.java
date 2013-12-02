// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public interface IAttraction {
	
	//Returns the name of the activating object
	String getName();
	
	//Returns true if the activating attraction matches the given criteria
	boolean accept(ISelect select);
}
