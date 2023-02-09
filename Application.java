/**
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tests constructors and methods of the Building class
		Building emptyBuilding = new Building();
		Building myBuilding = new Building("Gaines House", "123 Main Street",
				2450, "Residential" , "R-2");
		
		System.out.println("displayData method for emptyBuilding: " +emptyBuilding.displayData());
		System.out.println("displayData method for myBuilding: " + myBuilding.displayData());
		myBuilding.draw();
		
		emptyBuilding.setProjectName("Ray Plaza");
		System.out.println("\nProject Name (getter): " +emptyBuilding.getProjectName());
		
		emptyBuilding.setCompleteAddress("567 Miller Drive");
		System.out.println("Address (getter): " +emptyBuilding.getCompleteAddress());
		
		emptyBuilding.setTotalSquareFeet(5500);
		System.out.println("Square Feet (getter): " +emptyBuilding.getTotalSquareFeet());
		
		emptyBuilding.setOccupancyGroup("Business");
		System.out.println("Main Occupancy Group (getter): " +emptyBuilding.getOccupancyGroup());
		
		emptyBuilding.setSubgroup("B");
		System.out.println("Sub-Group (getter): " +emptyBuilding.getSubgroup());
		
		System.out.println("\ntoString method for myBuilding: " + myBuilding.toString());
	
		
		// Tests constructors and methods of the Business class
		Business emptyBusiness = new Business();
		Business myBusiness = new Business("Marlin Place", "1500 Benje Circle", 6700,
				"Business" , "B", 5);
		
		System.out.println("\ndisplayData method for emptyBusiness: "+emptyBusiness.displayData());
		System.out.println("displayData method for myBusiness: " + myBusiness.displayData());
		myBusiness.draw();
		
		myBusiness.setNumUnits(15);
		System.out.println("\nNumber of rentable units (getter): " + myBusiness.getNumUnits());
		
		System.out.println("\ntoString method for myBusiness: " + myBusiness.toString());
		
		// Tests constructors and methods of the Mall class
		Mall emptyMall = new Mall();
		Mall myMall = new Mall("Newport Mall", "350 Clay Drive", 6700,
				"Business" , "B", 5, 4, 500, 75);
		
		System.out.println("\ndisplayData method for emptyMall:"+emptyMall.displayData());
		System.out.println("displayData method for myMall: "+myMall.displayData());
		myMall.draw();
		
		myMall.setRentedUnits(5);
		myMall.setMedianSize(550);
		myMall.setParkingSpaces(80);
		
		System.out.println("\nNumber of Rented units (getter): " + myMall.getRentedUnits());
		System.out.println("Median Unit Size (getter): " + myMall.getMedianSize());
		System.out.println("Number of Parking Spaces (getter): " + myMall.getParkingSpaces());
		
		System.out.println("\ntoString method for myMall: " + myMall.toString());
		
		
		// Tests constructors and methods of the Residential class
		Residential emptyResidential = new Residential();
		Residential myResidential = new Residential("Matt's House", "500 Clay Drive", 2000,
				"Residential" , "R-1", 3, 2, false);
		
		System.out.println("\ndisplayData method for emptyResidential:"+emptyResidential.displayData());
		System.out.println("\ndisplayData method for myResidential:"+myResidential.displayData());
		myResidential.draw();
		
		myResidential.setNumBedrooms(4);
		myResidential.setNumBathrooms(3);
		myResidential.setLaundryRoom(true);
		
		System.out.println("\nNumber of Bedrooms (getter): " + myResidential.getNumBedrooms());
		System.out.println("Number of Bathrooms (getter): " + myResidential.getNumBathrooms());
		System.out.println("Has a laundry room (getter): " + myResidential.isLaundryRoom());
		
		System.out.println("\ntoString method for myResidential: " + myResidential.toString());
		
		
		// Tests constructors and methods of the Apartment class
		Apartment emptyApartment = new Apartment();
		Apartment myApartment = new Apartment("City Apartments", "321 Main Street", 10000,
				"Residential" , "R-3", 15, 5, true, 5, 2000, false);
		
		System.out.println("\ndisplayData method for emptyApartment:"+emptyApartment.displayData());
		System.out.println("\ndisplayData method for myApartment:"+myApartment.displayData());
		myApartment.draw();
		
		myApartment.setNumRentableUnits(12);
		myApartment.setAvgUnitSize(2500);
		myApartment.setParkingAvailable(true);
		
		System.out.println("\nNumber of Rentable Units (getter): " + myApartment.getNumRentableUnits());
		System.out.println("Average Unit Size (getter): " + myApartment.getAvgUnitSize());
		System.out.println("Has parking (getter): "+ myApartment.isParkingAvailable());
		
		System.out.println("\ntoString method for myApartment: " + myApartment.toString());

		
		// Tests constructors and methods of the SingleFamilyHome class
		SingleFamilyHome emptyHome = new SingleFamilyHome();
		SingleFamilyHome myHome = new SingleFamilyHome("James's House", "1500 Sun Drive", 2500,
				"Residential" , "R-1", 3, 2, false, false);
		
		System.out.println("\ndisplayData method for emptyHome: " +emptyHome.displayData());
		System.out.println("\ndisplayData method for myHome:" +myHome.displayData());
		myHome.draw();
		
		myHome.setGarage(true);
		System.out.println("Has garage (getter): " + myHome.hasGarage());
		
		System.out.println("\ntoString method for myHome: " + myHome.toString());

	} // end main

} // end class
