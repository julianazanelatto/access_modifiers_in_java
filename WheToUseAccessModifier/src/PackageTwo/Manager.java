package PackageTwo;

import PackageOne.Employee;

public class Manager extends Employee{
    
    private String expertise;
    
    public Manager(String expertise, Integer ID,String Name, String position,String department){
        super(ID,Name,position,department);
        this.expertise = expertise;
    }

    // subclass attribute
    public String getSpecialization(){
        return this.expertise;
    }

    //public access modifier
    public String getPosition(){
        return this.position; // public access modifier
    }

    //default access modifier
    public String getDepartment(){
        //return this.department; //not viesable for subclasses outside the package 
        return this.getDepartment();  // já herdado não precisa especificar
    }

    //protected access modifier
    public String getName(){
        return this.Name;  // accessed only by the subclass in another package 
    }

    //private access modifier
    public Integer getID(){
        //return this.ID; //visible only for the owner class
        return this.getID();
    }
}
