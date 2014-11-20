package edu.rit.se;

/**
 * <p>
 * A common interface all colors share, allowing a generic color to be 
 * transformed in its backend representation.
 * </p>
 *  
 * @author Steven Kroh (skk8768)
 */
public interface Color
{
	/**
	 * @return The color represented in CYMK format
	 */ 
	public ColorCymk toCymk();

	/**
	 * @return The color represented in HEX format
	 * @throws ColorException if a hex string cannot be parsed
	 */
	public ColorHex toHex() throws ColorException;

	/**
	 * @return The color represented in RGB format
	 */
	public ColorRgb toRgb();
}
