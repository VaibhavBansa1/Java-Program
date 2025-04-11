
// add, multiple subtract with 3 marks.
// vaibhav bansal 22017C04069

class Add {
    int a;
    int b;
    int c;

    void cal(){
        System.out.println("Addition of a:" + a + " b:" + b + " c:" + c + " = " + (a+b+c));
    }
}

class Sub {
    int a;
    int b;
    int c;

    void cal(){
        System.out.println("Subtraction of a:" + a + " b:" + b  + " c:" + c + " = " + (a - b - c));
    }
}

class Mul {
    int a;
    int b;
    int c;

    void cal(){
        System.out.println("Multiplication of a:" + a + " b:" + b + " c:" + c + " = " + (a*b*c));
    }
}

public class Math_Cal {
    public static void main(String[] args) {
        Add add_val = new Add();
        Sub sub_val = new Sub();
        Mul mul_val = new Mul();

        add_val.a = 2;
        add_val.b = 3;
        add_val.c = 4;

        add_val.cal();

        sub_val.a = 2;
        sub_val.b = 3;
        sub_val.c = 4;

        sub_val.cal();

        mul_val.a = 2;
        mul_val.b = 3;
        mul_val.c = 4;

        mul_val.cal();
    }
}
