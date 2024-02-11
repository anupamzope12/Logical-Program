package Objectequalsmethod;

import java.util.Objects;

public class MyClass {
    private int id;
    private String name;

    // Constructors, getters, setters, etc.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass myObject = (MyClass) obj;
        return id == myObject.id && Objects.equals(name, myObject.name);
    }
public static void main(String[] args) {
MyClass m=new MyClass();
String s="5445";
System.out.println(m.equals(s));;
}    

    // Other methods...
}
