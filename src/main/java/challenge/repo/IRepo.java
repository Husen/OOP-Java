package challenge.repo;

import java.util.List;

public interface IRepo<T> {
    void add(T params);
    List<T> getAll();
    T getByTitle(String title);
    T getByCode(String code);
    void delete(T params);
}
