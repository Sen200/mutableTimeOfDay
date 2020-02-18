package timeOfDay;

/** Instances of this class store a time of day.
 * @invar The hours are between 0 and 23.
 * 		| 0<= getHours() && getHours() <= 23
 * @invar The minutes are between 0 and 59
 * 		| 0 <= getMinutes() && getMinutes() <= 59
 */

public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 24 * 60 (exclusive
	 * 		| 0 <= minutesSinecMidnight && minutesSinceMidnight <= 60 * 24
	 */
	private int minutesSinceMidnight;
	
	int getHours() {
		return minutesSinceMidnight / 60; 
	}
	int getMinutes() {
		return minutesSinceMidnight % 60;
	}
	
	/**
	 * Sets this object's hours
	 * 
	 * @pre the given hours are between 0 and 23
	 * 		| 0 <= hours && hours <= 23
	 * @post this objects hours are equal to the given hours
	 * 		| getHours() == hours
	 * @post this objects minutes remain unchanged
	 * 	| getMinutes == old(getMinutes())
	 */
	void setHours(int hours) {
	minutesSinceMidnight = getMinutes() + hours * 60; 
	}
	
	/**
	 * Sets the objects hours
	 * @pre the given minutes are between 0 and 59
	 * 		| 0 <= minutes && minutes <= 59 
	 * @post this objects hours are equal to the given minutes
	 * 		|getMinutes() == minutes
	 * @post this objects
	 */
	void setMinutes(int minutes) {
	minutesSinceMidnight = getHours() * 60 + minutes;
	}

}
