import java.util.Arrays;
import java.util.List;

import impl.person.A;
import impl.person.B;
import impl.person.C;
import impl.person.D;
import person.GeneralPerson;
import utils.ProblemGenerator;
import static utils.ProblemGenerator.InvalidNumberOfChoicesException;

public class Starter {
    public static void main(String[] args) throws InvalidNumberOfChoicesException {
        List<GeneralPerson> personList = Arrays.asList(new GeneralPerson[]{new A(), new B(), new C(), new D()});

        String exampleProblem = "12543341243245321345";
        String generatedProblem = ProblemGenerator.generate(5, 20);
        System.out.println("Test - ExampleProblem");
        personList.stream().forEach(p -> System.out.println(p.getName() + ": " + p.solve(exampleProblem)));
        System.out.println("Test - GeneratedProblem");
        personList.stream().forEach(p -> System.out.println(p.getName() + ": " + p.solve(generatedProblem)));
    }
}
