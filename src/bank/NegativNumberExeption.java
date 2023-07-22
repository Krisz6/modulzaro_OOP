package bank;

public class NegativNumberExeption extends Exception{
    NegativNumberExeption(){
        super("HIBA! A megadott összegnek nagyobbnak kell lennie 0-nál.");
    }
}
