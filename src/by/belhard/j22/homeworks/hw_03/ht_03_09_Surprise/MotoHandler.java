package by.belhard.j22.homeworks.hw_03.ht_03_09_Surprise;

public class MotoHandler {

    public static void main(String[] args) {
        Moto moto1 = new Moto(
                Type.CRUISER,
                1989,
                15,
                10,
                5
        );

        moto1.printCoolness(Type.ENDURO);

        moto1.calculateAge(1984);
        moto1.printAge();

        moto1.calculateTravelledDistance(10, 5, 10);
        moto1.printTravelledDistance();
    }
}