package challenge.controller;

import java.util.List;

public interface IController<T> {
    void createDefault();
    void add();
    List<T> getAll();
    void delete();
    T showByTitle();
}
