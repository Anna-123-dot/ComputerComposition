public class GraphicCard {
    private String name;

    public GraphicCard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "name='" + name + '\'' +
                '}';
    }
}
