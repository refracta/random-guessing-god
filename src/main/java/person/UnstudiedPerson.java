package person;

import interaces.ProblemPatternGuessable;

public abstract class UnstudiedPerson extends GeneralPerson implements ProblemPatternGuessable {
    public UnstudiedPerson(String name) {
        super(name);
    }

    public abstract String getPattern();

    @Override
    public String toString() {
        return "UnstudiedPerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
