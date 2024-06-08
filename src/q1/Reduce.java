/*
 * @package Maman14Q1.q1
 *
 * This class provides a static method to reduce a q1.SortedGroup by removing all members that are
 * greater than a given element. The result is a new q1.SortedGroup that contains only the members
 * that are less than or equal to the given element.
 */

package q1;

import java.util.Iterator;

public class Reduce {
    /**
     * Reduces a q1.SortedGroup by removing all members that are greater than the given element.
     *
     * @param sGroup the q1.SortedGroup to be reduced
     * @param x the element to compare against
     * @param <T> the type of elements in the q1.SortedGroup, must implement the Comparable interface
     * @return a new q1.SortedGroup that contains all the members that are greater than the given element
     */
    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        SortedGroup<T> result = new SortedGroup<>();
        Iterator<T> iterator = sGroup.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.compareTo(x) > 0) {
                result.add(item);
            }
        }
        return result;
    }
}
