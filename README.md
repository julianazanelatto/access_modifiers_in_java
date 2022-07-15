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

Protegido - fora do mesmo pacote acessível apenas pelas subclasses
default - (sem definir modificadores de acesso) acessível apenas dentro do mesmo pacote

![image](https://user-images.githubusercontent.com/81716096/179139903-270e0904-c3ff-40c6-a5b3-f371b3fc9a5b.png)

