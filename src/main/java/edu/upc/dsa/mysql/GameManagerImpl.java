package edu.upc.dsa.mysql;

import edu.upc.dsa.models.Map;
import edu.upc.dsa.models.Partida;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.UserTO;

import java.util.List;

public class GameManagerImpl implements GameManager {

    @Override
    public UserTO login(UserTO user) {
        return null;
    }

    @Override
    public UserTO register(UserTO user) {
        return null;
    }

    @Override
    public void deleteUser(UserTO user) {

    }

    @Override
    public List<Object> getObjects(UserTO user) {
        return null;
    }

    @Override
    public User getUser(int idUser) {
        return null;
    }

    @Override
    public void buy(int idObject, int idUser) {

    }

    @Override
    public void deleteObject(int idObject, int idUser) {

    }

    @Override
    public void addObjectStore(Object object) {

    }

    @Override
    public void deleteObjectStore(int idObject) {

    }

    @Override
    public Map getMap(int level) {
        return null;
    }

    @Override
    public List<Partida> getPartida() {
        return null;
    }
}
