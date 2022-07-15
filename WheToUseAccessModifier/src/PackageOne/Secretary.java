package PackageOne;
public class Secretary extends Employee{
    
    private String specialization;

    public Secretary(String specializationString, Integer ID,String Name, String position,String department){
        super(ID, Name, position, department);
        this.specialization = specializationString;
        //...
    }

    public String getSpecialization(){
        return this.specialization;
    }
}
