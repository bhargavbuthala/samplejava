public class Student {
        String name;
        int rollno;
        Student(String name, int rollno){
            this.name=name;
            this.rollno=rollno;
        }

        public static void main(String[] args) {
            Student s1=new Student("bhargav", 01);
            Student s2=new Student("vijayini", 28);
            Student s3=s1;
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
        }


}
