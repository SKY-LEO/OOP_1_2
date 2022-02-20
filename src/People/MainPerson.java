package People;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Русецкий Л. С.");
        person1.setAge(18);
        Person person2 = new Person("Митрофанова К. П.", 17);
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
    }
}
