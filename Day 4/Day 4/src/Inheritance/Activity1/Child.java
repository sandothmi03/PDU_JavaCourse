package Inheritance.Activity1;

public class Child extends Parent {
    private String email;

    public void think(){
        System.out.println("Child is thinking");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
