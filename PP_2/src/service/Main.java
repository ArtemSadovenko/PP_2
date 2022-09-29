package service;

public class Main {
    public static void main(String[] args) {
        //Subjects
        ListSubject sj_1 = new ListSubject();
        sj_1.add("Math", 4);
        sj_1.add("Java", 2);
        sj_1.add("OOP", 5);

        ListSubject sj_2 = new ListSubject();
        sj_2.add("Math", 3);
        sj_2.add("Angl", 2);
        sj_2.add("OOP", 4);

        ListSubject sj_3 = new ListSubject();
        sj_3.add("Angl", 4);
        sj_3.add("Java", 5);
        sj_3.add("OOP", 1);

        ListSubject sj_4 = new ListSubject();
        sj_4.add("Math", 3);
        sj_4.add("Java", 3);
        sj_4.add("Angl", 3);

        //Students
        ListStudent st_1 = new ListStudent();
        st_1.add("Bob", sj_1);
        st_1.add("Anna", sj_2);

        ListStudent st_2 = new ListStudent();
        st_2.add("Dan", sj_3); //Dan
        st_2.add("Clifford", sj_4); //Clifford

        //Info
        ListInfo in_1 = new ListInfo();
        in_1.add("Math","21.04.22");
        in_1.add("Angl","21.04.22");
        in_1.add("OOP","22.04.22");
        in_1.add("Java","22.04.22");
        in_1.add("Math","23.04.22");
        in_1.add("Java","23.04.22");

        ListInfo in_2 = new ListInfo();
        in_2.add("OOP","21.04.22");
        in_2.add("Angl","21.04.22");
        in_2.add("Java","22.04.22");
        in_2.add("Angl","22.04.22");
        in_2.add("Math","23.04.22");
        in_2.add("OOP","23.04.22");

        //Groups
        ListGroup gp_1 = new ListGroup();
        gp_1.add("IT-11", st_1, in_1);
        gp_1.add("IT-12", st_2, in_2);

        //Univer
        ListUniver un_1 = new ListUniver();
        un_1.add("LPNU", gp_1);

        un_1.print();

        un_1.addSubject("Geo", 1);
        un_1.addInfo("Geo", 1, "21.09.22");

        un_1.print();

        un_1.sort();
        un_1.search("Geo");


        un_1.printRate();

        un_1.changeRate("Bob", "Geo", -1);
        un_1.changeRate("Anna", "Geo", 4);
        un_1.changeRate("Clifford", "Java", 5);


        un_1.printRate();

        un_1.printSubject("OOP");
        un_1.printStud("Clifford");
    }
}
