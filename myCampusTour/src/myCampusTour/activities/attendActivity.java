package myCampusTour.activities;

import myCampusTour.myTour.CostI;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;

import myCampusTour.myTour.cost;
import myCampusTour.myTour.cf;
import myCampusTour.myTour.duration;
import myCampusTour.myTour.effort;

import myCampusTour.enums.attendLectureEnums;


public class attendActivity implements activityI{

    private String lecture_choice;
    private CarbonFootprintI cf;
    private CostI costDollor;
    private EffortI effortCalories;
    private DurationI durationMinutes;

    public attendActivity(attendLectureEnums lectureChoice_in){
        this.lecture_choice = ""+lectureChoice_in;
    }

    public void createLecture() {

        cf = new cf(lecture_choice);
        costDollor = new cost(lecture_choice);
        effortCalories = new effort(lecture_choice);
        durationMinutes = new duration(lecture_choice);
        String des = "Lecture " +lecture_choice+ " attended";

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