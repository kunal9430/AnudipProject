package hotelproject;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    
    private Long id;
    private String name;
    private String position;
    private String dob;
   
    private double salary;

    public Employee() {
        // Default constructor required by Hibernate
    }

    public Employee( long id,String name, String position,String dob , double salary) {
    	this.id=id;
        this.name = name;
        this.position = position;
        this.dob=dob;
       
        this.salary = salary;
    }

    // Getters and setters for all attributes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

  

    public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", dob=" + dob + ", salary="
				+ salary + "]";
	}

   
   
}
