package BuiderPattern;

//Builder
public interface StudentBuilder {
	StudentBuilder setId(String id);
	StudentBuilder setFisrtName(String firstName);
	StudentBuilder setLastName(String lastName);
	StudentBuilder setDateOfBirth(String dateOfBirth);
	StudentBuilder setCurrentClass(String currentClass);
	StudentBuilder setPhone(String phone);
	
	Student build();
}
