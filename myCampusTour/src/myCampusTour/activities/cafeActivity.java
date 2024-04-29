package myCampusTour.activities;

import myCampusTour.myTour.CostI;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;

import myCampusTour.myTour.cost;
import myCampusTour.myTour.cf;
import myCampusTour.myTour.duration;
import myCampusTour.myTour.effort;

import myCampusTour.enums.cafetariaEnums;

public class cafeActivity implements activityI{

    private String cafe_choice;
    private CarbonFootprintI cf;
    private CostI costDollor;
    private EffortI effortCalories;
    private DurationI durationMinutes;

    public cafeActivity(cafetariaEnums cafe_choice_in){
        this.cafe_choice = ""+cafe_choice_in;
    }

    public void createCafetaria() {

        cf = new cf(cafe_choice);
        costDollor = new cost(cafe_choice);
        effortCalories = new effort(cafe_choice);
        durationMinutes = new duration(cafe_choice);
        String des = "Cafetaria " +cafe_choice+ " visited";

        System.out.println(des + cf.toString() + costDollor.toString() + effortCalories.toString() + durationMinutes.toString()+ "\n");
    }

    @Override
	public String getDescription() {
		return "";
	}

	@Override
	public double getTotalCost(){
		return costDollor.getCostDollor();
	}

	@Override
	public double getTotalCF(){
		return cf.getCarbonFootprint();
	}

	@Override
	public int getTotalDuration(){
		return durationMinutes.getDurationSpent();
	}

	@Override
	public int getTotalCalories(){
		return effortCalories.getCalories();
	}

	@Override
	public String toString() {
		return getDescription() +
		"\nDuration spent: " + getTotalDuration() + " minutes" +
		"\nCost of Tour: " + getTotalCost() + " US dollors"+
		"\nEffort : " + getTotalCalories() + " calories"+
		"\nCarbon footprint: " + getTotalCF() + " tonnes";
	}

}