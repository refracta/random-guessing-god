package impl.person;

import person.UnstudiedPerson;

public class A extends UnstudiedPerson {
    public A() {
        super("A");
    }

    @Override
    public String getPattern() {
        return "1524";
    }
}
