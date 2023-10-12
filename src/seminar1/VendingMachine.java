package seminar1;

import java.util.List;

public interface VendingMachine {
    Cappuchino getCappuchino(String name, int temperature);
    Latte getLatte(String name, int temperature);


}
