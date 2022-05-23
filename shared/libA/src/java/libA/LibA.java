package libA;

import libB.LibB;

public class LibA {

    public void xd() {
        LibB libB = new LibB();
        libB.xd();
        
        System.out.println("lib A!");
    }
}
