public class Student extends User{
    
    public int cohortNumber;

    public Student(String name, int age, int cohortNumber){
        super(name, age);
        this.cohortNumber=cohortNumber;

    }

    public void studentDisplay(){
        System.out.println("Name:"+ this.name);
        System.out.println("Age:"+ this.age);
        System.out.println("CohortNumber:"+ this.cohortNumber);

    }
    

}