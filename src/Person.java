import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String birthPlace;
    private String email;
    private Integer phoneNumber;

    public Person(String firstName, String lastName, Date birthDate, String birthPlace, String email, Integer phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void save(){
        Person person = new Person(firstName, lastName, birthDate, birthPlace, email, phoneNumber);
        History.save(person);
    }

    public void restore(){
        Person person = History.restore();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.birthDate = person.getBirthDate();
        this.birthPlace = person.getBirthPlace();
        this.email = person.getEmail();
        this.phoneNumber = person.getPhoneNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
