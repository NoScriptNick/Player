public class Player {

    //attributes
    private int numPlayers;
    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;

    //constructors
    public Player() {
        name = "P";
        hp = 20;
        x = 0;
        y = 0;
        z = 0;
        direction = 1;
    }

    public Player(String name, int x, int y, int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        hp = 20;
    }

    public Player(String name, int x, int y, int z, int hp, int direction) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        if (hp > 0 && hp <= 100) {
            this.hp = hp;
        } else {
            System.out.println("Invalid HP");
        }
        if (direction > 0 || direction <= 6) {
            this.direction = direction;
        } else {
            System.out.println("Invalid direction");
        }
    }

    //accessors
    public int getNumPlayers() {
        return numPlayers;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getHP() {
        return hp;
    }

    public int getDirection() {
        return direction;
    }

    //toString
    public String toString() {
        String s = ("Number of Players: " + numPlayers + "\nName: " + name + "\nX: " + x + "\nY: " + y + "\nZ: " + z + "\nHP: " + hp + "\nDirection: " + direction);
        return s;
    }

    //mutators
    public void setHp(int hp) {
        if (hp > 0 && hp <= 100) {
            this.hp = hp;
        } else {
            System.out.println("Invalid HP");
        }
    }

    public void setDirection(int direction) {
        if (direction > 0 || direction <= 6) {
            this.direction = direction;
        } else {
            System.out.println("Invalid direction");
        }
    }
    //other methods

}
