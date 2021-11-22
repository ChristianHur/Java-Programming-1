public class HighSchoolStudent extends Student {
	private int cost = 5500;
	private String level = "High School";

	public HighSchoolStudent(int sid, String lastName, String firstName) {
		super(sid, lastName, firstName);
		this.setTuition(this.cost);
		this.setType(this.level);

	}

	@Override
	public void setTuition(int tuition) {
		this.tuition = tuition;		
	}
	@Override
	public void setType(String type) {
		this.type = type;
		
	}
}
