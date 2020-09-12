package interaces;

public interface ProblemSolvable {
    /**
     * 문제를 풀 수 있는 객체에게 구현되어야 하는 메소드입니다.
     * @param problem
     * @return 맞은 개수
     */
    int solve(String problem);
}
