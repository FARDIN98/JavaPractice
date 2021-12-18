
package OOP.lab.Interface;


public class Bird implements Flyable {
    @Override
    public void fly(){
        System.out.println("Bird is flying in " + media);
    }
    
    @Override
    public boolean needFuel(){
        return false;
    }
}
