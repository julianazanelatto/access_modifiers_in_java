# access_modifiers_in_java

Entendendo modificadores de acesso em Java.

public class Employee{

    private Integer ID;      // visable only for the class
    protected String Name;   // viseable only for subclasses in the package
    public String position;  // viseable for any class even in others packages
    String department;       // default: viseable only for the subclasses inside the same package

    // ...
}


Access Modifiers
https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in

Protegido - fora do mesmo pacote acessível apenas pelas subclasses
default - (sem definir modificadores de acesso) acessível apenas dentro do mesmo pacote

![image](https://user-images.githubusercontent.com/81716096/179140475-57585c7c-67d6-4518-ae2d-a3b5260bcfc4.png)


