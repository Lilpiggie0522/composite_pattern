import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new ArrayList<>();
    private String name;
    private Integer price;

    public Composite(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void addChildren(Component child) {
        children.add(child);
    }

    public void removeChildren(Component child) {
        children.remove(child);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    public Integer getBuildCost() {
        Integer buildCost = this.price;
        return children.stream().map(Component :: getPrice).reduce(buildCost, Integer :: sum);
    }
}
