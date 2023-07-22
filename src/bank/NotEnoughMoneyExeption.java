package bank;

public class NotEnoughMoneyExeption extends Exception{
    NotEnoughMoneyExeption(){
        super("HIBA! Nincs elég pénz a számládon");
    }
}
