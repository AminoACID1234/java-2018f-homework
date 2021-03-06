package calabashBrothers.beings;

import calabashBrothers.Maps;
import calabashBrothers.beings.enums.*;

/**
 * @ Author     ：Young
 * @ Description：有一种生物，名为葫芦娃
 */

public class CalabashBoy extends Creature implements Fighting{
    protected Color color;
    protected int rank;

    public CalabashBoy(int i) {
        super(EnumCalabashBoy.values()[i].getName(), CreatureType.CALABASH_BOY);
        this.color = EnumCalabashBoy.values()[i].getColor();
        this.rank = EnumCalabashBoy.values()[i].getRank();
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("我是"+this.name);
    }

    @Override
    public void Fighting(Maps maps, int x, int y) {
        //TODO
    }

    public int getRank() {
        return rank;
    }
}

