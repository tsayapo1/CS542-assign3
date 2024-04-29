package myCampusTour.fallTour;

import myCampusTour.activities.attendActivity;
import myCampusTour.activities.cafeActivity;
import myCampusTour.activities.pickActivity;;
import myCampusTour.activities.visitActivity;

import myCampusTour.enums.attendLectureEnums;
import myCampusTour.enums.cafetariaEnums;
import myCampusTour.enums.pickGiftsEnums;
import myCampusTour.enums.visitBuildingChoiceEnums;
import myCampusTour.enums.visitChoiceEnums;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class myFirstTour implements myFirstTourI{
    
    public String name;
    visitBuildingChoiceEnums building1;
    visitChoiceEnums buiding1_by;
    visitBuildingChoiceEnums building2;
    visitChoiceEnums buiding2_by;
    pickGiftsEnums gift_choice;
    cafetariaEnums cafetaria_choice;
    attendLectureEnums lecture_choice;
    int calories1,calories2,calories3,calories4,calories5,duration1,duration2,duration3,duration4,duration5;
    double cost1,cost2,cost3,cost4,cost5,cf1,cf2,cf3,cf4,cf5;


    public myFirstTour(String name, visitBuildingChoiceEnums visitBuilding1, visitChoiceEnums visit_B1_By, 
                    visitBuildingChoiceEnums visitBuilding2, visitChoiceEnums visit_B2_By,
					pickGiftsEnums pick_gift, cafetariaEnums my_cafetaria, attendLectureEnums attend_lecture){

        MyLogger.writeMessage("Constructor called " + this.getClass().getName(), DebugLevel.CONSTRUCTOR);
		
        this.name = name;
        building1 = visitBuilding1;
        buiding1_by = visit_B1_By;
        building2 = visitBuilding2;
        buiding2_by = visit_B2_By;
        gift_choice = pick_gift;
        cafetaria_choice = my_cafetaria; 
        lecture_choice = attend_lecture;
    }

    @Override
    public void visitBuilding1Activity(){
        visitActivity visit_building1 = new visitActivity(building1, buiding1_by);
        visit_building1.createVisitActivity();
        calories1 = visit_building1.getTotalCalories();
        cost1 = visit_building1.getTotalCost();
        duration1 = visit_building1.getTotalDuration();
        cf1 = visit_building1.getTotalCF();
    }

    @Override
    public void visitBuilding2Activity(){
        visitActivity visit_building2 = new visitActivity(building2, buiding2_by);
        visit_building2.createVisitActivity();
        calories2 = visit_building2.getTotalCalories();
        cost2 = visit_building2.getTotalCost();
        duration2 = visit_building2.getTotalDuration();
        cf2 = visit_building2.getTotalCF();
    }

    @Override
	public void pickingGiftsActivity(){
        pickActivity pick_gifts = new pickActivity(gift_choice); 
        pick_gifts.createGifts();
        calories3 = pick_gifts.getTotalCalories();
        cost3 = pick_gifts.getTotalCost();
        duration3 = pick_gifts.getTotalDuration();
        cf3 = pick_gifts.getTotalCF();
    }

    @Override
	public void cafetariaActivity(){
        cafeActivity visit_cafe = new cafeActivity(cafetaria_choice); 
        visit_cafe.createCafetaria();
        calories4 = visit_cafe.getTotalCalories();
        cost4 = visit_cafe.getTotalCost();
        duration4 = visit_cafe.getTotalDuration();
        cf4 = visit_cafe.getTotalCF();
    }

    @Override
	public void attendLectureActivity(){
        attendActivity attend_lec = new attendActivity(lecture_choice); 
        attend_lec.createLecture();
        calories5 = attend_lec.getTotalCalories();
        cost5 = attend_lec.getTotalCost();
        duration5 = attend_lec.getTotalDuration();
        cf5 = attend_lec.getTotalCF();
    }
    

    @Override
	public String toString() {

        double totalcost = cost1+cost2+cost3+cost4+cost5;
        double totalcf = cf1+cf2+cf3+cf4+cf5;
        int totalcal = calories1+calories2+calories3+calories4+calories5;
        int totalduration = duration1+duration2+duration3+duration4+duration5;

		return  "***Overall statistics of " + name + "'s tour***\n\n" +
                "Carbon Footprint: " + totalcf + " tonnes"+ "\n" +
                "Cost: " + totalcost + " US dollors" + "\n" +
                "Effort : " + totalcal +" calories"+ "\n" +
                "Duration: " + totalduration + " minutes" + "\n\n";
	}
}