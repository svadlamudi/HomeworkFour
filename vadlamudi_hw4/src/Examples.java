// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

import java.util.LinkedList;

import tester.Tester;

public class Examples {
	
	public Examples(){}

//////////////////////////////////////////*Hotels*//////////////////////////////////////////////////////////////////////////////
	
	//Examples of Hotels
	Hotel daysinn = new Hotel("daysinn", new Location(54, 60), 3);
	Hotel hyatt = new Hotel("hyatt", new Location(85, 74), 4);
	Hotel plaza = new Hotel("plaza", new Location(73, 54), 5);
	Hotel hilton = new Hotel("hilton", new Location(64, 33), 4);	
	
	//Examples BSTs of Hotel
	IBST hotels = new MtBST();
	
	//Resulting BSTs of Hotels after addElt()
	IBST hotelsAddDaysInn = new DataBST(daysinn, new MtBST(), new MtBST());
	IBST hotelsAddHyatt   = new DataBST(daysinn, 
						    			new MtBST(), 
						    			new DataBST(hyatt, new MtBST(), new MtBST()));
	IBST hotelsAddPlaza   = new DataBST(daysinn, 
		                                new MtBST(), 
					                    new DataBST(hyatt, 
					                    		    new MtBST(), 
					                    		    new DataBST(plaza, new MtBST(), new MtBST())));
	IBST hotelsAddHilton = new DataBST(daysinn, 
                                       new MtBST(), 
                                       new DataBST(hyatt, 
            		                               new DataBST(hilton, new MtBST(), new MtBST()), 
            		                               new DataBST(plaza, new MtBST(), new MtBST())));
	
	//Resulting Arrays of Hotels after Filter()
	Hotel[] filteredHotelsTopRated = {hyatt, hilton, plaza};
	Hotel[] filteredHotelsLocatedAbove = {hyatt};
	
	//Hotel Methods Tests
	boolean testHiglyRatedHotel(Tester t){
		return t.checkExpect(daysinn.highlyRated(), false) &&
			   t.checkExpect(hyatt.highlyRated(), true)    &&
			   t.checkExpect(plaza.highlyRated(), true)    &&
			   t.checkExpect(hilton.highlyRated(), true);
	}
	
	boolean testAddEltHotel(Tester t){
		return t.checkExpect(hotels.addElt(daysinn), hotelsAddDaysInn) &&
			   t.checkExpect(hotels.addElt(daysinn).addElt(hyatt), hotelsAddHyatt) &&
			   t.checkExpect(hotels.addElt(daysinn).addElt(hyatt).addElt(plaza), hotelsAddPlaza) &&
			   t.checkExpect(hotels.addElt(daysinn).addElt(hyatt).addElt(plaza).addElt(hilton), hotelsAddHilton);
			   
	}
	
	boolean testContainsAnyTopRatedHotel(Tester t){
		return  t.checkExpect(hotels.containsAny(new TopRated()), false) &&
				t.checkExpect(hotelsAddDaysInn.containsAny(new TopRated()), false) &&
				t.checkExpect(hotelsAddHyatt.containsAny(new TopRated()), true) &&
				t.checkExpect(hotelsAddPlaza.containsAny(new TopRated()), true) &&
				t.checkExpect(hotelsAddHilton.containsAny(new TopRated()), true);
	}
	boolean testContainsAnyLocatedAboveHotel(Tester t){
		return  t.checkExpect(hotels.containsAny(new LocatedAbove(65)), false) &&
				t.checkExpect(hotelsAddDaysInn.containsAny(new LocatedAbove(65)), false) &&
				t.checkExpect(hotelsAddHyatt.containsAny(new LocatedAbove(65)), true) &&
				t.checkExpect(hotelsAddPlaza.containsAny(new LocatedAbove(65)), true) &&
				t.checkExpect(hotelsAddHilton.containsAny(new LocatedAbove(65)), true);
	}
	boolean testLocatedAboveHotel(Tester t){
		return  t.checkExpect(hotels.containsAny(new LocatedAbove(65)), false) &&
				t.checkExpect(hotelsAddDaysInn.containsAny(new LocatedAbove(65)), false) &&
				t.checkExpect(hotelsAddHilton.containsAny(new LocatedAbove(100)), false) &&
				t.checkExpect(hotelsAddHyatt.containsAny(new LocatedAbove(65)), true)    &&
				t.checkExpect(hotelsAddPlaza.containsAny(new LocatedAbove(65)), true)    &&
				t.checkExpect(hotelsAddHilton.containsAny(new LocatedAbove(65)), true);
	}
	
	boolean testAllAreTopRatedHotel(Tester t){
		return t.checkExpect(hotels.allAre(new TopRated()), true) &&
			   t.checkExpect(hotelsAddHilton.allAre(new TopRated()), false);
	}
	
	boolean testAllAreLocatedAboveHotel(Tester t){
		return t.checkExpect(hotels.allAre(new LocatedAbove(65)), true) &&
				t.checkExpect(hotelsAddHilton.allAre(new LocatedAbove(65)), false);
	}
	
	boolean testFilterTopRatedHotel(Tester t){
		return t.checkExpect(hotelsAddHilton.filter(new TopRated()).toArray(new Hotel[3]), filteredHotelsTopRated);
	}
	
	boolean testFilterLocatedAboveHotel(Tester t){
		return t.checkExpect(hotelsAddHilton.filter(new LocatedAbove(65)).toArray(new Hotel[1]), filteredHotelsLocatedAbove);
	}

//////////////////////////////////////////*Restaurants*///////////////////////////////////////////////////////////////////////////////////////
	
	//Examples of Restaurants
	Restaurant mcdonalds = new Restaurant("mcdonalds", new Location(93, 45), 3);
	Restaurant chillis = new Restaurant("chillis", new Location(54, 65), 4);
	Restaurant papaginos = new Restaurant("papaginos", new Location(57, 70), 5);
	Restaurant papajohns = new Restaurant("papajohns", new Location(80, 68), 5);
	
	//Examples BSTs of Restaurants
	IBST restaurants = new MtBST();
	
	//Resulting BSTs of Restaurants after addElt()
	IBST restaurantsAddMcdonalds = new DataBST(mcdonalds, new MtBST(), new MtBST());
	IBST restaurantsAddChillis   = new DataBST(mcdonalds, 
			 								   new DataBST(chillis, new MtBST(), new MtBST()), 
			 								   new MtBST());
	IBST restaurantsAddPapaginos = new DataBST(mcdonalds, 
											   new DataBST(chillis, new MtBST(), new MtBST()), 
											   new DataBST(papaginos, new MtBST(), new MtBST()));
	IBST restaurantsAddPapajohns  = new DataBST(mcdonalds, 
			   								   new DataBST(chillis, new MtBST(), new MtBST()), 
			   								   new DataBST(papaginos, 
			   										       new MtBST(), 
			   										       new DataBST(papajohns, new MtBST(), new MtBST())));
	
	//Resulting Arrays of Restaurants after filter()
	Restaurant[] filteredTopRatedRestaurants = {chillis, papaginos, papajohns};
	Restaurant[] filteredLocatedAboveRestaurants = {papaginos, papajohns};
	
	//Restaurants Methods Tests
	boolean testHighlyRatedRestaurant(Tester t){
		return t.checkExpect(mcdonalds.highlyRated(), false) &&
			   t.checkExpect(chillis.highlyRated(), true)    &&
			   t.checkExpect(papaginos.highlyRated(), true)  &&
			   t.checkExpect(papajohns.highlyRated(), true);
	}
	
	boolean testAddEltRestaurant(Tester t){
		return t.checkExpect(restaurants.addElt(mcdonalds), restaurantsAddMcdonalds) &&
			   t.checkExpect(restaurants.addElt(mcdonalds).addElt(chillis), restaurantsAddChillis) &&
			   t.checkExpect(restaurants.addElt(mcdonalds).addElt(chillis).addElt(papaginos), restaurantsAddPapaginos) &&
			   t.checkExpect(restaurants.addElt(mcdonalds).addElt(chillis).addElt(papaginos).addElt(papajohns), restaurantsAddPapajohns);
	}
	
	boolean testContainsAnyTopRatedRestaurant(Tester t){
		return t.checkExpect(restaurants.containsAny(new TopRated()), false) &&
			   t.checkExpect(restaurantsAddPapajohns.containsAny(new TopRated()), true);
	}
	
	boolean testContainsAnyLocatedAboveRestaurant(Tester t){
		return t.checkExpect(restaurants.containsAny(new LocatedAbove(65)), false) &&
			   t.checkExpect(restaurantsAddPapajohns.containsAny(new LocatedAbove(65)), true);
	}
	
	boolean testAllAreTopRatedRestaurant(Tester t){
		return t.checkExpect(restaurants.allAre(new TopRated()), true) &&
			   t.checkExpect(restaurantsAddPapajohns.allAre(new TopRated()), false);
	}
	
	boolean testAllAreLocatedAboveRestaurant(Tester t){
		return t.checkExpect(restaurants.allAre(new LocatedAbove(65)), true) &&
			   t.checkExpect(restaurantsAddPapajohns.allAre(new LocatedAbove(65)), false);
	}
	
	boolean testFilterTopRatedRestaurant(Tester t){
		return t.checkExpect(restaurantsAddPapajohns.filter(new TopRated()).toArray(new Restaurant[3]), filteredTopRatedRestaurants);
	}
	
	boolean testFilterLocatedAboveRestaurant(Tester t){
		return t.checkExpect(restaurantsAddPapajohns.filter(new LocatedAbove(65)).toArray(new Restaurant[2]), filteredLocatedAboveRestaurants);
	}
	
//////////////////////////////////////////*Museums*///////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Examples of Museums
	Museum metropolitan = new Museum("metropolitan", new Location(54, 67), 50);
	Museum skyscraper = new Museum("skyscraper", new Location(45, 56), 40);
	Museum whitney = new Museum("whitney", new Location(8, 85), 55);
	Museum rubin = new Museum("rubin", new Location(10, 46), 60);
	
	//Examples BSTs of Museums 
	IBST museums = new MtBST();
	
	//Resulting BSTs of Museums after addElt()
	IBST museumsAddMetropolitan = new DataBST(metropolitan, new MtBST(), new MtBST());
	IBST museumsAddSkyscraper   = new DataBST(metropolitan, 
											  new MtBST(), 
											  new DataBST(skyscraper, new MtBST(), new MtBST()));
	IBST museumsAddWhitney       = new DataBST(metropolitan, 
											  new MtBST(), 
											  new DataBST(skyscraper, 
													  	  new MtBST(), 
													  	  new DataBST(whitney, new MtBST(), new MtBST())));
	IBST museumsAddRubin         = new DataBST(metropolitan, 
			  								  new MtBST(), 
			  								  new DataBST(skyscraper, 
			  										      new DataBST(rubin, new MtBST(), new MtBST()), 
			  										      new DataBST(whitney, new MtBST(), new MtBST())));
	
	//Resulting BSTs of Museum after filter()
	Museum[] filteredTopRatedMuseum     = {};
	Museum[] filteredLocatedAboveMuseum = {metropolitan, whitney};
	
	//Museums Methods Tests
	boolean testAddEltMuseum(Tester t){
		return t.checkExpect(museums.addElt(metropolitan), museumsAddMetropolitan) &&
			   t.checkExpect(museums.addElt(metropolitan).addElt(skyscraper), museumsAddSkyscraper) &&
			   t.checkExpect(museums.addElt(metropolitan).addElt(skyscraper).addElt(whitney), museumsAddWhitney) &&
			   t.checkExpect(museums.addElt(metropolitan).addElt(skyscraper).addElt(whitney).addElt(rubin), museumsAddRubin);				
	}
	
	boolean testContainsAnyTopRatedMuseum(Tester t){
		return t.checkExpect(museums.containsAny(new TopRated()), false) &&
			   t.checkExpect(museumsAddRubin.containsAny(new TopRated()), false);
	}
	
	boolean testContainsAnyLocatedAboveMuseum(Tester t){
		return t.checkExpect(museums.containsAny(new LocatedAbove(65)), false) &&
			   t.checkExpect(museumsAddRubin.containsAny(new LocatedAbove(65)), true);
	}
	
	boolean testAllAreTopRatedMuseum(Tester t){
		return t.checkExpect(museums.allAre(new TopRated()), true) &&
			   t.checkExpect(museumsAddRubin.allAre(new TopRated()), false);
	}
	
	boolean testAllAreLocatedAboveMuseum(Tester t){
		return t.checkExpect(museums.allAre(new LocatedAbove(65)), true) &&
			   t.checkExpect(museumsAddRubin.allAre(new LocatedAbove(65)), false);
	}
	
	boolean testFilterTopRatedMuseum(Tester t){
		return t.checkExpect(museumsAddRubin.filter(new TopRated()).toArray(new Museum[0]), filteredTopRatedMuseum);
	}
	
	boolean testFilterLocatedAboveMuseum(Tester t){
		return t.checkExpect(museumsAddRubin.filter(new LocatedAbove(65)).toArray(new Museum[2]), filteredLocatedAboveMuseum);
	}
}
