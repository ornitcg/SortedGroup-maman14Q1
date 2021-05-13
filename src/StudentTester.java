
public class StudentTester {

    public static void main(String[] args) {

        SortedGroup<Student> studentGroup = new SortedGroup<Student>();


        Student s1 = new Student("David", "012345678", 68);
        Student s2 = new Student("Moshe", "234567890", 55);
        Student s3 = new Student("Dikla", "111222334", 100);
        Student s4 = new Student("Michal", "123456678", 58);
        Student s5 = new Student("Yona", "052642830", 92);
        Student s6 = new Student("Moria", "115622334", 100);


        studentGroup.add(s1);
        studentGroup.add(s2);
        studentGroup.add(s3);
        studentGroup.add(s4);
        studentGroup.add(s5);

        System.out.println("The initial group of student sorted by grade");
        System.out.println(studentGroup);

        System.out.println("The  group after removal of student Michal");
        studentGroup.remove(s4);
        System.out.println(studentGroup);

        System.out.println("The  group after removal of student David");
        studentGroup.remove(s1);
        System.out.println(studentGroup);

        System.out.println("The  group after addition of Moria");
        studentGroup.add(s6);
        System.out.println(studentGroup);


        SortedGroup<Student> reducedStudentGroup = GroupUtils.reduce(studentGroup, new Student(60));
        System.out.println("The  group of student with grage above 60");

        System.out.println(reducedStudentGroup);





        System.out.println("The  group after removal of all student with grade 100");
        studentGroup.remove(s3);
        System.out.println(studentGroup);

        reducedStudentGroup = GroupUtils.reduce(studentGroup, new Student(60));
        System.out.println("The  group of student with grage above 60");

        System.out.println(reducedStudentGroup);


    }
}
