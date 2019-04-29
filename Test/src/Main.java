public class Main {

    public static void main(String[] args) {

        String list1 = "\\Users\\Schnapfel\\IdeaProjects\\Test\\List1.txt";
        String list2 = "\\Users\\Schnapfel\\IdeaProjects\\Test\\List2.txt";

        System.out.println("Hello World!");
        Reader bfr = new Reader();
        Comperator comp = new Comperator();
        //bfr.readList(list1);
        //bfr.readList(list2);

        //comp.saveInArray(list1);
        //comp.saveInArray(list2);

        comp.compareLists(list1,list2);
    }
}
