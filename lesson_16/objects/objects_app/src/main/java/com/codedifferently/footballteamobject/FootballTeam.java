package com.codedifferently.footballteamobject;

import java.util.HashMap;
import java.util.Map;

public class FootballTeam {

  public static class DuplicatePlayerException extends Exception {
    public DuplicatePlayerException(String message) {
      super(message);
    }
  }

  private int playerCount;
  private int jerseyNumber50AndOver;
  private int jerseyNumberUnder50;
  private Map<Integer, String> players = new HashMap<>();
  private final String teamName;
  private final String location;
  private final Conference conference;

  public FootballTeam(
      String teamName, String location, Conference conference, Map<Integer, String> players) {
    this.teamName = teamName;
    this.location = location;
    this.conference = conference;
    this.players = players;
  }

  public enum Conference {
    // Power Five Conferences
    ACC,
    BIG_12,
    BIG_10,
    PAC_12,
    SEC,
    // Group of Five Conferences
    AMERICAN,
    CONFERENCE_USA,
    MAC,
    MOUNTAIN_WEST,
    SUN_BELT
  }

  public boolean isPowerFive() {
    if (conference == Conference.ACC
        || conference == Conference.BIG_12
        || conference == Conference.BIG_10
        || conference == Conference.PAC_12
        || conference == Conference.SEC) {
      return true;
    }
    return false;
  }

  public String getTeamName() {
    return teamName;
  }

  public String getLocation() {
    return location;
  }

  public Conference getConference() {
    return conference;
  }

  public int getPlayerCount() {
    return playerCount;
  }

  public Map<Integer, String> getPlayers() {
    return players;
  }

  public void addPlayer(int number, String name) throws DuplicatePlayerException {
    if (players.containsKey(number)) {
      throw new DuplicatePlayerException(
          "A player with that number already exists.");
    }
    players.put(number, name);
    playerCount++;
  }

  public void removePlayer(int number) {
    players.remove(number);
    playerCount--;
  }

  public void tallyJerseyNumbers() {
    for (Map.Entry<Integer, String> entry : players.entrySet()) {
      if (entry.getKey() < 50) {
        jerseyNumberUnder50++;
      } else {
        jerseyNumber50AndOver++;
      }
    }
  }

  public int getJerseyNumber50AndOver() {
    return jerseyNumber50AndOver;
  }

  public int getJerseyNumberUnder50() {
    return jerseyNumberUnder50;
  }
}
