package org.example.studies.oopApplications.restouanyMenuApplication;

public class Main {
    public static void main(String[] args) {
        Meal meal=new Meal("Mercimek", 12.3,new String[]{"mercimek,yağ,tuz,su"},100,true,true);
        Meal meal1=new Meal("Sarma",23,new String[]{"yaprak,kıyma,pirinc"},200,true,true);
        Meal meal3 = new Meal("Pizza",50,new String[]{"un,süt,sucuk,peynir"},500,false,false);
        Meal meal4 = new Meal("Köfte",12.5,new String[]{"kıyma,baharat"},1000,false,true);

        Menu menu=new Menu();
        menu.addMeal(meal);
        menu.addMeal(meal1);
        menu.addMeal(meal3);
        menu.addMeal(meal4);

        menu.removeMeal(meal3);
        menu.printAllMeals();
    }
}
