package com.codedifferently.lesson16.ShawnDunsmore;


import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
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
}
