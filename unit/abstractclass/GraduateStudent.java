public class GraduateStudent extends Student {
	private int cost = 15000;
	private String level = "Graduate";

	public GraduateStudent(int sid, String lastName, String firstName) {
		super(sid, lastName, firstName);
		this.setTuition(this.cost);
		this.setType(this.level);
	}

	@Override
	public void setTuition(int tuition) {
		this.tuition = this.cost;		
	}

	@Override
	public void setType(String type) {
		this.type = type;
		
	}
}
