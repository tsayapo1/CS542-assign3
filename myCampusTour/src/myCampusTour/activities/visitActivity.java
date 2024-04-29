package myCampusTour.activities;

import myCampusTour.myTour.CostI;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;

import myCampusTour.myTour.cost;
import myCampusTour.myTour.cf;
import myCampusTour.myTour.duration;
import myCampusTour.myTour.effort;

import myCampusTour.enums.visitBuildingChoiceEnums;
import myCampusTour.enums.visitChoiceEnums;

public class visitActivity implements activityI{

    private String building_choice;
    private String visit_by;
    private CarbonFootprintI cf;
    private CostI costDollor;
    private EffortI effortCalories;
    private DurationI durationMinutes;

    public visitActivity(visitBuildingChoiceEnums building_choice_in, visitChoiceEnums visit_by_in){
        this.building_choice = ""+building_choice_in;
        this.visit_by = ""+visit_by_in;
    }

    public void createVisitActivity() {

        cf = new cf(building_choice);
        costDollor = new cost(visit_by);
        effortCalories = new effort(building_choice);
        durationMinutes = new duration(building_choice);
        String des = "Building " +building_choice+ " is visited" + " by " + visit_by ;

        System.out.println(des + cf.toString() + costDollor.toString() + effortCalories.toString() + durationMinutes.toString() + "\n");
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