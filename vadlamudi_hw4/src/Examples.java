// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

import tester.Tester;

public class Examples {
	
	public Examples(){}
	
	Restaurant gibbys = new Restaurant("gibbys", new Location(90, 66), 4);
	
	boolean test1(Tester t){
		return t.checkExpect(gibbys.accept(new TopRated()), true);
	}
	boolean test2(Tester t){
		return t.checkExpect(gibbys.accept(new LocatedAbove()), true);
	}
	
	
}
