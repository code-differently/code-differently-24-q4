package com.codedifferently.lesson12;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Lesson12 {

  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  class TeamNode {
    int data;
    TeamNode next;

    public TeamNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  class LinkedList {
    TeamNode head;

    public void add(int data) {
      TeamNode newTeamNode = new TeamNode(data);
      if (head == null) {
        head = newTeamNode;
      } else {
        TeamNode temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = newTeamNode;
      }
    }

    public String gameResult(TeamNode head) {
      List<String> result = new ArrayList<>();
      int evenCounter = 0;
      int oddCounter = 0;
      TeamNode current = head;

      while (current != null && current.next != null) {
        int evenValue = current.data;
        int oddValue = current.next.data;

        if (evenValue > oddValue) {
          result.add("even");
          evenCounter++;
        } else {
          result.add("odd");
          oddCounter++;
        }

        current = current.next.next;
      }

      String winningTeam;
      if (evenCounter > oddCounter) {
        winningTeam = "even";
      } else if (oddCounter > evenCounter) {
        winningTeam = "odd";
      } else {
        winningTeam = "tie";
      }

      System.out.println("Nodes with higher values in each pair: " + result);
      System.out.println("The team with the most high-values is: " + winningTeam);

      return winningTeam;
    }
  }


public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    // Adding some nodes to the linked list
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(7);
    list.add(20);
    list.add(5);

    // Call the function to compare pairs and determine the group with the most high-value pairs
    String winningTeam = list.gameResult(list.head);

    // Output the dominant group
    System.out.println("Team with most high-value pairs: " + winningTeam);
  }
}
