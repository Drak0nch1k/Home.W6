public class Skeleton extends Boss{

        private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    public String printInfo(){
        return "Skeleton name: " + getName() + ", Skeleton damage: " + getDamage() +
                ", Skeleton health: " + getHealth() + ", Skeleton weapon: " + getWeapon().getWeaponType()
                + ", Skeleton counter: " + getCounter();
    }
}
