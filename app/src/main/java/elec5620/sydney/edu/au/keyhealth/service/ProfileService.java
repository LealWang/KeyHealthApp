package elec5620.sydney.edu.au.keyhealth.service;

public interface ProfileService<T> {
    T getProfile(T t);
    boolean updateProfile(T t);
}
