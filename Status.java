public class Status {
    private int counter;
    private double health;

    public Status() {
        counter = 0;
        health = 5;
    }

    public int getCounter(){
        return counter;
    }
    public void addCounter(){
        counter += 1;
    }
    public void recount(){
        counter = 0;
    }

    public double getHealth(){
        return health;
    }
    public void bat(){
        health -= 1;
    }
    public void thorn(){
        health -= 0.5;
    }

}
