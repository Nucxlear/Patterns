public interface Builder {
    PersonBuilder setAge(int age);
    PersonBuilder setFirstName(String firstName);
    PersonBuilder setSecondName(String secondName);
    Person build();
}
