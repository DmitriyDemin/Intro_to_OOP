package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stream implements Iterator<StudentGroup> {

    private String nameStream;
    public ArrayList<StudentGroup> stream = new ArrayList<>();
    private int index = 0;

    public Stream(String nameStream) {
        this.nameStream = nameStream;
    }

    public void addStudentGroup(StudentGroup group){
        stream.add(group);
    }

    public int getSize() {
        return stream.size();
    }

    @Override
    public boolean hasNext() {
        return index < stream.size();
    }

    @Override
    public StudentGroup next() {
        return stream.get(index++);
    }

    @Override
    public String toString(){
        return nameStream;
    }






}
