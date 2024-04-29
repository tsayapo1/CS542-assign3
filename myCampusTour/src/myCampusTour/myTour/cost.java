package myCampusTour.myTour;

public class cost implements CostI{

    private String choice;
    private double costd = 10;
    private double lecture_cost = 15;
    private double cafe_cost = 7;

    public cost(String Choice_in){
        this.choice =Choice_in;
    }

    @Override
    public double getCostDollor(){
        switch (choice) {
			case "CS540":
				return lecture_cost;
			case "CS542":
                costd = lecture_cost+0.10*lecture_cost;
				return costd;
            case "CIW":
				return cafe_cost;
            case "MOUNTAIN_VIEW":
                costd = cafe_cost+0.05*cafe_cost;
				return costd;
            case "EVENTS_CENTER":
                costd = 15;
				return costd;
            case "UNIVERSITY_UNON":
                costd = 15;
				return costd;
            case "BY_BUS":
                costd = 3;
				return costd;
            case "BY_FOOT":
                costd = 1;
				return costd;
			default:
				return costd;
			}
    }

    @Override
	public String toString() {
		return 
		"\nCost of Tour: " + getCostDollor() + " US dollors";
	}
}