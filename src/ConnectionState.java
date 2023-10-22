// Interface pour les états de connexion
interface ConnectionState {
  void open();

  void close();

  void log();

  void update();
}
