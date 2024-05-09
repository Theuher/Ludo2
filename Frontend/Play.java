package Frontend;

import Frontend.Interface.IPlay;

public class Play implements IPlay {
    static Introduction intro = new Introduction();
    public static void main(String[] args){
        intro.screen();
    }
}
