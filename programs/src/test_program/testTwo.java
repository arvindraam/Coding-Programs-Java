package test_program;

public class testTwo implements A, B // won't compile, error will come
{
    public static void main(String[] args) {

                testTwo obj = new testTwo();
        obj.method();
    }
    @Override
    public void method() {
        A.super.method(); // Explicitly resolve the ambiguity
    }
}

