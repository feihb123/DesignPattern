package cn.datacharm.strategy.students;

/**
 * 通过姓名排序
 * @author datacharm.cn
 */
public class SortName implements Sort{
    @Override
    public void sort(Student[] students) {
        int len = students.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                Student temp;
                if(students[i].getName().compareTo(students[j].getName()) > 0){
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }
}
