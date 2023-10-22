class SalesConnection implements ConnectionState {
  @Override
  public void open() {
    System.out.println (" SalesConnection ouverte.");
  }

  @Override
  public void close() {
    System.out.println (" SalesConnection fermée.");
  }

  @Override
  public void log() {
    System.out.println (" SalesLogging Connection.");
  }

  @Override
  public void update() {
    System.out.println (" SalesUpdating Connection.");
  }
}
