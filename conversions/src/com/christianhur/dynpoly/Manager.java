package com.christianhur.dynpoly;
import java.text.DecimalFormat;

public class Manager extends Employee{
		private double bonus;

		public String toString() {
			DecimalFormat formatter = new DecimalFormat("#,###.00");
			return this.getFirstName() 
					+ ", " + this.getLastName() 
					+ ", " + this.getEmail()
					+ ", " + this.getTitle()
					+ ", " + this.getDepartment()
					+ ", $" + formatter.format(this.getSalary())
					+ ", $" + formatter.format(this.getBonus());
		}
		
		// Getters and Setters
		public double getBonus() {
			return bonus;
		}
		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
}
