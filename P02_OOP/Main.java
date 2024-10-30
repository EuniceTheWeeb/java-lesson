package P02_OOP;

class Employee {
    
    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.firstName = "John";
        e.lastName = "Doe";

        System.out.println(e.firstName);
        System.out.println(e.lastName);
    }
}

// private, public, protected: access modifiers
// private: only code within that class can be accessed & modified
// public: code can be accessed & modified regardless of class
// package: public to all code in the same package

// getter - public String getTitle() {
//     return title;
//  }
//  setter - public void setTitle(String title){
//     this.title = title;
//  }

// getter: return member variable from class
// setter: change values of member variable

// static is only used when sharing methods across the same class, rarely used
// "this." refers to current object, member variable of a class, cannot used in static