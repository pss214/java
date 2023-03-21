package java0321;

public class Loop {
    public static void dowhileEx(){
        int num = 1;
        int sum = 0;
        do{
            sum += num;
            num++;
        }while (num<=10);
        System.out.println("dowhile)1부터 10까지의 합은 "+sum+"입니다");
        //구구단
        for (int dan = 1; dan < 10; dan++) {
            for (int times = 1; times < 10; times++) {
                System.out.println(dan+"x"+times+"="+dan*times);
            }
        }
    }
    public static void forEx(){
        int sum = 0;
        for (int i = 0; i <=10;i++) {
            sum += i;
        }
        System.out.println("for)1부터 10까지의 합은 "+sum+"입니다");
    }
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10 ) {
            sum += num;
            num++;
        }
        System.out.println("while)1부터 10까지의 합은 "+sum+"입니다");

        dowhileEx();
        forEx();
    }
}
