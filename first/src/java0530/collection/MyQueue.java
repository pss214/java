package java0530.collection;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();
    public void enqueue(String data){
        arrayQueue.add(data);
    }
    public String dequeue(){
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }
        return arrayQueue.remove(0);
    }
}
