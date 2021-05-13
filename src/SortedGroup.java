import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class SortedGroup<E extends Comparable> {

    private ArrayList<E> _sGroup;

    public SortedGroup(){
        _sGroup = new ArrayList<>();
    }




    public void add(E item) {
        int index;
        int size = _sGroup.size();

        for (index = 0 ; index < size ; index++ ){
            if ( _sGroup.get(index).compareTo(item) < 0 || _sGroup.get(index).compareTo(item) == 0 )
                break;
        }
        _sGroup.add(index, item);
    }

    /**
     * Removes items that are similar to given item, and returns the number of removed items
     * @param item
     * @return number of removed items
     */
    public int remove(E item){
        int i=0 ;
        int count = 0;
        int size = _sGroup.size();

        while(i < size){
            if ( _sGroup.get(i).compareTo(item) == 0 ){
                _sGroup.remove(i);
                count++;
            }
            else if (count > 0 )
                    return count;
            else i++;
        }
        return count;
    }

    public Iterator<E> iterator(){
        return _sGroup.iterator();
    }

    public String toString(){
        String groupStr = "";
        for (E item : _sGroup ) {
            groupStr = groupStr + item.toString() + "\n";
        }
        return groupStr;
    }

}



