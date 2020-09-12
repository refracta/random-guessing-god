package impl.person;

import person.UnstudiedPerson;

public class C extends UnstudiedPerson {
    public C() {
        super("C");
    }

    @Override
    public String getPattern() {
        return "123454321";
    }
}
