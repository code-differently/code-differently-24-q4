package com.codedifferently.footballteamobject;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codedifferently.footballteamobject.FootballTeam.Conference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FootballTeamTest {
  FootballTeam team;
  private Map<Integer, String> players;

  @BeforeEach
  void setUp() {
    team = new FootballTeam("Alabama", "Tuscaloosa", FootballTeam.Conference.SEC, new HashMap<>());
    players = new HashMap<>();
    players.put(2, "Derrick Henry");
  }

  @Test
  public void testGetTeamName_ReturnsCorrectName() {
    assertEquals("Alabama", team.getTeamName());
  }

  @Test
  public void testGetTeamName_ReturnsNonNull() {
    assertNotNull(team.getTeamName());
  }

  @Test
  public void testAddPlayer() throws FootballTeam.DuplicatePlayerException {
    team.addPlayer(1, "John Doe");
    assertEquals(1, team.getPlayerCount());
    assertEquals("John Doe", team.getPlayers().get(1));
  }

  @Test
  public void testRemovePlayer() throws FootballTeam.DuplicatePlayerException {
    team.addPlayer(1, "John Doe");
    team.removePlayer(1);
    assertEquals(0, team.getPlayerCount());
    assertFalse(team.getPlayers().containsKey(1));
  }

  @Test
  public void testTallyJerseyNumbers_Under50() throws FootballTeam.DuplicatePlayerException {
    team.addPlayer(1, "Player 1");
    team.tallyJerseyNumbers();
    assertEquals(1, team.getJerseyNumberUnder50());
  }

  @Test
  public void testPowerFiveConferences() {
    FootballTeam team = new FootballTeam("Team Name", "Location", Conference.ACC, new HashMap<>());
    assertTrue(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.BIG_12, new HashMap<>());
    assertTrue(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.BIG_10, new HashMap<>());
    assertTrue(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.PAC_12, new HashMap<>());
    assertTrue(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.SEC, new HashMap<>());
    assertTrue(team.isPowerFive());
  }

  @Test
  public void testGroupOfFiveConferences() {
    FootballTeam team =
        new FootballTeam("Team Name", "Location", Conference.AMERICAN, new HashMap<>());
    assertFalse(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.CONFERENCE_USA, new HashMap<>());
    assertFalse(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.MAC, new HashMap<>());
    assertFalse(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.MOUNTAIN_WEST, new HashMap<>());
    assertFalse(team.isPowerFive());
    team = new FootballTeam("Team Name", "Location", Conference.SUN_BELT, new HashMap<>());
    assertFalse(team.isPowerFive());
  }

  @Test
  void testDuplicatePlayerException() {
    String message = "A player with that number already exists.";
    DuplicatePlayerException exception = new DuplicatePlayerException(message);
    assertThatThrownBy(
            () -> {
              throw exception;
            })
        .isInstanceOf(DuplicatePlayerException.class)
        .hasMessage(message);
  }
}
