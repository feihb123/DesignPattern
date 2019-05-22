package cn.datacharm.adaptor;

public class Test {
    public static void main(String[] args) {
        CharArraySortAdapter adapter = new CharArraySortAdapter(new FileInput());
        adapter.sort();
    }
}
