package PackageOne;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Secretary s = new Secretary("Admin", 930, "Julia", "Assistente geral", "Marketing");
        //Secretary sec = new Secretary("Admin", 930, "Julia", "Assistente geral", "Marketing");


        /*  private Integer ID;
            protected String Name;
            public String position;
            String department;
        */
        /**/
        //Integer id = s.ID;          // private: not viseable
        String name = s.Name;       // protected: not viseable for the subclass in other package
        String pos = s.position;    // public
        String dept = s.department; // default: not viasble  */
        

    }
}
