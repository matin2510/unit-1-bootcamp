/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {
        Person person = new Person();

        Cat cat1 = new Cat();
        cat1.setName("Garfield");
        cat1.setFavoriteFood("Lagagna");
        cat1.setAge(12);

        Cat cat2 = new Cat();
        cat2.setName("Pink Panther");
        cat2.setFavoriteFood("Peanut Butter");
        cat2.setAge(3);

        Cat cat3 = new Cat();
        cat3.setName("Catwoman");
        cat3.setFavoriteFood("Fish");
        cat3.setAge(9);

        System.out.println(isOlder(cat1, cat2));
        System.out.println(makeKitten(cat3, cat1));
        adoption(cat1, person);
        adoption(cat3, person);
        System.out.println(isFree(cat1));
        System.out.println(isSibling(cat1, cat3));

    }

    public static boolean isOlder(Cat a, Cat b) {
        if (a.getAge() > b.getAge()) {
            return true;
        }
        return false;

    }

    public static void makeBestFriends(Cat a, Cat b) {
        a.setFavoriteFood("Caviar");
        b.setFavoriteFood("Caviar");
    }

    public static StringBuilder makeKitten(Cat a, Cat b) {
        Cat kitten = new Cat();
        StringBuilder sb = new StringBuilder();
        kitten.setAge(0);
        sb.append(a.getName() + b.getName());
        kitten.setName(sb.toString());

        return sb;


    }

    public static void adoption(Cat a, Person b) {
        a.setOwner(b);
        if (a.getName().equals("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        }
    }

    public static boolean isFree(Cat a) {
        if (a.getOwner() != null) {
            return false;
        }
        return true;

    }

    public static boolean isSibling(Cat a, Cat b) {
        if (a.getOwner().equals(b.getOwner())) {
            return true;
        }
        return false;
    }
}



