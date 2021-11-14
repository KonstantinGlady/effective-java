package effectivejava.chapter2.item2.javabean;

public class NutritionFacts {
    private int servingSize = -1;
    private int service = -1;
    private int calories = 0;
    private int fat = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setService(int service) {
        this.service = service;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setCalories(99);
        nutritionFacts.setFat(88);
        nutritionFacts.setService(22);
    }
}
