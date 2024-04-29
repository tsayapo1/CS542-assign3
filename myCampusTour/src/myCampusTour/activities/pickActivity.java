package myCampusTour.activities;

import myCampusTour.myTour.CostI;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;

import myCampusTour.myTour.cost;
import myCampusTour.myTour.cf;
import myCampusTour.myTour.duration;
import myCampusTour.myTour.effort;

import myCampusTour.enums.pickGiftsEnums;

public class pickActivity implements activityI{

    private String gift_choice;
    private CarbonFootprintI cf;
    private CostI costDollor;
    private EffortI effortCalories;
    private DurationI durationMinutes;

    public pickActivity(pickGiftsEnums gift_choice_in){
        this.gift_choice = ""+gift_choice_in;
    }

    public void createGifts() {

        cf = new cf(gift_choice);
        costDollor = new cost(gift_choice);
        effortCalories = new effort(gift_choice);
        durationMinutes = new duration(gift_choice);
        String des = "Gifts picked at " +gift_choice;

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