package myCampusTour.driver;

import myCampusTour.enums.attendLectureEnums;
import myCampusTour.enums.cafetariaEnums;
import myCampusTour.enums.pickGiftsEnums;
import myCampusTour.enums.visitBuildingChoiceEnums;
import myCampusTour.enums.visitChoiceEnums;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.BuilderWorkshop;
import myCampusTour.fallTour.myFirstTourI;
import myCampusTour.fallTour.myFirstTour;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

import myCampusTour.util.FileDisplayInterface;
import myCampusTour.util.Results;

/**
 * @author Shreevara Andila
 *
 */
 
public class Driver {
	private static final DebugLevel debuglevel = DebugLevel.NO_OUTPUT;

	/**
	 * @param args
	 *            args are debug level value and error file name
	 */

	public static void main(String[] args) {

		MyLogger.setDebugValue(debuglevel);

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}

		//Choices of the first person for the campus tour
		String name = "Shreevara";
		
		visitBuildingChoiceEnums visitBuilding1 = visitBuildingChoiceEnums.SOM;
		visitChoiceEnums visit_B1_By = visitChoiceEnums.BY_BUS;
		visitBuildingChoiceEnums visitBuilding2 = visitBuildingChoiceEnums.WATSON;
		visitChoiceEnums visit_B2_By = visitChoiceEnums.BY_FOOT;
		pickGiftsEnums pick_gift = pickGiftsEnums.UNIVERSITY_UNON;
		cafetariaEnums my_cafetaria = cafetariaEnums.MOUNTAIN_VIEW;
		attendLectureEnums attend_lecture = attendLectureEnums.CS542;

		if (name == null || visitBuilding1 == null || visit_B1_By == null || visitBuilding2 == null || visit_B2_By == null || pick_gift == null || my_cafetaria == null || attend_lecture==null) {
            Results display = new Results();
            display.write_error("All activities not found",args[1]);
			System.err.println("All activities not found");
            System.exit(0);
		}

		//Choices of the second person for the campus tour
		String name2 = "Navaneetha";
		
		visitBuildingChoiceEnums p2_visitBuilding1 = visitBuildingChoiceEnums.WATSON;
		visitChoiceEnums p2_visit_B1_By = visitChoiceEnums.BY_FOOT;
		visitBuildingChoiceEnums p2_visitBuilding2 = visitBuildingChoiceEnums.SOM;
		visitChoiceEnums p2_visit_B2_By = visitChoiceEnums.BY_BUS;
		pickGiftsEnums p2_pick_gift = pickGiftsEnums.UNIVERSITY_UNON;
		cafetariaEnums p2_my_cafetaria = cafetariaEnums.CIW;
		attendLectureEnums p2_attend_lecture = attendLectureEnums.CS540;

		if (name2 == null || p2_visitBuilding1 == null || p2_visit_B1_By == null || p2_visitBuilding2 == null || p2_visit_B2_By == null || p2_pick_gift == null || p2_my_cafetaria == null || p2_attend_lecture==null) {
            Results display = new Results();
            display.write_error("All activities not found",args[1]);
			System.err.println("All activities not found");
            System.exit(0);
		}

		/**
		* Below are the 3 steps for Builder Pattern Driver code
		*/

		try {
			myFirstTourI myFirstFallTour = new myFirstTour(name, visitBuilding1, visit_B1_By, visitBuilding2, visit_B2_By,
					pick_gift, my_cafetaria, attend_lecture);
			BuilderWorkshopI myWorkshop = new BuilderWorkshop();
			myWorkshop.construct(myFirstFallTour);
			System.out.println(myFirstFallTour);


			myFirstTourI mySecondFallTour = new myFirstTour(name2, p2_visitBuilding1, p2_visit_B1_By, p2_visitBuilding2, p2_visit_B2_By,
					p2_pick_gift, p2_my_cafetaria, p2_attend_lecture);
			BuilderWorkshopI myWorkshop2 = new BuilderWorkshop();
			myWorkshop2.construct2(mySecondFallTour);
			System.out.println(mySecondFallTour);

		} 
		catch (Exception exception) {
			System.exit(0);

		} 
		finally {

		}

	}
}
