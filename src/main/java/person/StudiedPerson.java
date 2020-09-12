package person;

import interaces.ProblemPerfectSolvable;

public abstract class StudiedPerson extends GeneralPerson implements ProblemPerfectSolvable {

    public StudiedPerson(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "StudiedPerson{" +
                "name='" + name + '\'' +
                '}';
    }
}
