package co.dmecham.timetracker.repositories;

import co.dmecham.timetracker.model.Project;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by david on 5/2/2016.
 */
public interface SimpleRepository<T> {
    T find (UUID id);
    Collection<T> findAll();
    T update(UUID id,T item);
    boolean delete(UUID id);
    void deleteAll();
}
