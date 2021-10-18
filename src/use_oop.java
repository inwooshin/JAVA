public class use_oop {
    public static void main(String ar[]){
        oop_hero[] heros = new oop_hero[3];
        heros[0] = new oop_warrior("전사");
        heros[1] = new oop_archer("궁수");
        heros[2] = new oop_wizzard("법사");

        for(int i = 0 ; i < 3 ; i++) {
            heros[i].attack();

            if(heros[i] instanceof oop_warrior){
                oop_warrior temp = (oop_warrior) heros[i];
                temp.groundCutting();
             }
            else if(heros[i] instanceof oop_archer){
                oop_archer temp = (oop_archer) heros[i];
                temp.fireArrow();
            }
            else {
                oop_wizzard temp = (oop_wizzard) heros[i];
                temp.magicClow();
            }
        }

    }
}
