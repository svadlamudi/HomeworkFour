// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

import java.util.LinkedList;

public interface IBST {
	
	//Adds the given attraction to the tree
	IBST addElt(IAttraction attraction);
	
	//Returns true if any elements in the tree match the given criteria
	boolean containsAny(ISelect criteria);
	
	//Returns true if all elements in the tree match the given criteria
	boolean allAre(ISelect criteria);
	
	//Returns a list of all elements in the tree that match the given criteria
	LinkedList<IAttraction> filter(ISelect criteria);
}
