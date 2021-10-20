package Controller;

import java.util.List;

public interface IGeneralManager<T> {
    List<T> findAll();
    void add(T t);
    void update(int index, T t);
    void deleteById(int index);
    void showAllList();


}
