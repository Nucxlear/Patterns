public class PersonBuilder implements Builder{
    Person person = new Person();
    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setFirstName(String firstName) {
        person.first_name = firstName;
        return this;
    }

    @Override
    public PersonBuilder setSecondName(String secondName) {
        person.second_name = secondName;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
