package DomZadanie_07;

import java.util.*;

/**
 * Created by пк on 04.06.2015.
 */
public class CollectionUtils_Impl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer i : a) result.add(i);
        for (Integer i : b) result.add(i);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Iterator iterA = a.iterator(); iterA.hasNext(); ) {
            Integer i = (Integer) iterA.next();
            for (Iterator iterB = b.iterator(); iterB.hasNext(); ) {
                if (i.equals(iterB.next())) {
                    result.add(i);
                    continue;
                }
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (Integer i : a) result.add(i);
        for (Integer i : b) result.add(i);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
        for (Iterator iterA = a.iterator(); iterA.hasNext(); ) {
            Integer i = (Integer) iterA.next();
            for (Iterator iterB = b.iterator(); iterB.hasNext(); ) {
                if (i.equals(iterB.next())) {
                    result.add(i);
                    continue;
                }
            }
        }

        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {


        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Iterator iter1 = a.iterator(); iter1.hasNext(); ) {
            Integer i = (Integer) iter1.next();
            boolean uniq = true;
            for (Iterator iter2 = b.iterator(); iter2.hasNext(); ) {
                if (i.equals(iter2.next())) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) result.add(i);
        }

        for (Iterator iter1 = b.iterator(); iter1.hasNext(); ) {
            Integer i = (Integer) iter1.next();
            boolean uniq = true;
            for (Iterator iter2 = a.iterator(); iter2.hasNext(); ) {
                if (i.equals(iter2.next())) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) result.add(i);
        }

        return result;
    }
}
