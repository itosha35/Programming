package data;

public class Log<N> {
    static int count = 1;
    private final int id;
    private final N numbers;
    private final N result;


    public Log(N numbers, N result) {
        this.id = count++;
        this.numbers = numbers;
        this.result = result;
    }

    @Override
    public String toString() {
        return id + " " + numbers + " = " + result;
    }
}