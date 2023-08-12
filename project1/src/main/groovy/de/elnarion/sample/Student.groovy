package de.elnarion.sample

class Student {
    int StudentID;
    String StudentName;

    int Marks1;
    int Marks2;
    int Marks3;

    int Total() {
        return Marks1 + Marks2 + Marks3;
    }
}

class Teacher {
    int TeacherID;
    String TeacherName;

    int Marks1;
    int Marks2;
    int Marks3;

    int Total() {
        return Marks1 + Marks2 + Marks3;
    }
}