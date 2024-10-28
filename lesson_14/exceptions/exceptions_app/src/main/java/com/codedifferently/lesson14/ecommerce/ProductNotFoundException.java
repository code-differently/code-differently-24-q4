/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codedifferently.lesson14.ecommerce;

// Custom Exception with the name ProductNotFoundException set to display a string message of your
// choosing
class ProductNotFoundException extends Exception {
  public ProductNotFoundException(String message) {
    super(message);
  }
}
