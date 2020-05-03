package by.belhard.j22.homeworks.hw_04.ht_04_05_wardrobe;

public class WardrobeHandler {

    public static void main(String[] args) {

        Clothes[] clothesList = new Clothes[10];

        clothesList[0] = new Clothes(
                "jeans"
        );

        clothesList[1] = new Clothes(
                "dress"
        );

        clothesList[2] = new Clothes(
                "skirt"
        );

        clothesList[3] = new Clothes(
                "sock"
        );

        clothesList[4] = new Clothes(
                "shirt"
        );

        clothesList[5] = new Clothes(
                "jacket"
        );

        clothesList[6] = new Clothes(
                "sweater"
        );

        Wardrobe myWirdrobe = new Wardrobe(clothesList);

        myWirdrobe.riviseClothes();

        Clothes newCL = new Clothes("trousers");
        myWirdrobe.putClothesThingToGivenShelve(newCL, 8);
        myWirdrobe.riviseClothes();


        Clothes randomCLSL = new Clothes("cat");
        myWirdrobe.dropClothesThingToAnyEmptyShelve(randomCLSL);
        myWirdrobe.riviseClothes();


        myWirdrobe.getClothesThingFromGivenShelve(8);
    }
}
