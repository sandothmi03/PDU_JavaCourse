package Encapsulation.Exercise4;

public class Employee {
    private String name;
    private int empID;
    private String email;

    public Employee(String name, int empID, String email) {
        this.name = name;
        this.empID = empID;
        this.email = email;

    }
    public Employee(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public int getEmpID(){
        return empID;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
