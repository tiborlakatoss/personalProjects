package Jsonmapping.Jsonmapping;

public class QuizWrapper {
	private Quiz quiz;

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	@Override
	public String toString() {
		return "QuizWrapper [quiz=" + quiz + "]";
	}
}
