class Main {
    public static void main(String args[]) {
        StudentDB newStudent = new StudentDB();
        newStudent.createList();
        newStudent.setStudent(10, "name1", 12);
        newStudent.printStudentList();
        System.out.println();
        newStudent.getName("Ravi");
        newStudent.getAge(21);
        newStudent.getRollno(10);
    }
}