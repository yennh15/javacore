package BuiderPattern;

public class StudentConcreteBuilder implements StudentBuilder {
	private String id;
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String currentClass;
	private String phone;

	@Override
	public StudentBuilder setId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public StudentBuilder setFisrtName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public StudentBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public StudentBuilder setDateOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
		return this;
	}

	@Override
	public StudentBuilder setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
		return this;
	}

	@Override
	public StudentBuilder setPhone(String phone) {
		this.phone = phone; 
		return this;
	}

	@Override
	public Student build() {
		// TODO Auto-generated method stub
		return new Student(id, firstName,lastName,dayOfBirth,currentClass,phone);
	}

}
