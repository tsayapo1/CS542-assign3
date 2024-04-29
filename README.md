# CSX42: Assignment 3
## Name: Tina Sayapogu

### Slack days Used : 0

-----------------------------------------------------------------------
### 1) Compiling and Running Commands:
-----------------------------------------------------------------------
Compilation: ant -buildfile myCampusTour/src/build.xml all <br>
Running the code: ant -buildfile myCampusTour/src/build.xml run -Darg0=1 -Darg1=error.txt


-----------------------------------------------------------------------
### 2) Input and Output Format Specification:
-----------------------------------------------------------------------

Input: Input to the program is hardcoded in driver.java.
    Input to the program is his/hers specific orientation plan for Campus Tours at Binghamton University.
    Choices to the plan are specified in Enums.

Output: Format of program is as follows:

        ***Individual statistics of the tour***
        <Activity1............>
        <Carbon footprint: ...tonnes>
        <Cost of Tour: ... US dollors>
        <Effort : ... calories>
        <Duration spent: ... minutes>
        ...
        ...
        <Activity4............>

         ***Overall statistics of the tour***
         <...>
         ...
         ...
         <...>

## errorlog.txt

- This file contains the error message if any choices/ activity missing in the tour.

-----------------------------------------------------------------------

### Files:

a.) activities: This package contains all activities of the Campus Tour.<br>
    All activity classes are implemented from interface activityI.<br>

b.) enums: This package has Enums, to specify user choices for each activity of the Tour.<br>
    attendLectureEnums -> Enum choices for attending lecture.<br>
    cafetariaEnums -> Choices for cafetaria selection.<br>
    pickGiftsEnums -> Choices for picking gifts.<br>
    visitBuildingChoiceEnums -> Building choices to be visited.<br>
    visitChoiceEnums -> Choices on how to visit the buildings i.e. by foot or by bus.<br>

c.) myTour: This package contains interfaces for duration, carboon footprint, cost and <br>
            also the classes implemented from these interfaces respectively.<br>

d.) builderWorkshop:<br>
    builderWorkshopI.java is Builder interface.<br>
    builderWorkshop.java is a Workshop class which builds the itinerary for a Campus Tour.<br>

e.) fallTour:<br>
    myFirstTourI.java -> Interface for schedule of a student for the tour.<br>
    myFirstTour.java  -> Concrete class implementing the above interface.<br>

f.) util:<br>
    Logger.java Logger class for debugging purpose.<br>
    Results.java -> for writing error messages to error.txt.<br>

e.) driver:<br>
    Driver.java -> Driver class<br>

### Sample output:

      ***Individual statistics of the tour***
      
      Building SOM is visited by BY_BUS
      Carbon footprint: 0.18 tonnes
      Cost of Tour: 3.0 US dollors
      Effort : 100 calories
      Duration spent: 20 minutes
      
      Building WATSON is visited by BY_FOOT
      Carbon footprint: 0.12 tonnes
      Cost of Tour: 1.0 US dollors
      Effort : 150 calories
      Duration spent: 15 minutes
      
      Gifts picked at UNIVERSITY_UNON
      Carbon footprint: 0.15 tonnes
      Cost of Tour: 15.0 US dollors
      Effort : 180 calories
      Duration spent: 10 minutes
      
      Cafetaria MOUNTAIN_VIEW visited
      Carbon footprint: 0.02 tonnes
      Cost of Tour: 7.35 US dollors
      Effort : 20 calories
      Duration spent: 5 minutes
      
      Lecture CS542 attended
      Carbon footprint: 0.1 tonnes
      Cost of Tour: 16.5 US dollors
      Effort : 50 calories
      Duration spent: 100 minutes
      
      ***Overall statistics of Shreevara's tour***
      
      Carbon Footprint: 0.57 tonnes
      Cost: 42.85 US dollors
      Effort : 500 calories
      Duration: 150 minutes
      
      
      ***Individual statistics of the tour***
      
      Lecture CS540 attended
      Carbon footprint: 0.01 tonnes
      Cost of Tour: 15.0 US dollors
      Effort : 150 calories
      Duration spent: 90 minutes
      
      Gifts picked at UNIVERSITY_UNON
      Carbon footprint: 0.15 tonnes
      Cost of Tour: 15.0 US dollors
      Effort : 180 calories
      Duration spent: 10 minutes
      
      Building WATSON is visited by BY_FOOT
      Carbon footprint: 0.12 tonnes
      Cost of Tour: 1.0 US dollors
      Effort : 150 calories
      Duration spent: 15 minutes
      
      Cafetaria CIW visited
      Carbon footprint: 0.2 tonnes
      Cost of Tour: 7.0 US dollors
      Effort : 250 calories
      Duration spent: 25 minutes
      
      Building SOM is visited by BY_BUS
      Carbon footprint: 0.18 tonnes
      Cost of Tour: 3.0 US dollors
      Effort : 100 calories
      Duration spent: 20 minutes
      
      ***Overall statistics of Navaneetha's tour***
      
      Carbon Footprint: 0.6599999999999999 tonnes
      Cost: 41.0 US dollors
      Effort : 830 calories
      Duration: 160 minutes
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense."

Date: 17-11-2022


