public class Hero {

    private int health; //здоровье

    private int jak; //урон

    private String Sad; //суперспособность

    public int getHealth() {
        return health;
    }

    public int getJak() {
        return jak;
    }

    public String getSad() {
        return Sad;
    }

    public Hero(int health, int jak) {
        this.health = health;
        this.jak = jak;
    }

    public Hero(int health, int jak, String sad) {
        this.health = health;
        this.jak = jak;
        Sad = sad;
    }
}
