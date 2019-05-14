package com.datacharm.Adaptor;

import java.util.Arrays;

public class CharArraySortAdapter implements Target {
    FileInput fileInput;

    public CharArraySortAdapter(FileInput fileInput) {
        this.fileInput = fileInput;
    }

    @Override
    public void sort() {
        String[] strings = this.fileInput.readFromFile("filename");
        Arrays.sort(strings);
        for(String s:strings) {
            System.out.println(s);
        }
    }

}
