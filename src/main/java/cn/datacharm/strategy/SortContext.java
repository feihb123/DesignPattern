package cn.datacharm.strategy;

public class SortContext  {

    private Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public <T extends Comparable> void sort(T[] arr) {
        sort.sort(arr);
    }
}
