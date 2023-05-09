package java0509.scheduler;

import java.io.IOException;

public class SchedulerEx {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고있거나 대기가 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객먼저 상담");
        Scheduler scheduler = null;
        while (true) {
            int ch = System.in.read();//아스키코드로 받겠다
            if (ch == 'R' || ch == 'r') {
                scheduler = new RoundRobin();
                break;
            }else if (ch == 'L' || ch =='l'){
                scheduler = new LeastJob();
                break;
            }
            else if (ch == 'P' || ch =='p'){
                scheduler = new PriorityAllocation();
                break;
            }else{
                System.out.println("지원되지 않는 기능입니다");
            }
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
