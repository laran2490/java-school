package ru.mivr.second.object;

/**
 * Запуск проверок
 */
public class App {
    public static void main(String[] args) {
        PineTree pineTree1 = new PineTree("Canada");
        pineTree1.setAge(10);
        PineTree pineTree2 = new PineTree("Canada");
        pineTree2.setAge(20);

        PineTree pineTree = new PineTree();
        System.out.println(pineTree.getGrowRegion());

        BirchTree breakTree = new BirchTree(1, 3);


        Tree birchTree1 = new BirchTree(200);
        /*BirchTree birchTree2 = new BirchTree(10, 200);
        System.out.println(birchTree1);
        System.out.println(birchTree2);

        //getClass
        System.out.println(birchTree1.getClass().getSuperclass().getSimpleName());*/
    }
}
