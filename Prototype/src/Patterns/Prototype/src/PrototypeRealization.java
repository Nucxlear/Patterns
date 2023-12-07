package Patterns.Prototype.src;

public class PrototypeRealization implements Prototype{

    PrototypeRealization(){
    }
    public Object copy() {
        PrototypeRealization copy = new PrototypeRealization();
        return copy;
    }
}
