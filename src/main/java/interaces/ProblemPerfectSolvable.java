package interaces;

public interface ProblemPerfectSolvable extends ProblemSolvable {
    /**
     * 문제를 완벽하게 푸는 객체에게 구현되어야 하는 메소드입니다.
     * @param problem
     * @return 맞은 개수
     */
    @Override
    default int solve(String problem) {
        return problem.length();
    }
}
