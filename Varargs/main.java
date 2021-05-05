class Main {
    private String nameType(String s, String... x) {
        String[] name = x;
        int count_name = 1;
        System.out.println(s);
        for (String i : name) {
            System.out.println(count_name + " name is : " + i);
            count_name++;
        }
        return "";
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.nameType("sonu");
        mn.nameType("Lokesh", "monu");
        mn.nameType("Delta", "tonnty", "moly", "dli", "uja");
    }

}
