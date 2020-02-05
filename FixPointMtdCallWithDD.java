class CS474Child extends CS474Parent{
    static {
        ind = 2;
    }
    public CS474Child(){
        ind = 3;
    }

    public CS474Parent m(){
        school += school;
        return super.m();
    }
}

public class CS474Parent {
    protected String school = "UIC";
    public static int ind;

    public CS474Parent(){
        ind = 1;
    }

    public CS474Parent m(){
        //substring(ind) returns the substring of the string object
        //starting with the index ind
        school = school.substring(ind);
        return this;
    }

    public static void main(String...s){
        CS474Parent p = new CS474Child();
        System.out.println(p.m().m().m().m().m().m().m().m().m().school);
    }
}
