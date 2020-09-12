package interaces;

public interface ProblemGuessable extends ProblemSolvable{
    /**
     * 문제를 추측하여 푸는 객체에게 구현되어야 합니다.
     * @param problem
     * @return 맞은 개수
     */
    int guess(String problem);

    /**
     * ProblemSolvable의 구현입니다. guess 통해 결과를 얻습니다. 이 메소드를 오버라이드하여 추측 결과를 실제 풀이에 연결할 때 전처리를 할 수 있습니다.
     * ex) 어떤 개체는 추측 결과보다 1개 더 적은 문제를 맞춘다던지
     * @param problem
     * @return 맞은 개수
     */
    default int solve(String problem){
        return this.guess(problem);
    }
}
