/**
 * This class represents a business building
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class Business extends Building {

	protected int numRentableUnits; // Stores the number of rentable units in the building
	
	/**
	 * Empty argument constructor initializes instance variables to "" or 0
 	 */
	public Business()
	{
		super();
		numRentableUnits = 0;
	} // end empty argument constructor
	
	/**
	 * Full argument constructor allows caller to pass in values for instance variables
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 * @param rentableUnits
	 */
	public Business(String name, String address, double squareFeet, String mainGroup, 
			String subGroup, int rentableUnits)
	{
		super(name, address, squareFeet, mainGroup, subGroup);
		numRentableUnits = rentableUnits;
	} // end full-argument constructor
	
	@Override
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("Drawing code for: Business");
	} // end draw
	
	@Override
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("Number of rentable units: ");
		sb.append(numRentableUnits + "\n");
		return super.displayData() + sb.toString();
	} // end displayData
	
	/**
	 * Getter for numRentableUnits
	 * @return
	 */
	public int getNumUnits()
	{
		return numRentableUnits;
	} // end getNumUnits
	
	/**
	 * Setter for numRentableUnits
	 * @param numUnits
	 */
	public void setNumUnits(int numUnits)
	{
		numRentableUnits = numUnits;
	} // end setNumUnits

	@Override
	public String toString() 
	{
		return super.toString() + "\nBusiness [numRentableUnits=" + numRentableUnits + "]";
	} // end toString
	
} // end class
