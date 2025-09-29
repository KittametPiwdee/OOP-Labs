package Lab2.Q4;

public class Father extends Parent{
    protected Mother wife;

    public Father(Mother w){
        super();
        this.wife = w;
    }

    @Override
    public String getFirstName(){
        return "Mr."+firstName;
    }
}
