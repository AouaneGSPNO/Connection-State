class ConnectionController {
  private ConnectionState currentState;

  public void changeConnection(ConnectionState newState) {
    currentState = newState;
  }

  public void open() {
    currentState.open ();
  }

  public void close() {
    currentState.close ();
  }

  public void log() {
    currentState.log ();
  }

  public void update() {
    currentState.update ();
  }
}
