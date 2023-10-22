public class Main {
    public static void main(String[] args) {
        ConnectionController controller = new ConnectionController();

        System.out.println("************ Changer l'état de la connexion en AccountingConnection ***************");

        controller.changeConnection(new AccountingConnection());
        controller.open();
        controller.log();
        controller.update();
        controller.close();

        System.out.println("************ Changer l'état de la connexion en SalesConnection ***************");

        controller.changeConnection(new SalesConnection());
        controller.open();
        controller.log();
        controller.update();
        controller.close();
    }
}
