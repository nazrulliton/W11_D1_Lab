public class Printer {
    private int sheetsLeft;
    private int numPages;
    private int numCopies;

    public Printer(int sheetsLeft, int numPages, int numCopies) {
        this.sheetsLeft = sheetsLeft;
        this.numPages = numPages;
        this.numCopies = numCopies;
    }

    public int getVolume() {
        return this.sheetsLeft;
    }

    public int print() {
        if (this.sheetsLeft >= (this.numPages * this.numCopies)) {
            return this.sheetsLeft -= (this.numPages * this.numCopies);
        } else {
            return 0;
        }
    }
}

