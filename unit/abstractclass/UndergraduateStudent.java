public class UndergraduateStudent extends Student {
	private int cost = 8500;
	private String level = "Undergraduate";


	public UndergraduateStudent(int sid, String lastName, String firstName) {
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
