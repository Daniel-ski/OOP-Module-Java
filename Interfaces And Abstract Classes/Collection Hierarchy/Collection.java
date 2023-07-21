package InterfacesAndAbstractClasses_Ex.x07_CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    private final int maxSize = 100;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>(maxSize);
    }

    public int getMaxSize() {
        return maxSize;
    }



    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
