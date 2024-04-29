package myCampusTour.myTour;

public class cf implements CarbonFootprintI{

    private String choice;
    private double carbonFP = 0.1;

    public cf(String Choice_in){
        this.choice =Choice_in;
    }

    @Override
    public double getCarbonFootprint(){
        switch (choice) {
			case "CS540":
                carbonFP = 0.01;
				return carbonFP;
			case "CS542":
                carbonFP = 0.1;
				return carbonFP;
            case "CIW":
                carbonFP = 0.2;
				return carbonFP;
            case "MOUNTAIN_VIEW":
                carbonFP = 0.02;
				return carbonFP;
            case "EVENTS_CENTER":
                carbonFP = 0.25;
				return carbonFP;
            case "UNIVERSITY_UNON":
                carbonFP = 0.15;
				return carbonFP;
            case "SOM":
                carbonFP = 0.18;
				return carbonFP;
            case "WATSON":
                carbonFP = 0.12;
				return carbonFP;
			default:
				return carbonFP;
			}
    }

    @Override
	public String toString() {
		return 
		"\nCarbon footprint: " + getCarbonFootprint() + " tonnes";
	}
}