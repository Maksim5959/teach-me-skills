package chuyashkou.lessonsOOP.clothes;

public class Atelier {

    public void dressAMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c.dressAMan() != null) {
                System.out.println("Men: " + c.dressAMan());
            }
        }
    }


    public void dressAWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c.dressAWoman() != null) {
                System.out.println("Women: " + c.dressAWoman());
            }
        }
    }
}
