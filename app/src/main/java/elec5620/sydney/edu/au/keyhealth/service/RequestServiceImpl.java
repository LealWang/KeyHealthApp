package elec5620.sydney.edu.au.keyhealth.service;

import elec5620.sydney.edu.au.keyhealth.models.EndUser;
import elec5620.sydney.edu.au.keyhealth.models.Trainer;

public class RequestServiceImpl implements RequestService {
    @Override
    public boolean sendRequest(EndUser endUser) {
        return false;
    }

    @Override
    public boolean receiveRequest(Trainer trainer) {
        return false;
    }
}
