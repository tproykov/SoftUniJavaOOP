package JO13ExamPreparation.E04_19_Dec_2023.E041HighQualityStructure.src.main.java.climbers.repositories;

import java.util.Collection;

public interface Repository<T> {
    Collection<T> getCollection();

    void add(T entity);

    boolean remove(T entity);

    T byName(String name);
}
