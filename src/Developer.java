public class Developer extends Employee{
    String progrLang;

    public Developer(String name, int age, double salary, String progrLang) {
        super(name, age, salary);
        this.progrLang = progrLang;
    }


    @Override
    public void Work(){

    }

    @Override
    public String toString() {
        return super.toString() + ", programavimo kalba: " + progrLang;
    }
}
