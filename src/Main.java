import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jerzy", "Kisielewski", new Date(), "Gorzow Wlkp", "jmkisielewski@gmail.com", 123456789);
        person.save();
        System.out.println(person.getEmail());
        System.out.println(person.getBirthDate());
        System.out.println(person.getBirthPlace());
        System.out.println();
        person.setEmail("jerzy.kisielewski@zsegw.pl");
        person.save();
        person.setBirthDate(null);
        person.save();
        person.setBirthPlace("Gorzów");
        person.save();
        System.out.println(person.getEmail());
        System.out.println(person.getBirthDate());
        System.out.println(person.getBirthPlace());
        System.out.println();
        person.restore();
        System.out.println(person.getEmail());
        System.out.println(person.getBirthDate());
        System.out.println(person.getBirthPlace());
    }
}