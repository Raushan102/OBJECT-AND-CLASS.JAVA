
class employees {
    private int id;
    private String name;
    private int salerry;

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;

    }

    public void setsalerry(int s) {
        salerry = s;
    }

    public int getsalerry() {
        return salerry;
    }
}

public class private_A_M {

    public static void main(String[] args) {

        employees raushan = new employees();

        raushan.setname("raushan kumar saw");

        System.out.println(raushan.getname());

        raushan.setid(45);

        System.out.println(raushan.getid());

        raushan.setsalerry(450000);
        System.out.println(raushan.getsalerry());
        
    }

}
