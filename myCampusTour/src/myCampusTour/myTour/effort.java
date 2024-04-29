package myCampusTour.myTour;

public class effort implements EffortI{

    private String choice;
    private int effortInCalories = 100;

    public effort(String Choice_in){
        this.choice =Choice_in;
    }

    @Override
    public int getCalories(){
        switch (choice) {
			case "CS540":
                effortInCalories = 150;
				return effortInCalories;
			case "CS542":
                effortInCalories = 50;
				return effortInCalories;
            case "CIW":
                effortInCalories = 250;
				return effortInCalories;
            case "MOUNTAIN_VIEW":
                effortInCalories = 20;
				return effortInCalories;
            case "EVENTS_CENTER":
                effortInCalories = 280;
				return effortInCalories;
            case "UNIVERSITY_UNON":
                effortInCalories = 180;
				return effortInCalories;
            case "SOM":
                effortInCalories = 100;
				return effortInCalories;
            case "WATSON":
                effortInCalories = 150;
				return effortInCalories;
			default:
				return effortInCalories;
			}
    }

    @Override
	public String toString() {
		return 
		"\nEffort : " + getCalories() + " calories";
	}
}