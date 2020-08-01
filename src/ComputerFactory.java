public class ComputerFactory {
    public Computer createComputer(String nazwaP,String nazwaG, String nazwaPow){
        return  new Computer(nazwaP,nazwaG,nazwaPow);


    }
}
