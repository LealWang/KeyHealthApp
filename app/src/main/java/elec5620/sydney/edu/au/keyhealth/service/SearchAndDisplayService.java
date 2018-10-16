package elec5620.sydney.edu.au.keyhealth.service;

import java.util.ArrayList;

import elec5620.sydney.edu.au.keyhealth.models.Trainer;

public interface SearchAndDisplayService {

    ArrayList<Trainer> findAll();
    Trainer find(Trainer trainer);
}
