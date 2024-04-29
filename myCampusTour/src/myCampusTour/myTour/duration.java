package myCampusTour.myTour;

public class duration implements DurationI{

    private String choice;
    private int durationInMin = 10;

    public duration(String Choice_in){
        this.choice =Choice_in;
    }

    @Override
    public int getDurationSpent(){
        switch (choice) {
			case "CS540":
                durationInMin = 90;
				return durationInMin;
			case "CS542":
                durationInMin = 100;
				return durationInMin;
            case "CIW":
                durationInMin = 25;
				return durationInMin;
            case "MOUNTAIN_VIEW":
                durationInMin = 5;
				return durationInMin;
            case "EVENTS_CENTER":
                durationInMin = 15;
				return durationInMin;
            case "UNIVERSITY_UNON":
                durationInMin = 10;
				return durationInMin;
            case "SOM":
                durationInMin = 20;
				return durationInMin;
            case "WATSON":
                durationInMin = 15;
				return durationInMin;
			default:
				return durationInMin;
			}
    }

    @Override
	public String toString() {
		return 
		"\nDuration spent: " + getDurationSpent() + " minutes";
	}
}