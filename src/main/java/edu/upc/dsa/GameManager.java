package edu.upc.dsa;

import edu.upc.dsa.models.Map;
import edu.upc.dsa.models.Partida;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.UserTO;

import java.util.List;

public interface GameManager {

    /*
    * Authentication
    * */
    UserTO login(UserTO user);
    UserTO register(UserTO user);

    /*
     * User
     * */
    void deleteUser(UserTO user);
    List<Object> getObjects(UserTO user);
    User getUser(int idUser);
    void buy(int idObject, int idUser);
    void deleteObject(int idObject, int idUser);

    /*
     * Store
     * */
    void addObjectStore(Object object);
    void deleteObjectStore(int idObject);



    /*
     * Map
     * */

    Map getMap(int level);
    List<Partida> getPartida();




}
