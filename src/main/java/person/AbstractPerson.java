package person;

public abstract class AbstractPerson {
    protected String name;
    public abstract String getName();
    public abstract void setName(String name);

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract String toString();
}
