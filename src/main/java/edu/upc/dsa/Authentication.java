package edu.upc.dsa;

import edu.upc.dsa.models.UserTO;

public interface Authentication {

    UserTO login(UserTO user);
    UserTO register(UserTO user);

}
