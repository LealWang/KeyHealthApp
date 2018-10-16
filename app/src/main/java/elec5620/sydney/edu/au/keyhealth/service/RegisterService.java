package elec5620.sydney.edu.au.keyhealth.service;

public interface RegisterService<T> {
    T register(T t);

    boolean checkIdentifical(T t);
}
