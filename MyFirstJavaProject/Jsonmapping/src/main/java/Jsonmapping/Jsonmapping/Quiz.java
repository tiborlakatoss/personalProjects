package Jsonmapping.Jsonmapping;

public class Quiz {

	private Category sport;
	private Category maths;

	public Category getSport() {
		return sport;
	}

	public void setSport(Category sport) {
		this.sport = sport;
	}

	public Category getMaths() {
		return maths;
	}

	public void setMaths(Category maths) {
		this.maths = maths;
	}

	@Override
	public String toString() {
		return "Quiz [sport=" + sport + ", maths=" + maths + "]";
	}

}
