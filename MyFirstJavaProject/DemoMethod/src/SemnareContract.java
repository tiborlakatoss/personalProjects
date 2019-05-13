
public class SemnareContract {

	public static void main(String[] args) {
		SoftwareDevelopmentAcademy grupaJavaCluj3 = new SoftwareDevelopmentAcademy();
		Student sergiu = new Student();
		sergiu.name = "Sergiu Vasila Jisa";
		sergiu.grade = 4;
		Student tibi = new Student();
		tibi.name = "Tibor Lakatos";
		tibi.grade = 3;
		Student[] cursantii = new Student[2];
		cursantii[0] = sergiu;
		cursantii[1] = tibi;

		grupaJavaCluj3.cursantii = cursantii;
		computeNrOfSudents(grupaJavaCluj3);

	}

	public static void computeNrOfSudents(SoftwareDevelopmentAcademy oriceGrupa) {

		int countTotal = oriceGrupa.cursantii.length;
		System.out.println(countTotal);

	}

}
