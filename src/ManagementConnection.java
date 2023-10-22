class ManagementConnection implements ConnectionState {
  @Override
  public void open() {
    System.out.println ("ManagementConnection  ouverte.");
  }

  @Override
  public void close() {
    System.out.println ("ManagementConnection  fermée.");
  }

  @Override
  public void log() {
    System.out.println (" ManagementLogging Connection.");
  }

  @Override
  public void update() {
    System.out.println (" ManagementUpdating Connection.");
  }
}
