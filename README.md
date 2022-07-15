# access_modifiers_in_java

Entendendo modificadores de acesso em Java.

public class Employee{
    private Integer ID;      // visível apenas pela classe (dona = mantedora)
    protected String Name;   // visível apenas pelas subclasses em pacotes externos
    public String position;  // visível para qualquer classe
    String department;       // default: visível apenas para as subclasses dentro do mesmo pacote
    
    public Employee(Integer ID, String Name, String position, String department){
        this.ID = ID;
        this.Name = Name;
        this.position = position;
        this.department = department;
    }
}

Access Modifiers
https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in

![image](https://user-images.githubusercontent.com/81716096/179139040-42d7b88d-6cb3-4464-bfb6-79941761d28c.png)
