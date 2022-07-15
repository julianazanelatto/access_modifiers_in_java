package PackageTwo;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Manager s = new Manager("Finances", 930, "Carlos", "Assitent", "RH");
        //s.getSpecialization();
     
        //Integer id = s.ID;          // private: not visible
        //String name = s.Name;       // protected: not visible in the main only for the subclass (in another package)
        String pos = s.position;    // public
        //String dept = s.department; // default: not visible 

    }
}
