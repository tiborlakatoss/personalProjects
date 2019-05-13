package Jsonmapping.Jsonmapping;

import java.util.List;

public class Question {

	private String question;
	private List<String> options;
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;

	}

	public void getAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", option=" + options + ", answer=" + answer + "]";
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOption() {
		return options;
	}

	public void setOption(List<String> options) {
		this.options = options;
	}

}
