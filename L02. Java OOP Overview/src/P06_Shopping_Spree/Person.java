package P06_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> bag;

    Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.setBagOfProduct(new ArrayList<>());
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isEmpty()||name.trim().length()==0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getBagOfProducts() {
        return this.bag;
    }

    private void setBagOfProduct(ArrayList<Product> bagOfProducts) {
        this.bag = bagOfProducts;
    }

    public void addProduct(Product product) {
        if (product.getCost() > this.getMoney()) {
            printCannotBuyMessage(product);
            return;
        }
        printBuyMessage(product);
        this.setMoney(this.getMoney() - product.getCost());
        this.bag.add(product);
    }

    private void printCannotBuyMessage(Product product) {
        System.out.printf("%s can't afford %s\n", this.getName(), product.getName());
    }

    private void printBuyMessage(Product product) {
        System.out.printf("%s bought %s\n", this.getName(), product.getName());
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.getName(),
                this.bag.size() > 0 ? this.bag
                        .stream().map(String::valueOf).collect(Collectors.joining(", ")) : "Nothing bought");
    }

}
