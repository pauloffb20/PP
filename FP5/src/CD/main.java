/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

public class main {

    public static void main(String[] args) {
        int i;

        CD NUMB = new CD("LINKIN PARK", "NUMB", 3.00, "23-03-2020", "Chester");
        CD INTHEEND = new CD("LINKIN PARK", "IN THE END", 3.00, "22-03-2020", "Chester");
        CD[] cds = new CD[]{NUMB, INTHEEND};
        Tracks track1 = new Tracks(1, "nab", 3.00, "nirvana");
        Tracks track2 = new Tracks(2, "noob", 3.00, "Tokyo Hotel");
        Tracks[] tracks = new Tracks[]{track1, track2};

        System.out.println(NUMB.namecd);
        System.out.println(NUMB.data);
        System.out.println(NUMB.banda);

        for(i = 0; i < tracks.length; i++){
            System.out.println(tracks[i].faixanr);
            System.out.println(tracks[i].nomefaixa);
        }

    }
    }



