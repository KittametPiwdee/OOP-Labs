package Lab2.Q4;

public class Child extends Person {
    protected Person guardian;
    protected int age;
    protected int height;
    protected double weight;

    public Child(int a,int h,double w){
        super();
        this.age = a;
        this.height = h;
        this.weight = w;
    }
    public void setGuardian(Person g){
        this.guardian = g;
    }
    public Person getGuardian(){
        return guardian;
    }
}
