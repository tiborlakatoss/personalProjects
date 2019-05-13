package inheritanceExample;

public class Lion extends Animal {

	private int nrDinti;

	public Lion() {
		setAge(0);
	}

	public int getNrDinti() {
		return nrDinti;
	}

	public void setNrDinti(int nrDinti) {
		this.nrDinti = nrDinti;
	}

}
