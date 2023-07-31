public class Printer {
    private int paper;
    private int toner;

    public Printer (int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }


    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int i, int i1) {
        int pagesPrinted = i * i1;
        if (this.paper >= pagesPrinted) {
            this.paper -= pagesPrinted;
            this.toner -= pagesPrinted;
        } else {
            System.out.println("Insufficient paper");
        }
    }
}
