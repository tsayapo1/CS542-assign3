package myCampusTour.builderWorkshop;

import myCampusTour.fallTour.myFirstTourI;

public class BuilderWorkshop implements BuilderWorkshopI {
	public void construct(myFirstTourI myFirstTour){
        System.out.println("***Individual statistics of the tour***\n");
        myFirstTour.visitBuilding1Activity();
        myFirstTour.visitBuilding2Activity();
        myFirstTour.pickingGiftsActivity();
        myFirstTour.cafetariaActivity();
        myFirstTour.attendLectureActivity();
    }

    public void construct2(myFirstTourI mySecondTour){
        System.out.println("***Individual statistics of the tour***\n");
        mySecondTour.attendLectureActivity();
        mySecondTour.pickingGiftsActivity();
        mySecondTour.visitBuilding1Activity();
        mySecondTour.cafetariaActivity();
        mySecondTour.visitBuilding2Activity();
        
    }
}