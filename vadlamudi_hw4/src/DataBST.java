// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

import java.util.LinkedList;

public class DataBST implements IBST{
	
	//DataBST Fields
	IAttraction attraction;
	IBST left;
	IBST right;
	
	//DataBST Constructor
	public DataBST(IAttraction attraction, IBST left, IBST right){
		this.attraction = attraction;
		this.left = left;
		this.right = right;
	}

	//Adds the given element to the tree
	public IBST addElt(IAttraction attraction) {
		/*if(this.attraction.getName().compareTo(attraction.getName()) == 0){
			return this;
		}*/ //Question stated no need to include this check for duplicates
		if(attraction.getName().compareTo(this.attraction.getName()) < 0){
			return new DataBST(this.attraction,
							   this.left.addElt(attraction),
							   this.right);
		}			
		else{ //if(attraction.getName().compareTo(this.attraction.getName()) > 0
			return new DataBST(this.attraction,
					   this.left,
					   this.right.addElt(attraction));
		}
	}
	
	//Returns true if any elements in the tree match the given criteria
	public boolean containsAny(ISelect criteria){
		return this.attraction.accept(criteria) ||
			   this.left.containsAny(criteria)  ||
			   this.right.containsAny(criteria);
	}
	
	//Returns true if all elements in the tree match the given criteria
	public boolean allAre(ISelect criteria){
		return this.attraction.accept(criteria) &&
			   this.left.allAre(criteria)  &&
			   this.right.allAre(criteria);
	}
	
	//Returns a list with all the elements in the tree that match the given criteria
	public LinkedList<IAttraction> filter(ISelect criteria){
		LinkedList<IAttraction> filteredList = new LinkedList<IAttraction>();
		
		if(this.attraction.accept(criteria)){
			filteredList.add(attraction);
			filteredList.addAll(this.left.filter(criteria));
			filteredList.addAll(this.right.filter(criteria));
		}
		else{
			filteredList.addAll(this.left.filter(criteria));
			filteredList.addAll(this.right.filter(criteria));			
		}
		
		return filteredList;
	}
}
