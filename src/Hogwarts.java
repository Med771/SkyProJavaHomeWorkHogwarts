import java.util.Objects;

abstract class Hogwarts {
    // Init
    protected final String name;
    protected final int power;
    protected final int transgressionDistance;

    // Constructor
    public Hogwarts(String name, int power, int transgressionDistance) {
        this.name = name;
        this.power = power;
        this.transgressionDistance = transgressionDistance;
    }

    // Get
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    // Compare methods
    public void comparePower(Hogwarts student) {
        if (student == null) {
            return;
        }

        if (student.getPower() < this.getPower()) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (student.getPower() > this.getPower()) {
            System.out.println(this.getName() + " обладает меньшей мощностью магии, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " обладает равной мощностью магии, как и " + student.getName());
        }
    }

    public void compareTransgressionDistance(Hogwarts student) {
        if (student == null) {
            return;
        }

        if (student.getTransgressionDistance() < this.getTransgressionDistance()) {
            System.out.println(this.getName() + " обладает большим расстоянием трансгрессии, чем " + student.getName());
        } else if (student.getTransgressionDistance() > this.getTransgressionDistance()) {
            System.out.println(this.getName() + " обладает меньшим расстоянием трансгрессии, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " обладает равным расстоянием трансгрессии, как и " + student.getName());
        }
    }
}

class Gryffindor extends Hogwarts {
    // Init
    private final int nobility;
    private final int honour;
    private final int courage;

    // Constructor
    public Gryffindor(String name, int power, int transgressionDistance, int nobility, int honour, int courage) {
        super(name, power, transgressionDistance);

        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
    }

    // Get
    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getCourage() {
        return courage;
    }

    // Compare method
    public void compareSumOfSkills(Gryffindor student) {
        if (student == null) {
            return;
        }

        int sumOfSkills1 = nobility + honour + courage;
        int sumOfSkills2 = student.getNobility() + student.getHonour() + student.getCourage();

        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(name + " лучший Гриффиндорец, чем " + student.getName());
        }
        else if (sumOfSkills1 < sumOfSkills2) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + name);
        }
        else {
            System.out.println(name + " и " + student.getName() + " равны по способностям");
        }
    }

    // Base methods
    @Override
    public String toString() {
        return "name: " + name +
                "\npower: " + power +
                "\ntransgressionDistance: " + transgressionDistance +
                "\nnobility: " + nobility +
                "\nhonour: " + honour +
                "\ncourage: " + courage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor gryffindor = (Gryffindor) o;
        return name.equals(gryffindor.getName()) &&
                power == gryffindor.getPower() &&
                transgressionDistance == gryffindor.getTransgressionDistance() &&
                nobility == gryffindor.getNobility() &&
                honour == gryffindor.getHonour() &&
                courage == gryffindor.getCourage();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, transgressionDistance, nobility, honour, courage);
    }
}

class Puffendui extends Hogwarts {
    // Init
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    // Constructor
    public Puffendui(String name, int power, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, power, transgressionDistance);

        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    // Get
    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    // Compare method
    public void compareSumOfSkills(Puffendui student) {
        if (student == null) {
            return;
        }

        int sumOfSkills1 = diligence + loyalty + honesty;
        int sumOfSkills2 = student.getDiligence() + student.getLoyalty() + student.getHonesty();

        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(name + " лучший Пуфендуец, чем " + student.getName());
        }
        else if (sumOfSkills1 < sumOfSkills2) {
            System.out.println(student.getName() + " лучший Пуфендуец, чем " + name);
        }
        else {
            System.out.println(name + " и " + student.getName() + " равны по способностям");
        }
    }

    // Base methods
    @Override
    public String toString() {
        return "name: " + name +
                "\npower: " + power +
                "\ntransgressionDistance: " + transgressionDistance +
                "\ndiligence: " + diligence +
                "\nloyalty: " + loyalty +
                "\nhonesty: " + honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puffendui puffendui = (Puffendui) o;
        return name.equals(puffendui.getName()) &&
                power == puffendui.getPower() &&
                transgressionDistance == puffendui.getTransgressionDistance() &&
                diligence == puffendui.getDiligence() &&
                loyalty == puffendui.getLoyalty() &&
                honesty == puffendui.getHonesty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, transgressionDistance, diligence, loyalty, honesty);
    }
}

class Cogtevran extends Hogwarts {
    // Init
    private final int clever;
    private final int wise;
    private final int witty;
    private final int creative;

    // Constructor
    public Cogtevran(String name, int power, int transgressionDistance, int clever, int wise, int witty, int creative) {
        super(name, power, transgressionDistance);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    // Get
    public int getClever() {
        return clever;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    // Compare method
    public void compareSumOfSkills(Cogtevran student) {
        if (student == null) {
            return;
        }

        int sumOfSkills1 = clever + wise + witty + creative;
        int sumOfSkills2 = student.getWise() + student.getWitty() + student.getCreative();

        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(name + " лучший Когтевранец, чем " + student.getName());
        }
        else if (sumOfSkills1 < sumOfSkills2) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + name);
        }
        else {
            System.out.println(name + " и " + student.getName() + " равны по способностям");
        }
    }

    // Base methods
    @Override
    public String toString() {
        return "name: " + name +
                "\npower " + power +
                "\ntransgressionDistance: " + transgressionDistance +
                "\n clever: " + clever +
                "\n wise: " + wise +
                "\n witty: " + witty +
                "\ncreative: " + creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cogtevran cogtevran = (Cogtevran) o;
        return name.equals(cogtevran.getName()) &&
                power == cogtevran.getPower() &&
                transgressionDistance == cogtevran.getTransgressionDistance() &&
                clever == cogtevran.getClever() &&
                wise == cogtevran.getWise() &&
                witty == cogtevran.getWitty() &&
                creative == cogtevran.getCreative();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, transgressionDistance, clever, wise, witty, creative);
    }
}

class Slytherin extends Hogwarts {
    // Init
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    // Constructor
    public Slytherin(String name, int power, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, power, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    // Get
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    // Compare method
    public void compareSumOfSkills(Slytherin student) {
        if (student == null) {
            return;
        }

        int sumOfSkills1 = cunning + determination + ambition + resourcefulness + lustForPower;
        int sumOfSkills2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();

        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(name + " лучший Слизеринец, чем " + student.getName());
        }
        else if (sumOfSkills1 < sumOfSkills2) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + name);
        }
        else {
            System.out.println(name + " и " + student.getName() + " равны по способностям");
        }
    }


    // Base methods
    @Override
    public String toString() {
        return "name: " + name +
                "\npower: " + power +
                "\ntransgressionDistance: " + transgressionDistance +
                "\ncunning: " + cunning +
                "\ndetermination: " + determination +
                "\nambition: " + ambition +
                "\nresourcefulness: " + resourcefulness +
                "\nlustForPower: " + lustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return name.equals(slytherin.getName()) &&
                power == slytherin.getPower() &&
                transgressionDistance == slytherin.getTransgressionDistance() &&
                cunning == slytherin.getCunning() &&
                determination == slytherin.getDetermination() &&
                ambition == slytherin.getAmbition() &&
                resourcefulness == slytherin.getResourcefulness() &&
                lustForPower == slytherin.getLustForPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, transgressionDistance, cunning, determination, ambition, resourcefulness, lustForPower);
    }
}
