package edu.upc.dsa;

import edu.upc.dsa.models.UserTO;

import java.util.List;

public interface GameManager {

    UserTO login(UserTO user);
    UserTO register(UserTO user);


}
