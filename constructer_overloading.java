class student {
    String name;
    int roll_number;
    int id;
    String status;

    // constructer overloading
    public student(String name, int roll_number, int id, String status) {
        this.name = name;
        this.id = id;
        this.roll_number = roll_number;
        this.status = status;
    }

    public student(String name, int roll_number, int id) {
        this.name = name;
        this.id = id;
        this.roll_number = roll_number;
        this.status = "good";
    }

    public student() {
        this.name = "xxxxxx";
        this.id = 0;
        this.roll_number = 0;
        this.status = "xxxxxxx";
    }

    public student(String name, int roll_number, String status) {
        this.name = name;
        
        this.roll_number = roll_number;
        this.status = status;

    }

    // for [print details]
    public void printDetail() {
        System.out.println();
        System.out.println("name of student is:" + "  " + this.name);
        System.out.println("id of " + this.name + " "+"is : " + " " + this.id);
        System.out.println("roll number of " + this.name + " "+"is :" + " " + this.roll_number);
        System.out.println("status of " + this.name +" "+ "is :" + " " + this.status);
        System.out.println();
    }

}

public class constructer_overloading {

    public static void main(String[] args) {
        student neeraj = new student();
        student sita = new student("sita", 45, 3, "very good");
        student savitari = new student("sapna", 45, 3);
        student piush = new student("piush", 56, "excellent");

        sita.printDetail();
        neeraj.printDetail();
        piush.printDetail();
        savitari.printDetail();

    }

}
