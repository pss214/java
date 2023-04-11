package java0404.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James",5000);
        Student studentTomas =  new Student("Tomas",5000);

        Bus bus = new Bus(100);
        studentJames.takeBus(bus);
        studentJames.takeBus(bus);
        studentJames.showInfo();
        bus.showInfo();

        Subway subway = new Subway("2호선");
        studentTomas.takesubway(subway);
        studentTomas.takesubway(subway);
        studentTomas.showInfo();
        subway.showInfo();

    }
}
