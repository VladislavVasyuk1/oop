package lesson1;

public class chips extends Product {

    private double calories;

    private double weight;

    public double getСalories() {
        return calories;
    }

    public void setСalories(double calories) {
        processCalories(calories);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        processWeight(weight);
    }

    private void processCalories(double calories){
        if (calories < 0) this.calories = 0;
        else this.calories = calories;
    }

    private void processWeight(double weight){
        if (weight < 50) this.weight = 50;
        else this.weight = weight;
    }


    public chips(String brand, String name, double price, double calories, double weight){
        super(brand, name, price);
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("Чипсы\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалории: %.2f\n\tВес: %.2f]",
                brand, name, price, calories, weight);
    }
}
