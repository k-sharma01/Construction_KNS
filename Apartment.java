/**
 * This class represents an apartment complex
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class Apartment extends Residential {

	private int numRentableUnits; // number of rentable units in apartment complex
	private double avgUnitSize; // average unit size
	private boolean parkingAvailable; // is there parking available
	
	/**
	 * Empty argument constructor initializes instance variables to "" or 0
	 */
	public Apartment()
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	} // end empty-argument constructor
	
	/**
	 * Full-argument constructor allows caller to pass in values for instance variables
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 * @param bedrooms
	 * @param bathrooms
	 * @param laundry
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment(String name, String address, double squareFeet, String mainGroup,
			String subGroup, int bedrooms, int bathrooms, boolean laundry, 
			int rentableUnits, double unitSize, boolean parking) 
	{
		super(name, address, squareFeet, mainGroup, subGroup, bedrooms, bathrooms, laundry);
		numRentableUnits = rentableUnits;
		avgUnitSize = unitSize;
		parkingAvailable = parking;
	} // end full-argument constructor
	
	@Override
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("\nDrawing code for: Apartment");
	} // end draw
	
	@Override
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("\nNumber of Rentable Units: " + numRentableUnits);
		sb.append("\nAverage Unit Size: " + avgUnitSize);
		sb.append("\nHas parking: " + parkingAvailable);
		return super.displayData() + sb.toString();
	} // end displayData

	/**
	 * Getter for numRentableUnits
	 * @return
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	} // end getNumRentableUnits

	/**
	 * Setter for numRentableUnits
	 * @param
	 */
	public void setNumRentableUnits(int rentableUnits) 
	{
		numRentableUnits = rentableUnits;
	} // end setNumRentableUnits

	/**
	 * Getter for avgUnitSize
	 * @return
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	} // end getAvgUnitSize

	/**
	 * Setter for avgUnitSize
	 * @param
	 */
	public void setAvgUnitSize(double unitSize) 
	{
		avgUnitSize = unitSize;
	} // end setAvgUnitSize

	/**
	 * Getter for parkingAvailable
	 * @return
	 */
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	} // end isParkingAvailable

	/**
	 * Setter for parkingAvailable
	 * @param
	 */
	public void setParkingAvailable(boolean parking) 
	{
		parkingAvailable = parking;
	} // end setParkingAvailable

	@Override
	public String toString()
	{
		return super.toString()+ "\nApartment [numRentableUnits=" + numRentableUnits + 
				", avgUnitSize=" + avgUnitSize + ", parkingAvailable=" + parkingAvailable + "]";
	} // end toString
	
} // end class
