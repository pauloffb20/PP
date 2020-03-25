package CD;

public class main {

    public static void main(String[] args) {

        Autores Paulo = new Autores("Paulo", "PORTUGUESA", "18-04-1998");
        Autores Bifes = new Autores("Hugo", "PORTUGUESA", "06-06-2001");
        Autores Filipa = new Autores("Filipa", "PORTUGUESA", "02-09-1999");
        Autores[] autor = new Autores[]{Paulo, Bifes, Filipa};
        Tracks track1 = new Tracks(1, "numb", 3.00, autor);
        Tracks track2 = new Tracks(2, "in the end", 3.00, autor);
        Tracks track3 = new Tracks(3, "Papercut", 3.00, autor);
        Tracks track4 = new Tracks(4, "What i've done", 3.00, autor);
        Tracks[] tracks = new Tracks[]{track1, track2, track3};
        Tracks[] tracks1 = new Tracks[]{track3, track4};
        CD NUMB = new CD("LINKIN PARK", "NUMB", 3.00, "23-03-2020", "Chester", tracks);
        CD INTHEEND = new CD("LINKIN PARK", "IN THE END", 3.00, "22-03-2020", "Chester", tracks1);
        CD[] Cds = new CD[]{NUMB, INTHEEND};

        for (int i = 0; i < Cds.length; i++) {
            System.out.println(Cds[i].namecd);
            System.out.println(Cds[i].banda);
            System.out.println(Cds[i].data);
            if (i == 0) {
                for (int j = 0; j < tracks.length; j++) {
                    System.out.println(Cds[i].tracks[j].faixanr + "---" + Cds[i].tracks[j].nomefaixa + " " + "autor" +  ":" + Cds[i].tracks[j].autores[j].name);
                }

            } else if (i == 1) {
                for (int j = 0; j < tracks1.length; j++) { 
                    System.out.println(Cds[i].tracks[j].faixanr + "---" + Cds[i].tracks[j].nomefaixa + " " + "autor" + ":" + Cds[i].tracks[j].autores[j].name);
                }
            }
            System.out.println("------------------");
        }
    }
}
