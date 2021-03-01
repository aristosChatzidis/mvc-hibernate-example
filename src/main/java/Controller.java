import model.DAO;
import model.Student;
import model.Teacher;

public class Controller {

    private static DAO dbOperations;

    public static void main(String[] args) {
        dbOperations = new DAO();

        Student Student = new Student();
        Student.setAge(24);
        Student.setClasses(12);
        Student.setName("James");
        Student.setSurname("Kirk");
        dbOperations.create(Student);

        Student student1 = new Student();
        student1.setAge(24);
        student1.setClasses(12);
        student1.setName("James");
        student1.setSurname("Kirk");
        dbOperations.create(student1);

        Teacher Teacher = new Teacher();
        Teacher.setAge(44);
        Teacher.setName("Dave");
        Teacher.setSurname("Willis");
        Teacher.setId("3f23");
        dbOperations.create(Teacher);

        Student student = (Student) dbOperations.read(Student.class, 1);
        dbOperations.delete(Teacher.class,"3f23");
        Student student2 = (Student) dbOperations.update(Student.class,2);
        student2.setSurname("J Kirk");


        dbOperations.commitTransaction();

        System.out.println("Student :" + student.getName() + " " + student.getSurname());
        System.out.println("Will change name to : "+ student2.getName() + " " + student2.getSurname());


    }
}
