/**
 * This class represents a residential building
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class Residential extends Building {

	protected int numBedrooms; // number of bedrooms in building
	protected int numBathrooms; // number of bathrooms in building
	protected boolean laundryRoom; // whether building has a laundry room
	
	/**
	 * Empty-Argument constructor initializes all fields to "" or 0
 	 */
	public Residential() 
	{
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	} // end default constructor
	
	/**
	 * Full-argument constructor allows caller to pass in values for instance variables
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 * @param bedrooms
	 * @param bathrooms
	 * @param laundy
	 */
	public Residential(String name, String address, double squareFeet, 
			String mainGroup, String subGroup, int bedrooms, int bathrooms, boolean laundry)
	{
		super(name, address, squareFeet, mainGroup, subGroup);
		numBedrooms = bedrooms;
		numBathrooms = bathrooms;
		laundryRoom = laundry;
	} // end full-argument constructor
	
	@Override
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("\nDrawing code for: Residential");
	} // end draw
	
	@Override
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("Number of Bedrooms: " + numBedrooms);
		sb.append("\nNumber of Bathrooms: " + numBathrooms);
		sb.append("\nHas a laundry room: " + laundryRoom);
		return super.displayData() + sb.toString();
	} // end displayData

	/**
	 * Getter for numBedrooms
	 * @return
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	} // end getNumBedrooms

	/**
	 * Setter for numBedrooms
	 * @param
	 */
	public void setNumBedrooms(int bedrooms) 
	{
		numBedrooms = bedrooms;
	} // end setNumBedrooms

	/**
	 * Getter for numBathrooms
	 * @return
	 */
	public int getNumBathrooms() 
	{
		return numBathrooms;
	} // end getNumBathrooms

	/**
	 * Setter for numBathrooms
	 * @param
	 */
	public void setNumBathrooms(int bathrooms) 
	{
		numBathrooms = bathrooms;
	} // end setNumBathrooms

	/**
	 * Getter for laundryRoom
	 * @return
	 */
	public boolean isLaundryRoom() 
	{
		return laundryRoom;
	} // end isLaundryRoom

	/**
	 * Setter for laundryRoom
	 * @param
	 */
	public void setLaundryRoom(boolean laundry) 
	{
		laundryRoom = laundry;
	} // end setLaundryRoom

	@Override
	public String toString() 
	{
		return super.toString() + "\nResidential [numBedrooms=" + numBedrooms + ", numBathrooms=" 
				+ numBathrooms + ", laundryRoom=" + laundryRoom + "]";
	} // end toString
	
} // end class
