package com.codedifferently.lesson16.ShawnDunsmore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
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

  @Test
  public void testUseDoubleSlots() {
    SlotMachine slottwo = new SlotMachine(1, 10, "Goldie", null, null, 10);
    SlotMachine slotone = new SlotMachine(1, 10, "Diamond", null, null, 10);
    assertEquals(1, slotone.getNumOfSlots());
    assertEquals(1, slottwo.getNumOfSlots());
  }

  @Test
  public void testSlotSpin() {
    SlotMachine slot = new SlotMachine(1, 10, "Goldie", null, null, 10);
    assertEquals(null, slot.getIconList());
  }

  @Test
  public void testPayOut() {

    ArrayList<String> icons = new ArrayList<>();
    SlotMachine slotMachine1 =
        new SlotMachine(1, 10, "Test Slot 1", BuyType.DOUBLE_CHANCE, icons, 10);
    assertEquals(20, slotMachine1.payOut(), "Expected payout for DOUBLE_CHANCE to be 20");

    SlotMachine slotMachine2 = new SlotMachine(1, 10, "Test Slot 2", BuyType.BONUS_BUY, icons, 10);
    assertEquals(30, slotMachine2.payOut(), "Expected payout for BONUS_BUY to be 30");
  }

  @Test
  public void testSetNumOfSlots() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    slotMachine.setNumOfSlots(5);

    assertEquals(5, slotMachine.getNumOfSlots(), "The number of slots should be updated to 5");
  }

  @Test
  public void testSetPayAmount() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    slotMachine.setPayAmount(20);

    assertEquals(20, slotMachine.getPayAmount(), "The pay amount should be updated to 20");
  }

  @Test
  public void testSetName() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    slotMachine.setName("Lucky Slot");

    assertEquals("Lucky Slot", slotMachine.getName(), "The name should be updated to 'Lucky Slot'");
  }

  @Test
  public void testSetBuyType() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    slotMachine.setBuyType(BuyType.BONUS_BUY);

    assertEquals(
        BuyType.BONUS_BUY, slotMachine.getBuyType(), "The buy type should be updated to BONUS_BUY");
  }

  @Test
  public void testSetIconList() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    ArrayList<String> newIcons = new ArrayList<>();
    newIcons.add("🍒");
    newIcons.add("🍋");
    newIcons.add("🍊");

    slotMachine.setIconList(newIcons);

    assertEquals(
        newIcons, slotMachine.getIconList(), "The icon list should be updated with the new icons");
  }

  @Test
  public void testSetMoneyNeeded() {
    SlotMachine slotMachine =
        new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, new ArrayList<>(), 10);

    slotMachine.setMoneyNeeded(15);

    assertEquals(15, slotMachine.getMoneyNeeded(), "The money needed should be updated to 15");
  }

  @Test
  public void testSpinThrowsExceptionWhenMoneyIsInsufficient() {
    ArrayList<String> icons = new ArrayList<>();
    icons.add("🍒");
    icons.add("🍋");
    icons.add("🍊");

    SlotMachine slotMachine = new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, icons, 10);

    Exception exception =
        assertThrows(
            InvalidPayAmountException.class,
            () -> {
              slotMachine.spin(5);
            });

    assertEquals("Amount inavalid", exception.getMessage());
  }

  @Test
  public void testSpinShufflesIconList() throws InvalidPayAmountException {
    ArrayList<String> icons = new ArrayList<>();
    icons.add("🍒");
    icons.add("🍋");
    icons.add("🍊");

    SlotMachine slotMachine = new SlotMachine(3, 10, "Test Slot", BuyType.NORMAL_BUY, icons, 10);

    ArrayList<String> originalIcons = new ArrayList<>(slotMachine.getIconList());

    slotMachine.spin(10);

    ArrayList<String> shuffledIcons = slotMachine.getIconList();

    Collections.sort(originalIcons);
    Collections.sort(shuffledIcons);

    assertEquals(
        originalIcons, shuffledIcons, "The icon list should have the same contents after spinning");
  }
}
