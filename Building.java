/**
 * This class represents a building
 * @author Kirin Sharma
 * @version 1.0
 * CS 131 Spring 2023
 * Programming Project 1
 *
 */

import java.lang.StringBuilder;

public class Building {

	protected String projectName; // name of the building project
	protected String completeAddress; // full address of the building project
	protected double totalSquareFeet; // square footage of building
	protected String occupancyGroup; // group code
	protected String subgroup; // subgroup code
	
	/**
	 * Empty argument constructor setting all instance fields to "" or 0.0
	 */
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	} // end empty-argument constructor
	
	/**
	 * Full argument constructor allows caller to pass values in for instance variables
	 * @param name
	 * @param address
	 * @param squareFeet
	 * @param mainGroup
	 * @param subGroup
	 */
	public Building(String name, String address, double squareFeet, String mainGroup, String subGroup)
	{
		projectName = name;
		completeAddress = address;
		totalSquareFeet = squareFeet;
		occupancyGroup = mainGroup;
		subgroup = subGroup;
	} // end full-argument constructor
	
	/**
	 * Prototype to draw object to screen
	 */
	public void draw()
	{
		System.out.println("\nDrawing code for: Building");
	} // end draw
	
	/**
	 * This method returns a string displaying the values of its instance variables
	 * @return
	 */
	public String displayData()
	{
		StringBuilder sb = new StringBuilder("\nProject Name: " + projectName);
		sb.append("\nAddress: " + completeAddress);
		sb.append("\nSquare Feet: " + totalSquareFeet);
		sb.append("\nMain Occpuancy Group: " + occupancyGroup);
		sb.append("\nSub-Group: " + subgroup + "\n");
		return sb.toString();
	} // end displayData
	
	/**
	 * Getter for projectName
	 * @return
	 */
	public String getProjectName()
	{
		return projectName;
	} // end getProjectName
	
	/**
	 * Setter for projectName
	 * @param name
	 */
	public void setProjectName(String name)
	{
		projectName = name;
	} // end setProjectName
	
	/**
	 * Getter for completeAddress
	 * @return
	 */
	public String getCompleteAddress()
	{
		return completeAddress;
	} // end getCompleteAddress
	
	/**
	 * Setter for completeAddress
	 * @param name
	 */
	public void setCompleteAddress(String address)
	{
		completeAddress = address;
	} // end setCompleteAddress
	
	/**
	 * Getter for totalSquareFeet
	 * @return
	 */
	public double getTotalSquareFeet()
	{
		return totalSquareFeet;
	} // end getTotalSquareFeet
	
	/**
	 * Setter for totalSquareFeet
	 * @param name
	 */
	public void setTotalSquareFeet(double squareFeet)
	{
		totalSquareFeet = squareFeet;
	} // end setTotalSquareFeet
	
	/**
	 * Getter for occupancyGroup
	 * @return
	 */
	public String getOccupancyGroup()
	{
		return occupancyGroup;
	} // end getOccupancyGroup
	
	/**
	 * Setter for occupancyGroup
	 * @param name
	 */
	public void setOccupancyGroup(String group)
	{
		occupancyGroup = group;
	} // end setOccupancyGroup
	
	/**
	 * Getter for subgroup
	 * @return
	 */
	public String getSubgroup()
	{
		return subgroup;
	} // end getSubgroup
	
	/**
	 * Setter for subgroup
	 * @param name
	 */
	public void setSubgroup(String group)
	{
		subgroup = group;
	} // end setSubgroup

	@Override
	public String toString() 
	{
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ "," + " subgroup=" + subgroup + "]";
	} // end toString
	
	
	
} // end class
