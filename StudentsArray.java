public class StudentsArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Val";
        s1.grade = 5;
        Student s2 = new Student();
        s2.id = 2;
        s2.name = "James";
        s2.grade = 4;
        Student s3 = new Student();
        s3.id = 1;
        s3.name = "Kati";
        s3.grade = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].grade);
        // }
        
        //enhanced for loop
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.grade);
        }
    }
}
