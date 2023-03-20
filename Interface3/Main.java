package Interface3;

public class Main {
    public static void main(String[] args) {

        Employee [] employees = new Employee[5];

        employees[0] = new Employee(304, "DD", 1200);
        employees[1] = new Employee(230, "GG", 6200);
        employees[2] = new Employee(189, "AA", 7200);
        employees[3] = new Employee(546, "ZZ", 3200);
        employees[4] = new Employee(202, "BB", 5200);

        for(Employee e : employees) {
            System.out.println(e);
        }

        System.out.println();

        EmpComparator empComparator = new EmpComparator();
        UtilNew.sort(employees, empComparator);

        for(Employee e : employees) {
            System.out.println(e);
        }

        System.out.println();

        Student [] students = new Student[5];
        students[0] = new Student(48, "LMN", 44);
        students[1] = new Student(11, "ABC", 66);
        students[2] = new Student(39, "PQR", 88);
        students[3] = new Student(29, "DGH", 55);


        StudentComparator studentComparator = new StudentComparator();
        UtilNew.sort(students, studentComparator);

        for(Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        UtilNew.sort(students, new StudentComparatorByMarks() );

        for(Student s : students) {
            System.out.println(s);
        }

        System.out.println("***********************************************");

        UtilNew.sort(students);
        for(Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        UtilNew.sort(employees);
        for(Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        UtilNew.sort(
                students,
                new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Student s1 = (Student) o1;
                        Student s2 = (Student) o2;

                        if(s1.getMarks() > s2.getMarks()) {
                            return 1;
                        }
                        if(s1.getMarks() < s2.getMarks()) {
                            return -1;
                        }
                        return 0;
                    }
                }
        );
        for(Student s : students) {
            System.out.println(s);
        }

    }
}
