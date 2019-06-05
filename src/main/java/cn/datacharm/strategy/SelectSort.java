package cn.datacharm.strategy;

/**
 * create by hjx on 2019-05-16
 */
public class SelectSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int len = arr.length;
        T temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j].compareTo(temp)<0) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("选择排序");
    }
}
