package Task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Pair> subjects = new ArrayList<>();

    public List<Pair> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Pair> subjects) {
        this.subjects = subjects;
    }

    public void print(){
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(name+ " "+subjects.get(i).getString()+" "+ subjects.get(i).getNumber());
        }
    }

    public void add(String str, int number){
        Pair pair_2 = new Pair(str, number);
        subjects.add(pair_2);
    }

    public Student(String name, List<Pair> list){
        this.name = name;
        subjects = list;
    }
}
