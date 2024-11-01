package com.codedifferently.lesson16.ShawnDunsmore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SlotMachineTest {
  @Test
  public void testMoney_Exists() {
    SlotMachine slot = new SlotMachine(0, 0, null, null, null, 10);
    assertEquals(10, slot.getMoneyNeeded());
  }

  @Test
  public void testNumOfSlots_Exists() {
    SlotMachine slot = new SlotMachine(1, 0, null, null, null, 10);
    assertEquals(1, slot.getNumOfSlots());
  }

  @Test
  public void testNameOfSlot_Exists() {
    SlotMachine slot = new SlotMachine(1, 0, "Goldie", null, null, 10);
    assertEquals("Goldie", slot.getName());
  }

  @Test
  public void testPayAmount_Exists() {
    SlotMachine slot = new SlotMachine(1, 10, "Goldie", null, null, 10);
    assertEquals(10, slot.getPayAmount());
  }


  @Test
  public void testBuyType_Exists() {
    SlotMachine slot = new SlotMachine(1, 10, "Goldie", null, null, 10);
    assertEquals(null, slot.getBuyType());
  }
}
