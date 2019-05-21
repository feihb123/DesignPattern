package cn.datacharm.decorator;

public class Equipment implements Hero{
    protected Hero hero;

    public Equipment() {
    }

    public Equipment(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void equip() {
        if(hero != null){
            hero.equip();
        }
    }
}
