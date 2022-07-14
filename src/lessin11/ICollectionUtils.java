package lessin11;

import java.util.Collection;
import java.util.Set;

/**
 * Утилиты для работы с коллекциями объектов
 *
 * @author nedis
 * @version 1.0
 */
public interface ICollectionUtils {

    /**
     * 1)Объединение двух коллекций с дубликатами
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая объединение a и b, может содержать дубликаты
     * @throws NullPointerException если a или b == null
     */
    Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;

    /**
     * 2)Пересечение двух коллекций с дубликатами
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая пересечение a и b, может содержать дубликаты
     * @throws NullPointerException если a или b == null
     */
    Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;

    /**
     * 3)Объединение двух коллекций без дубликатов
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая объединение a и b без дубликатов
     * @throws NullPointerException если a или b == null
     */
    Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;

    /**
     * 4)Пересечение двух коллекций без дубликатов
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая пересечение a и b без дубликатов
     * @throws NullPointerException если a или b == null
     */
    Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;

    /**
     * 5)Разность двух коллекций
     *
     * @param a первая коллекция
     * @param b вторая коллекция
     * @return новая колекция содержащая разность a и b
     * @throws NullPointerException если a или b == null
     */
    Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException;
}
