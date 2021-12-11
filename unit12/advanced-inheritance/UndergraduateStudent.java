/**
 * Child class of Student
 */
public class UndergraduateStudent extends Student {
	private int cost = 8_500;
	private String level = "Undergraduate";

	public UndergraduateStudent(int sid, String lastName, String firstName) {
		super(sid, lastName, firstName);
		
		// Set tuition and type for Undergraduate student
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
