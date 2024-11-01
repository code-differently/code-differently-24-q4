package com.codedifferently.lesson16.HorseStableTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codedifferently.lesson16.HorseStable.HorseStable;
import com.codedifferently.lesson16.HorseStable.StableFullException;

public class HorseStableTest {
  private HorseStable stable;

  @BeforeEach
  public void setUp() {
    stable = new HorseStable("Sunny Acres", "California", 2, HorseStable.StableType.PRIVATE);
  }

  @Test
  public void testStableCreation() {
    assertEquals("Sunny Acres", stable.getName());
    assertEquals("California", stable.getLocation());
    assertEquals(2, stable.getCapacity());
    assertEquals(HorseStable.StableType.PRIVATE, stable.getStableType());
  }

  @Test
  public void testAddHorse_Success() throws StableFullException {
    stable.addHorse("Spirit");
    stable.addHorse("Shadow");

    assertEquals(2, stable.getHorses().size());
  }

  @Test
  public void testDisplayHorses_NoHorses() {
    stable.displayHorses(); 
  }

  @Test
  public void testDisplayHorses_WithHorses() throws StableFullException {
    stable.addHorse("Spirit");
    stable.addHorse("Shadow");
    stable.displayHorses(); 
  }

  @Test
  public void testStableFullMessage() throws StableFullException {
    stable.addHorse("Spirit");
    stable.addHorse("Shadow");

    assertEquals("The stable is full. Cannot add more horses.", stable.stableFull());
  }

  @Test
  public void testSpaceAvailableMessage() {
    assertEquals("Space available in the stable.", stable.stableFull());
  }
}
