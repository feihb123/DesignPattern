package cn.datacharm.strategy;

/**
 * create by hjx on 2019-05-16
 */
public class InsertionSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            T temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(temp)>0) {
                    arr[j] = arr[j - 1];

                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("插入排序");
    }
}
