package staff;

import com.sun.istack.internal.NotNull;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raise){
        if(raise >= 0) {
            this.salary = this.salary * (1 + raise / 100);
        }
    }

    public double payBonus(){
        return this.salary/100;
    }
}
