public class Main {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.createComputer("Procesor","GraphicCard","PowerSuply");
        System.out.println(computer.description());
    }
}
