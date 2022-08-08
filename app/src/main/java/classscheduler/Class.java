package classscheduler;

public class Class {
    // Define your own instance variables, constructor, and methods here
  public int Block;
  public String Name;
  public String Teacher;

  public Class(int _block) {
    SetValues(_block, "empty", "empty");
  }
  
  public Class(int _block, String _name, String _teacher) {
    SetValues(_block, _name, _teacher);
  }
  
  public void SetValues(int _block, String _name, String _teacher) {
    Block = _block;
    Name = _name;
    Teacher = _teacher;
  }

  public void PrintClass()
  {
    System.out.println("Block: " + Block + ", Name: " + Name);
  }
  
  public void PrintClassVerbose(int id)
  {
    System.out.println("ID: " + id + ", Block: " + Block + ", Name: " + Name + ", Teacher: " + Teacher);
  }
}