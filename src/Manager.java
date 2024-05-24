public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public void Work(){

    }

    @Override
    public String toString() {
        return super.toString() + ", komandos dydis: " + teamSize;
    }
}
