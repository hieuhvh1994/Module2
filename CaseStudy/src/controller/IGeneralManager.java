package controller;

import java.io.IOException;
import java.util.List;

//Interface IGeneral Manager
public interface IGeneralManager<T> {
    List<T> findAll();
    void add(T t) throws IOException;
    void update(int index, T t) throws IOException;
    void deleteByIndex(int index) throws IOException;
    void showAllList();


}
