package java0418_test;

public class Calc {
    int a;
    int b;

    void calc(char i){
        switch (i){
            case '+' : System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-' : System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*' : System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '/' : System.out.println(a+" * "+b+" = "+(a*b));
                break;
        }

    }
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.a= 10;
        calc.b = 5;

        calc.calc('+');
        calc.calc('-');
        calc.calc('*');
        calc.calc('/');
    }
}
