
public class ClasseB implements InterfaceA {

    private int b;
    private int a;

    public ClasseB() {
        setB(0);
        setA(0);
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getA() {
        return a;
    }
}