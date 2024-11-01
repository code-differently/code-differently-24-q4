package com.codedifferently.lesson16.Dog;



public class Dog {
    private final Enum Colors;

    private Enum getColors() {
        return Colors;
    }
    enum Colors{
        WHITE,
        BROWN,
        BLONDE;
    }
      {
        Colors[] colors = Colors.values();
        for (var i = 0; i < Colors.length;i ++) {

        }

    }

        
       

   //Attributes
    private int Age;
    private String Breed;
    private String Gender;
    private Boolean isFed, isNotFed;
    
    //Constructor
    public Dog(int Age, String Breed, String Gender, Enum Colors, Boolean isFed) {
        this.Age = Age;
        this.Breed = Breed;
        this.Gender = Gender;
        this.Colors = Colors;
        this.isFed = isFed | isNotFed;
    }
    public static int myDogsAge(int Age) {
      return 2;
    }
    public static String getbreed(String breed) {
        return "mutt";
    }
    public static String getGender(String Gender) {
        return "male";
    }
    public static Enum getColors(Enum Colors) {
        return Colors;
    } 
    public Boolean isFed(Boolean Fed) {
           
        Boolean getFedStatus = isFed, isNotFed;
           
           return getFedStatus == Fed; 
            }
        
    }
   




