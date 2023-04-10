package org.example.studies.oopApplications.restouanyMenuApplication;

import java.util.Arrays;

public class Menu {
    private Meal[] meals=new Meal[10];
    private int mealCount=0;


    public void addMeal(Meal meal){
        meals[mealCount]=meal;
        mealCount++;
    }

    public void removeMeal(Meal meal){
        int index=-1;
        for (int i=0;i<mealCount;i++){
            if (meals[i].equals(meal)){
                index=i;
                break;
            }
        }
        if (index!=-1){
            for (int i =index; i<mealCount;i++){
                meals[i]=meals[i+1];
            }
            meals[mealCount -1]=null;
            mealCount--;
        }else
            System.out.println("Meal is not existent");
    }

    public void printAllMeals(){
        System.out.println("**********MENU***********");
        for (int i=0; i<mealCount;i++){
            Meal meal=meals[i];
            System.out.println("Meal Name: " + meal.getName());
            System.out.println("Prince: " + meal.getPrice());
            System.out.println("Ingredients: " + Arrays.toString(meal.getIngredients()));
            System.out.println("Calorie: " + meal.getCalories());
            System.out.println("Vegan: " + (meal.isVegan() ? "Yes" : "No"));
            System.out.println("Do meal have Gluten: " + (meal.isGlutenFree() ? "Yes" : "No"));
            System.out.println("----------------------------");

        }
        System.out.println("Total Prince :" + totalPrice());
        System.out.println("Total Calories :" + totalCalories());
    }

    public double totalPrice(){
        double total=0;
        for (int i =0; i<mealCount; i++){
            total += meals[i].getPrice();
        }
        return total;
    }

    public double totalCalories(){
        double total=0;
        for (int i=0; i<mealCount;i++){
            total+=meals[i].getCalories();
        }
        return total;
    }
}
