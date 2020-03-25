
package f5ex2;

public class main {

    public static void main(String[] args) {
        int i;
        Membros Paulo = new Membros("Paulo", "PORTUGUESA", "18-04-1998");
        Membros Bifes = new Membros("Hugo", "PORTUGUESA", "06-06-2001");
        Membros Filipa = new Membros("Filipa", "PORTUGUESA", "02-09-1999");
        Membros[] bmembros = new Membros[]{Paulo, Bifes, Filipa};
        Tracks track1 = new Tracks(1, "numb", 3.00);
        Tracks track2 = new Tracks(2, "in the end", 3.00);
        Tracks track3 = new Tracks(3, "Paper", 3.00);
        Tracks[] tracksnumb = new Tracks[]{track1, track2, track3};
        Tracks[] tracksite = new Tracks[]{track2, track3};
        CD NUMB = new CD("LINKIN PARK", "NUMB", 3.00, "23-03-2020", "Chester", tracksnumb, bmembros);
        CD INTHEEND = new CD("LINKIN PARK", "IN THE END", 3.00, "22-03-2020", "Chester", tracksite, bmembros);
        CD[] Cds = new CD[]{NUMB, INTHEEND};
        
        for (i = 0; i < Cds.length; i++) {
            System.out.println(Cds[i].namecd);
            System.out.println(Cds[i].banda);
            System.out.println(Cds[i].data);
            System.out.println("Nome:" + Cds[i].tracks[0].nomefaixa);
            System.out.println("Nome:" + Cds[i].tracks[1].nomefaixa);
            System.out.println("Membros da banda:" );
            for(int j = 0; j < bmembros.length; j++){
                System.out.println(Cds[i].membros[j].name);
            }
            System.out.println("-----------------");
        }
    }
}
