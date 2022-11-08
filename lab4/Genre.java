public class Genre {
    String typeName;
    String genreName;
    int chromosomes;
    int baseXchromosomes;
    String desc;

    public Genre(String typeName, String genreName, int chromosomes, int baseXchromosomes, String desc) {
        this.typeName = typeName;
        this.genreName = genreName;
        this.chromosomes = chromosomes;
        this.baseXchromosomes = baseXchromosomes;
        this.desc = desc;
    }

    public Genre(Genre g) {
        this.typeName = g.typeName;
        this.genreName = g.genreName;
        this.chromosomes = g.chromosomes;
        this.baseXchromosomes = g.baseXchromosomes;
        this.desc = g.desc;
    }

    public String getAll() {
        return "Type name: " + typeName +
                "\nGenre name: " + genreName +
                "\nChromosomes number: " + chromosomes +
                "\nBase X chromosomes number: " + baseXchromosomes +
                "\nDescription: " + desc;
    }

    public String getFullName() {
        return typeName + ", " + genreName + " genre";
    }

    public String getChromosomes() {
        return 2 * chromosomes + " chromosomes, of which " + baseXchromosomes + " are X";
    }

    public Genre clone() {
        Genre g = new Genre(this);
        return g;
    }
}
