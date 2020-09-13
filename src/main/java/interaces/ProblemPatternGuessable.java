package interaces;


import java.util.stream.IntStream;

public interface ProblemPatternGuessable extends ProblemGuessable {
    /**
     * ProblemGuessable의 구현입니다. patternGuess를 통해 결과를 얻습니다.
     * @param problem
     * @return 맞은 개수
     */
    @Override
    default int guess(String problem) {
        return this.patternGuess(problem, this.getPattern());
    }

    /**
     * 찍기 패턴을 반환합니다.
     * @return 찍기 패턴
     */
    String getPattern();

    /**
     * problem을 pattern에 맞게 찍어 맞은 개수를 반환합니다. 문제를 패턴을 통해 찍어 맞추는 개체에게 구현되어야하는 메소드입니다.
     * @param problem
     * @param pattern
     * @return 맞은 개수
     */
    default int patternGuess(String problem, String pattern) {
        return (int) IntStream.range(0, problem.length()).filter(i -> problem.charAt(i) == pattern.charAt(i % pattern.length())).count();
    }
}
