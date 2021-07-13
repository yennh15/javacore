package BuiderPattern;

public class Runner {
	public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentConcreteBuilder();
        studentBuilder.setId("Test").setFisrtName("Lam");

        System.out.println(studentBuilder.build());
    }
}
