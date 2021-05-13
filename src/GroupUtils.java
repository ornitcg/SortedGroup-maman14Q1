import java.util.Iterator;

public class GroupUtils {

    /**
     * recieves a sorted group and returns a new group object with items that
     * are above a given value
     */
    public static <E extends Comparable> SortedGroup<E> reduce(SortedGroup<E> group, E item){
        SortedGroup<E> reducedGroup = new SortedGroup<E>();
        for(Iterator<E> it = group.iterator(); it.hasNext();){
            E current =  it.next();

            if (current.compareTo(item) > 0)
                reducedGroup.add(current);

        }
        return reducedGroup;
    }


}
