package java6.jsp;

public class Calc {
    private int pierwszySkladnik;
    private int drugiSkladnik;
    private char operacja;
    private String wynik;

    public String getWynik() {
        switch (operacja){
            case '+' : {
                wynik = Double.toString(pierwszySkladnik + drugiSkladnik);
                break;
            }
            case '-': {
                wynik = Double.toString(pierwszySkladnik - drugiSkladnik);
                break;
            }
            case '*': {
                wynik = Double.toString(pierwszySkladnik * drugiSkladnik);
                break;
            }
            case '/': {
                if(drugiSkladnik != 0){
                    wynik = Double.toString((double)pierwszySkladnik / drugiSkladnik);
                    break;
                }else{
                    wynik = "Dzielenie przez zero";
                    break;
                }
            }
        }
        return wynik;
    }

    public int getPierwszySkladnik() {
        return pierwszySkladnik;
    }

    public void setPierwszySkladnik(int pierwszySkladnik) {
        this.pierwszySkladnik = pierwszySkladnik;
    }

    public int getDrugiSkladnik() {
        return drugiSkladnik;
    }

    public void setDrugiSkladnik(int drugiSkladnik) {
        this.drugiSkladnik = drugiSkladnik;
    }

    public char getOperacja() {
        return operacja;
    }

    public void setOperacja(char operacja) {
        this.operacja = operacja;
    }
}
