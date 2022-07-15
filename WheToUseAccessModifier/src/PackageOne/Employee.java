package PackageOne;

public class Employee{

    private Integer ID;      // visable only for the class
    protected String Name;   // viseable only for subclasses in the package
    public String position;  // viseable for any class even in others packages
    String department;       // default: viseable only for the subclasses inside the same package

    public Employee(Integer ID, String Name, String position, String department){
        this.ID = ID;
        this.Name = Name;
        this.position = position;
        this.department = department;
    }

    public Integer getID(){
        return this.ID;
    }

    public String getName(){
        return this.Name;
    }

    public String getPosition(){
        return this.position;
    }
    
    public String getDepartment(){
        return this.department;
    }
}