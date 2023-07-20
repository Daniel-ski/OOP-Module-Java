package InterfacesAndAbstractClasses_Ex.x07_CollectionHierarchy;

import java.util.List;

public class AddRemoveCollection extends Collection implements AddRemovable{
    public AddRemoveCollection() {
        super();
    }

    @Override
    public String remove() {
        String elementToRemove = super.getItems().get(super.getItems().size()-1);

        super.getItems().remove(elementToRemove);

        return elementToRemove;

    }

    @Override
    public int add(String string) {
         super.getItems().add(0,string);
         return super.getItems().indexOf(string);
    }
}
