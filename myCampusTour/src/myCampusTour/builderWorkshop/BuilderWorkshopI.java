package myCampusTour.builderWorkshop;

import myCampusTour.fallTour.myFirstTourI;

public interface BuilderWorkshopI {
	/**
	 * @param myFirstTourI
	 *            Student for which to construct the entire tour
	 */
	public void construct(myFirstTourI myFirstTour);
	public void construct2(myFirstTourI mySecondTour);
}
