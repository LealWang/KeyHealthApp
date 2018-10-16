package elec5620.sydney.edu.au.keyhealth.service;

public interface LoginService<T> {
    T login(T t);

    boolean checkIdentical(T t);
}
