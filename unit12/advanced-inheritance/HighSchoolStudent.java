public class HighSchoolStudent extends Student {
	private int cost = 5_500;
	private String level = "High School";

	public HighSchoolStudent(int sid, String lastName, String firstName) {
		super(sid, lastName, firstName);

		// Set tuition and type for High School student
		this.setTuition(this.cost);
		this.setType(this.level);

	}

	// Abstract methods required to be implemented

	@Override
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}
}
