package Lab2.Q4;
public class Parent extends Person {
    protected Child child;
    protected int money;
    
    public Parent(){
        super();
    }
    public void setChild(Child c){
        this.child = c;
    }
    public Child getChild(){
        return child;
    }
}
