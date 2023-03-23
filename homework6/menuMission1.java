package homeWork.homework6;

public class menuMission1 {
   
    private static final String TASK_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Показать все ноутбуки"
            + "\n\t2 - Искать"
            + "\n\t0 - Выход";

    public static void taskMenuSeminar6() {
        boolean itContinues = true;
        while (itContinues) {
            System.out.println(TASK_MENU);
            switch (ScannerHelper.getIntFromInput("Выберите задачу: ")) {
                case 1:
                    mission.viewAllLaptop();
                    break;
                case 2:
                    mission.viewFilterLaptop();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого действия не существует!");
                    break;
            }
        }
        ScannerHelper.close();
}
}