package InterfacesAndAbstractClasses_Ex.x07_CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{

    public MyListImpl() {
        super();
    }

    @Override
    public String remove() {
        String elementToRemove = super.getItems().get(0);

        super.getItems().remove(elementToRemove);

        return elementToRemove;
    }

    @Override
    public int add(String string) {
        super.getItems().add(0,string);
        return super.getItems().indexOf(string);
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
