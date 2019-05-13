package Jsonmapping.Jsonmapping;

public class Category {

	private Question q1;

	@Override
	public String toString() {
		return "Category [q1=" + q1 + ", q2=" + q2 + "]";
	}

	private Question q2;

	public Question getQ1() {
		return q1;
	}

	public void setQ1(Question q1) {
		this.q1 = q1;
	}

	public Question getQ2() {
		return q2;
	}

	public void setQ2(Question q2) {
		this.q2 = q2;
	}

}
