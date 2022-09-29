package Task2;

public class Pair<S> {
    private String string;
    private S number;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public S getNumber() {
        return number;
    }

    public void setNumber(S number) {
        this.number = number;
    }

    public Pair(String string, S number) {
        this.string = string;
        this.number = number;
    }

    public Pair(){

    }

}
