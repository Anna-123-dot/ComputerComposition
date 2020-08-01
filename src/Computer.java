public class Computer {
    private Processor processor;
    private GraphicCard graphicCard;
    private  PowerSuply powerSuply;
    public Computer(String processor, String graphicCard, String powerSuply) {
        this.processor = new Processor(processor);
        this.graphicCard = new GraphicCard(graphicCard);
        this.powerSuply = new PowerSuply(powerSuply);
    }

    public String description(){
        return toString();
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public PowerSuply getPowerSuply() {
        return powerSuply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", graphicCard=" + graphicCard +
                ", powerSuply=" + powerSuply +
                '}';
    }
}
