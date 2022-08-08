package classscheduler;

public class Schedule {
    // Define your own instance variables, constructor, and methods here

  Class[] ClassSchedule;
  
  public Schedule() {
    ClassSchedule = new Class[4];
    ClassSchedule[0] = new Class(1);
    ClassSchedule[1] = new Class(2);
    ClassSchedule[2] = new Class(3);
    ClassSchedule[3] = new Class(4);
  }

  public void viewSchedule() {
    for (int i = 0; i < 5; i++) {
      ClassSchedule[i].PrintClass();
    }
  }

  
}