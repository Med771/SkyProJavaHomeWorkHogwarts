class Main {
    public static void main(String[] args) {
        Gryffindor studentHarryPotter = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        Gryffindor studentHermioneGranger = new Gryffindor("Hermione Granger", 99, 99, 99, 99, 99);
        Gryffindor studentRonWeasley = new Gryffindor("Ron Weasley", 98, 98, 98, 98, 98);

        Slytherin studentDracoMalfoy = new Slytherin("Draco Malfoy", 97, 97, 97, 97, 97, 97, 97);
        Slytherin studentGrahamMontague = new Slytherin("Graham Montague", 96, 96, 96, 96, 96, 96, 96);
        Slytherin studentGregoryGoyle = new Slytherin("Gregory Goyle", 95, 95, 95, 95, 95,95, 95);

        Puffendui studentZachariahSmith = new Puffendui("Zachariah Smith", 94, 94, 94, 94, 94);
        Puffendui studentCedricDiggory = new Puffendui("Cedric Diggory", 93, 93, 93, 93, 93);
        Puffendui studentJustinFinchFletchley = new Puffendui("Justin Finch-Fletchley", 92, 92, 92, 92, 92);

        Cogtevran studentZhouChang = new Cogtevran("Zhou Chang", 91, 91, 91, 91, 91, 91);
        Cogtevran studentPadmaPatil = new Cogtevran("Padma Patil", 90, 90, 90, 90, 90, 90);
        Cogtevran studentMarcusBelby = new Cogtevran("Marcus Belby", 89, 89, 89, 89, 89, 89);

        System.out.println(studentHarryPotter.toString());
        System.out.println(studentHermioneGranger.toString());
        System.out.println(studentRonWeasley.toString());

        System.out.println(studentDracoMalfoy.toString());
        System.out.println(studentGrahamMontague.toString());
        System.out.println(studentGregoryGoyle.toString());

        System.out.println(studentZachariahSmith.toString());
        System.out.println(studentCedricDiggory.toString());
        System.out.println(studentJustinFinchFletchley.toString());

        System.out.println(studentZhouChang.toString());
        System.out.println(studentPadmaPatil.toString());
        System.out.println(studentMarcusBelby.toString());

        studentHarryPotter.compareSumOfSkills(studentHermioneGranger);
        studentDracoMalfoy.compareSumOfSkills(studentGrahamMontague);
        studentZachariahSmith.compareSumOfSkills(studentCedricDiggory);
        studentZhouChang.compareSumOfSkills(studentPadmaPatil);

        studentHarryPotter.comparePower(studentZachariahSmith);
    }
}
