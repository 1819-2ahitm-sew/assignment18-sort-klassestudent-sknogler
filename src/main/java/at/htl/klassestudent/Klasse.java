package at.htl.klassestudent;

public class Klasse{
    int klassenbezeichnung;
    Student[] students;

    public Klasse() {
    }

    public Klasse(int klassenbezeichnung, Student[] students) {
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public Student[] sortBubble(Student[] students) {
        Student h;

        for (int i = 1; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].kat > students[j + 1].kat) {
                    h = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = h;
                }
            }
        }

        return students;
    }

    public Student[] sortInsert(Student[] students) {
        Student h;

        for (int i = 1; i < students.length; i++) {
            h = students[i];

            int j = i;

            while (j > 0 && students[j - 1].kat > h.kat) {
                students[j] = students[j - 1];
                j--;
            }
            students[j] = h;
        }
        return students;
    }
}
