public class Example{
    public static void main(String[] args) {
        
        Student s1 = new Student("Efren",29,7);
        Student s2 = new Student("Mike",31,7);
        Student s3 = new Student("Robert",25,7);

        User u1 = new User("Andres",34);
        Animal a1 = new Animal("Cain", "Dog");
        Animal a2 = new Animal("Captain", "Cat");
        Animal a3 = new Animal("Bob", "Panda");


        s1.studentDisplay();
        System.out.println(u1.name);
        System.out.println("-------------------");
        System.out.println(a1.name);

        a2.attack(s1);

        System.out.println("-------------------");
        a3.attack(s2);
        a3.attack(s3);





    }
}