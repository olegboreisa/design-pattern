package clothes;

import java.util.ArrayList;
import java.util.List;

public class LowerBody implements Clothes {

    private String type;
    private List<Clothes> lowerBodyClothes = new ArrayList<>();

    public LowerBody(String type) {
        this.type = type;
    }

    public void addItem(Clothes item) {
        lowerBodyClothes.add(item);
    }

    @Override
    public void showPrice() {
        System.out.println("Lower body's clothes composed of: ");
        for (Clothes it : lowerBodyClothes) {
            it.showPrice();
        }
    }

}
