package cn.datacharm.strategy.students;

/**
 * @author datacharm.cn
 */
public class StrategyTest {
    public static void main(String[] args) {
        Student s1 = new Student(1,"herb",20);
        Student s2 = new Student(3,"fei",22);
        Student s3 = new Student(2,"fei",21);
        Student[] students = {s1,s2,s3};
        Sort sort1 = new SortSno();
        Sort sort2 = new SortAge();
        Sort sort3 = new SortName();
        Sort sort4 = new SortNameAndAge();
        StudentContext context = new StudentContext(sort4);
        context.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
