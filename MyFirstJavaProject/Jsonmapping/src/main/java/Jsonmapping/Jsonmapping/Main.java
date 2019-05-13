package Jsonmapping.Jsonmapping;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Question sportQ1 = new Question();

		sportQ1.setQuestion("Which one is correct team name in NBA?");

		sportQ1.setOption(
				Arrays.asList("New York bulls", "Los Angeles Kings", "Golden State Warriors", "Huston Rocket"));

		sportQ1.setAnswer("Huston Rocket");

		Category sport = new Category();

		sport.setQ1(sportQ1);

		Quiz quiz = new Quiz();
		quiz.setSport(sport);

		QuizWrapper quizWrapper = new QuizWrapper();
		quizWrapper.setQuiz(quiz);
		ObjectMapper objectMapper = new ObjectMapper();

		Question mathsQ1 = new Question();

		mathsQ1.setQuestion("question: 5 + 7 = ?");

		mathsQ1.setOption(Arrays.asList("10", "11", "12", "13"));

		mathsQ1.setAnswer("12");

		Category maths = new Category();

		maths.setQ1(mathsQ1);

		quiz.setMaths(maths);

		quizWrapper.setQuiz(quiz);

		String json = objectMapper.writeValueAsString(quizWrapper);

		// System.out.println(json);

		String json2 = "{\"quiz\":{\"sport\":{\"q1\":{\"question\":\"Which one is correct team name in NBA?\",\"answer\":\"Huston Rocket\",\"option\":[\"New York bulls\",\"Los Angeles Kings\",\"Golden State Warriors\",\"Huston Rocket\"]},\"q2\":null},\"maths\":{\"q1\":{\"question\":\"question: 5 + 7 = ?\",\"answer\":\"12\",\"option\":[\"10\",\"11\",\"12\",\"13\"]},\"q2\":null}}}";
		QuizWrapper quizWrapper2 = objectMapper.readValue(json2, QuizWrapper.class);
		System.out.println(quizWrapper2);
	}

}
