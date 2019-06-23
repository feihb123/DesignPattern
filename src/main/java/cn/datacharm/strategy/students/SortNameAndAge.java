package cn.datacharm.strategy.students;

/**
 * 通过姓名和年龄排序
 * @author datacharm.cn
 */
public class SortNameAndAge implements Sort{
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
                }else if(students[i].getName().compareTo(students[j].getName()) == 0){
                    if(students[i].getAge() > students[j].getAge()){
                        temp = students[j];
                        students[j] = students[i];
                        students[i] = temp;
                    }
                }
            }
        }

    }
}
