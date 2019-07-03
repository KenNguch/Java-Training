package Intermidiate.Overloading;

public class Template {
    public float calculator(float x, float y) {
        return x + y;
    }

    public int calculator(int x, int y) {
        return x + y;
    }

    public float calculator(int x, float y) {

        return x + y;
    }
}
