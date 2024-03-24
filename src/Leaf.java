public class Leaf implements Component {
    private String name;
    private Integer price;
    
    public Leaf(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
