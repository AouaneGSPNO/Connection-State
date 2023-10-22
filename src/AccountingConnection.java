class AccountingConnection implements ConnectionState {
  @Override
  public void open() {
    System.out.println (" AccountingConnection ouverte.");
  }

  @Override
  public void close() {
    System.out.println (" AccountingConnection fermée.");
  }

  @Override
  public void log() {

    System.out.println (" AccountingLogging Connection.");
  }

  @Override
  public void update() {
    System.out.println (" AccountingUpdating Connection.");
  }
}
