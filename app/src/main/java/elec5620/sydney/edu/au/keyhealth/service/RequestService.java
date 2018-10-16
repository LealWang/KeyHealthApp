package elec5620.sydney.edu.au.keyhealth.service;

import elec5620.sydney.edu.au.keyhealth.models.EndUser;
import elec5620.sydney.edu.au.keyhealth.models.Trainer;

public interface RequestService {

    boolean sendRequest(EndUser endUser);

    boolean receiveRequest(Trainer trainer);

}
