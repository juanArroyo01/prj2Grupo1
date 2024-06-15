package recursividad;

public class ArroyoJuan {

    // Attributes
    private int total;

    // Constructors
    public ArroyoJuan() {
        setTotal(0);
    }

    // Getters & Setters
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Conteo progresivo hasta un numero num, 
     * donde el usuario ingresa un numero 
     * limite y se genera con recursividad el 
     * aumento del numero anterior.
     * 
     * @param num
     * @return
     */
    public Integer jaR05(Integer num) {
        if (getTotal() <= num) {
            System.out.print(" " + getTotal() + " ");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setTotal(getTotal() + 1);
            return jaR05(num);
        }
        return getTotal();
    }

}
