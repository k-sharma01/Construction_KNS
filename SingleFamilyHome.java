/**
 * This class represents a single-family home
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

public class SingleFamilyHome extends Residential {

	private boolean garage; // whether house has a garage or not

	/**
	 * Empty-argument constructor
	 */
	public SingleFamilyHome()
	{
		super();
		garage = false;
	} // end empty-argument constructor
	
	/**
	 * Full-argument constructor allows caller to pass in values for instance fields
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 * @param bedrooms
	 * @param bathrooms
	 * @param laundry
	 * @param garage
	 */
	public SingleFamilyHome(String name, String address, double squareFeet, String mainGroup,
			String subGroup, int bedrooms, int bathrooms, boolean laundry, boolean hasGarage) 
	{
		super(name, address, squareFeet, mainGroup, subGroup, bedrooms, bathrooms, laundry);
		garage = hasGarage;
	} // end full-argument constructor
	
	@Override
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("\nDrawing code for: Single Family Home");
	} // end draw
	
	@Override
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("\nHas a garage: " + garage);
		return super.displayData() + sb.toString();
	} // end displayData

	/**
	 * Getter for garage
	 * @return
	 */
	public boolean hasGarage() 
	{
		return garage;
	} // end hassGarage

	/**
	 * Setter for garage
	 * @param
	 */
	public void setGarage(boolean hasGarage) 
	{
		garage = hasGarage;
	} // end setGarage

	@Override
	public String toString() 
	{
		return super.toString() + "\nSingleFamilyHome [garage=" + garage + "]";
	} // end toString
	
} // end class
