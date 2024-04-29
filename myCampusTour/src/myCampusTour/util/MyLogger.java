
package myCampusTour.util;

public class MyLogger {
	public static enum DebugLevel {
		NONE,NO_OUTPUT, CONSTRUCTOR
	};

	private static DebugLevel debugLevel;

	public static void setDebugValue (int levelIn) {
	    switch (levelIn) {
            case 2: debugLevel = DebugLevel.CONSTRUCTOR; break;
            case 1: debugLevel = DebugLevel.NO_OUTPUT; break;
	    default: debugLevel = DebugLevel.NONE; break;
	    }
    }
    
    public static void setDebugValue (DebugLevel levelIn) {
	    debugLevel = levelIn;
    }

	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == null || message == null)
			return;
		if (levelIn == debugLevel)
			System.out.println("Logger->" + message);
	}


	public String toString() {
		return "Debug Level is " + debugLevel;
	}
}
