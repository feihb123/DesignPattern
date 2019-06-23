package cn.datacharm.strategy.students;

/**
 * 策略Context类
 * @author datacharm.cn
 */
public class StudentContext {
    private Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }


    public StudentContext(Sort sort) {
        this.sort = sort;
    }

    public void sort(Student[] students){
        this.sort.sort(students);
    }
}
