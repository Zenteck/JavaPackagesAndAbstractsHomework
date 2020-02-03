package staff;

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

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }


    public void raiseSalary(double raise){
        this.salary = this.salary * (1 + raise/100);
    }

    public double payBonus(){
        return this.salary/100;
    }
}
