public class GraduateStudent extends Student {
	private int cost = 15_000;
	private String level = "Graduate";

	public GraduateStudent(int sid, String lastName, String firstName) {
		super(sid, lastName, firstName);

		// Set tuition and type for Graduate student
		this.setTuition(this.cost);
		this.setType(this.level);
	}

	// Abstract methods required to be implemented

	@Override
	public void setTuition(int tuition) {
		this.tuition = this.cost;
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}
}
