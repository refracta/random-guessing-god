package person;

import interaces.ProblemSolvable;

import java.util.Objects;

public abstract class GeneralPerson extends AbstractPerson implements ProblemSolvable {
    public GeneralPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralPerson that = (GeneralPerson) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "GeneralPerson{" +
                "name='" + name + '\'' +
                '}';
    }

}
