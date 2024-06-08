/*
 * @package Maman14Q1.q1
 *
 * This class represents a sorted group of elements. The elements are stored in a sorted manner
 * based on their natural order. The class provides methods to add elements, remove elements, and
 * iterate over the elements in the group.
 *
 * @param <T> the type of elements in the group, must implement the Comparable interface
 */

package q1;

import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>> {
    private ArrayList<T> collections;

    /**
     * Constructs an empty q1.SortedGroup.
     */
    public SortedGroup() {
        collections = new ArrayList<T>();
    }

    /**
     * Adds a member to the group in its appropriate place based on the sorting order.
     * There may be duplicate members in the group.
     *
     * @param member the member to be added to the group
     */
    public void add(T member) {
        int i = 0;
        for (T item : collections) {
            if (member.compareTo(item) <= 0)
                break;
            i++;
        }
        collections.add(i, member);
    }

    /**
     * Removes all occurrences of a given member from the group.
     *
     * @param member the member to be removed from the group
     * @return the number of members that were removed
     */
    public int remove(T member) {
        int cnt = 0;
        Iterator<T> iterator = collections.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.equals(member)) {
                iterator.remove();
                cnt++;
            }
        }
        return cnt;
    }

    /**
     * Returns an iterator over the members of the group.
     *
     * @return an iterator over the members of the group
     */
    public Iterator<T> iterator() {
        return collections.iterator();
    }
}
