package com.badr.steam.util.json;

import com.badr.steam.entity.Player;

import java.io.Serializable;
import java.util.List;

/**
 * User: Histler
 * Date: 16.04.14
 */
public class PlayersHolder implements Serializable {
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
