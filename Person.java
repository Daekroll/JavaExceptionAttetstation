public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthDay;
    private int phoneNumber;
    private String gender;

    public Person(String[] arr) {
        this.surname = arr[0];
        this.name = arr[1];
        this.patronymic = arr[2];
        this.birthDay = arr[3];
        this.phoneNumber = Integer.parseInt(arr[4]);
        this.gender = arr[5];
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, name, patronymic, birthDay, phoneNumber, gender);
    }

}
