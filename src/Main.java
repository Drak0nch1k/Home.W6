//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon();
        Boss boss = new Boss();
        weapon.setWeaponType(WeaponType.COLD_WEAPON);
        boss.setWeapon(weapon);
        boss.setDamage(150);
        boss.setHealth(120);
        boss.setName("Aether");
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        weapon.setWeaponType(WeaponType.ARROW);
        skeleton1.setWeapon(weapon);
        skeleton1.setCounter(25);
        skeleton1.setDamage(30);
        skeleton1.setHealth(50);
        skeleton1.setName("Skeleton 1");
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton();
        weapon.setWeaponType(WeaponType.ARROW);
        skeleton2.setCounter(25);
        skeleton2.setWeapon(weapon);
        skeleton2.setDamage(30);
        skeleton2.setHealth(50);
        skeleton2.setName("Skeleton 2");
        System.out.println(skeleton2.printInfo());

    }
}
