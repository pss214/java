package java0404;

class PersonThis{
    String name;
    int age;

    PersonThis(){
        this("이름없음", 1,1);
    }

    PersonThis(String name, int age, int age2) {
        this.name = name;
        this.age = age;
    }

    PersonThis returnSelf() {
        return this;
    }
}
public class ThisContruct {
    public static void main(String[] args) {
        PersonThis personThis = new PersonThis();
        System.out.println(personThis.name);
        System.out.println(personThis.age);

        PersonThis personThis1 = personThis.returnSelf();
        System.out.println(personThis);
        System.out.println(personThis1);
    }
}
