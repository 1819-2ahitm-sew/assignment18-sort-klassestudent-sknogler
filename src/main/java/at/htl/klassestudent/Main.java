package at.htl.klassestudent;

public class Main{
    public static void main(String[] args) {
        Student tobi = new Student("Tobi", "Höfler", 8);
        Student fitz = new Student("Jakob", "Fitzinger", 7);
        Student merlin = new Student("Meris", "Besic", 1);

        Student[] students = new Student[] {tobi, fitz, merlin};

        Klasse klasse = new Klasse(2, students);

        System.out.println("BUBBLE_SORTED:    ");
        showArray(klasse.sortBubble(students));
        System.out.println("INSERTION_SORTED: ");
        showArray(klasse.sortInsert(students));

    }

    public static void showArray(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.printf(students[i].kat+"\n");
        }

    }
}
