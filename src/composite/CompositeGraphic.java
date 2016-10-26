package composite;

import java.util.ArrayList;

/**
 * Created by domagoj on 10/26/16.
 */
public class CompositeGraphic implements Graphic {
    private ArrayList<Graphic> childGraphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic : childGraphics)  {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        this.childGraphics.add(graphic);
    }
}
