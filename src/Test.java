public class Test {
    public static void main(String[] args) {
        Composite mb = new Composite("mboard", 200);
        Leaf cpu = new Leaf("cpu", 430);
        Leaf fan = new Leaf("fan", 80);
        Leaf gpu = new Leaf("gpu", 630);
        Leaf ram = new Leaf("kingston-64g", 100);
        mb.addChildren(cpu);
        mb.addChildren(fan);
        mb.addChildren(gpu);
        mb.addChildren(ram);
        System.out.printf("mb's build cost is %d\n", mb.getBuildCost());
    }
}
