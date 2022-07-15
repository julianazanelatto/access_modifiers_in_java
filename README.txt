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

