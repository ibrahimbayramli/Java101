public class Main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmut Hoca","TRH","901235488812");

        Teacher t2=new Teacher("Kul Yutmaz","BIO","901235488812");

        Teacher t3=new Teacher("Nikola Tesla","FZK","904328730999");

        Course tarih=new Course("Tarih","101","TRH",t1);

        Course fizik=new Course("Fizik","102","FZK",t3);

        Course biyoloji=new Course("Biyoloji","101","BIO",t2);

//        tarih.printTeacherInfo();

        Student s1=new Student("Inek Saban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,90,50);

        Student s2=new Student("Guduk Necmi","125","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,30,20);


        s1.isPass();

        s1.printNote();

        s2.isPass();

        s2.printNote();


    }
}
