package elec5620.sydney.edu.au.keyhealth.dao;

import java.util.ArrayList;

public interface BaseDao<T> {
    T find(T t);
    ArrayList<T> findAll(T t);
    boolean update(T t);
    boolean delete(T t);
    boolean insert(T t);
}
