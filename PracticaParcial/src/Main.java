public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete(44771675,"Valentin",1.72,73.0,21);
        Athlete athlete2 = new Athlete(42365714,"Claudio",1.68,70.0,24);
        Athlete athlete3 = new Athlete(45687124,"Pedro",1.78,79.0,19);

        NationalTeam argentina = new NationalTeam("Celeste y blanco","Argentina");
        argentina.addAthlete(athlete1);
        argentina.addAthlete(athlete2);
        argentina.addAthlete(athlete3);

        Athlete athlete4 = new Athlete(41687532,"Santiago",1.65,69.0,26);
        Athlete athlete5 = new Athlete(44987321,"Juan",1.80,75.0,22);
        Athlete athlete6 = new Athlete(42169857,"Alfredo",1.71,72.0,23);

        NationalTeam chile = new NationalTeam("Rojo y azul","Chile");
        chile.addAthlete(athlete4);
        chile.addAthlete(athlete5);
        chile.addAthlete(athlete6);

        Proof prueba1 = new Proof(1,"Salto de longitud");
        prueba1.addParticipant(athlete1);
        prueba1.addParticipant(athlete2);
        prueba1.addParticipant(athlete4);

        Proof prueba2 = new Proof(2,"Salto de altura");
        prueba2.addParticipant(athlete3);
        prueba2.addParticipant(athlete5);
        prueba2.addParticipant(athlete6);

        SportsFacilities santiago_de_chile = new SportsFacilities("Sub18","Pruebas 1-2","Santiago de Chile","Salto");


        Campus sedeChilena = new Campus(1,"15/6/2024","17:30");
        sedeChilena.addProofs(prueba1);
        sedeChilena.addProofs(prueba2);
        sedeChilena.addSportsFacilities(santiago_de_chile);

        santiago_de_chile.setCampus(sedeChilena);

        System.out.print("Nombre del 3er atleta de la 2da prueba: ");
        System.out.println(santiago_de_chile.getCampus().getItDoes().get(1).getParticipate().get(2).getName());
        System.out.print("Código de la 2da prueba: ");
        System.out.println(santiago_de_chile.getCampus().getItDoes().get(1).getCode());

        System.out.println();
        System.out.println("Alturas del los atletas del equipo de " + argentina.getCountry() + ": ");
        for (Athlete a : argentina.getBelongs()){
            System.out.print("Nombre: " + a.getName() + " - Altura: " + a.getHeight() + "m");
            System.out.println();
        }

        System.out.println();
        System.out.println("Peso extra de los atletas: ");
        for (Athlete a : argentina.getBelongs()){
            System.out.print("\nNombre: " + a.getName() + "\nPeso extra: ");
            if (a.existExtraWeight()){
                System.out.print("Si\n");
            } else {
                System.out.print("No\n");
            }
            System.out.print("------------------");
        }
    }
}