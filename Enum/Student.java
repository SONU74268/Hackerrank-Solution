class Student {

    static Body b1;

    Student(Body b1) {
        this.b1 = b1;
    }

    private String bodyPartCall(Body b1) {
        switch (b1) {
            case Ear:
                System.out.println("Ear called");
                break;
            case Heart:
                System.out.println("Heart called");
                break;
            case Leg:
                System.out.println("Leg called");
                break;
            case Nails:
                System.out.println("Nails called");
                break;
            case Nose:
                System.out.println("Nose called");
                break;

            default:
                System.out.println("Nothing called");
                break;
        }
        return "";
    }

    public static void main(String[] args) {

        Student s = new Student(b1);

        System.out.print("1 call = > ");
        s.bodyPartCall(b1.Ear);
        System.out.print("2 call = > ");
        s.bodyPartCall(b1.Nose);
        System.out.print("3 call = > ");
        s.bodyPartCall(b1.Nails);
        System.out.print("4 call = > ");
        s.bodyPartCall(b1.Heart);
        System.out.print("5 call = > ");
        s.bodyPartCall(b1.Leg);
        for (Body b : s.b1) {
            System.out.println(b);
        }

    }
}