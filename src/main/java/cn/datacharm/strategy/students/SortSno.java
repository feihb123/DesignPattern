package cn.datacharm.strategy.students;

/**
 * 通过学号排序
 * @author datacharm.cn
 */
public class SortSno implements Sort{
    @Override
    public void sort(Student[] students) {
        int len = students.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                Student temp;
                if(students[i].getSno() > students[j].getSno()){
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }
}
