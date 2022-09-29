package Task2;

import java.util.ArrayList;
import java.util.List;

public class Info {
    List<Pair> info = new ArrayList<>();

    public List<Pair> getInfo() {
        return info;
    }

    public void setInfo(List<Pair> info) {
        this.info = info;
    }

    public void print(){
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i).getString()+" "+ info.get(i).getNumber());
        }
    }

    public void add(String str, int number){
        Pair pair_2 = new Pair(str, number);
        info.add(pair_2);
    }

    public void add(Pair pair_2){
        info.add(pair_2);
    }
}
