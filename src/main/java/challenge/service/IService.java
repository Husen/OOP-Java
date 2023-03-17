package challenge.service;

import java.util.List;

public interface IService<T> {
    void insert(T params);
    List<T> getAll();
    T getByTitle(String title);
    T getByCode(String code);
    void delete(String code);
}
