package utils;

import java.util.Random;
import java.util.stream.Collectors;

public class ProblemGenerator {

    /**
     * @param numberOfChoices 문제의 선지의 개수입니다. 1과 9 사이여야합니다.
     * @param numberOfProblem 문제의 개수입니다.
     * @return 문제의 답을 문자열로 이어붙여서 반환합니다.
     * @throws InvalidNumberOfChoicesException
     */
    public static String generate(int numberOfChoices, int numberOfProblem) throws InvalidNumberOfChoicesException {
        if (numberOfChoices > 9) {
            throw new InvalidNumberOfChoicesException(numberOfChoices);
        }
        return new Random().ints(numberOfProblem, 1, numberOfChoices + 1).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining());
    }


    public static class InvalidNumberOfChoicesException extends Exception {
        public InvalidNumberOfChoicesException(int numberOfChoices) {
            super("numberOfChoices=" + numberOfChoices + ", " + "numberOfChoices must be between 1 and 9.");
        }
    }

}
