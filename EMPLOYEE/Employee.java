package EMPLOYEE;

public class Employee {
    private String name ;
    private int age ;
    private  int salary ;
    String getEmployeeDetails(){
        return  " employee name : "+name +" age : "+age+" salary : "+salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
