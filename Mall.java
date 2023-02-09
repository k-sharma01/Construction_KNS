/**
 * This class represents a Mall
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * Empty argument constructor initializes instance variables to "" or 0
 	 */
	public Mall()
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	} // end empty-argument constructor
	
	/**
	 * Full argument constructor allows caller to pass in values for instance variables
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 * @param rentableUnits
	 * @param rentedUnits
	 * @param avgSize
	 * @param parking
	 */
	public Mall(String name, String address, double squareFeet, String mainGroup, 
			String subGroup, int rentableUnits, int rentedUnits, double avgSize, int parking)
	{
		super(name, address, squareFeet, mainGroup, subGroup, rentableUnits);
		numRentedUnits = rentedUnits;
		medianUnitSize = avgSize;
		numParkingSpaces = parking;
	} // end full-argument constructor
	
	@Override
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("Drawing code for: Mall");
	} // end draw
	
	@Override
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("Number of rented units: ");
		sb.append(numRentedUnits + "\n");
		sb.append("Median Unit Size: " + medianUnitSize);
		sb.append("\nNumber of Parking Spaces: " + numParkingSpaces + "\n");
		return super.displayData() + sb.toString();
	} // end displayData
	
	/**
	 * Getter for numRentedUnits
	 * @return
	 */
	public int getRentedUnits()
	{
		return numRentedUnits;
	} // end getRentedUnits
	
	/**
	 * Setter for numRentedUnits
	 * @param rented
	 */
	public void setRentedUnits(int rented)
	{
		numRentedUnits = rented;
	} // end setRentedUnits
	
	/**
	 * Getter for medianUnitSize
	 * @return
	 */
	public double getMedianSize()
	{
		return medianUnitSize;
	}
	
	/**
	 * Setter for medianUnitSize
	 * @param size
	 */
	public void setMedianSize(double size)
	{
		medianUnitSize = size;
	} // end setMedianSize
	
	/**
	 * Getter for numParkingSpaces
	 * @return
	 */
	public int getParkingSpaces()
	{
		return numParkingSpaces;
	} // end getParkingSpaces
	
	/**
	 * Setter for numParkingSpaces
	 * @param spaces
	 */
	public void setParkingSpaces(int spaces)
	{
		numParkingSpaces = spaces;
	} // end setParkingSpaces

	@Override
	public String toString() 
	{
		return super.toString() + "\nMall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" 
				+ medianUnitSize + ", numParkingSpaces=" + numParkingSpaces + "]";
	} // end toString
	
} // end class
