package java0509;

public class CompleteCalc extends Calculater{
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        //num1 = 0;
        //return num1 / num2;
        return num2 != 0 ? num1 / num2: 0;//3항 연산자
    }
    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다");
    }
    @Override
    public void description(){
        super.description();
    }
}
