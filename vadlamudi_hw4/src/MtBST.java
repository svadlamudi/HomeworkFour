// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

import java.util.LinkedList;

public class MtBST implements IBST{

	//MtBST Constructor
	public MtBST(){}

	//Adds the given element to the tree
	public IBST addElt(IAttraction attraction){
		return new DataBST(attraction, new MtBST(), new MtBST());
	}
	
	//Returns true if any elements in the tree match the given criteria
	public boolean containsAny(ISelect criteria){
		return false;
	}
	
	//Returns true if all the elements in the tree match the given criteria
	public boolean allAre(ISelect criteria){
		return true;
	}
	
	//Returns a list with all the elements in the tree that match the given criteria
	public LinkedList<IAttraction> filter(ISelect s){
		return new LinkedList<IAttraction>();
	}
}
