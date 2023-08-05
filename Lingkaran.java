class Lingkaran {
    private State state;

    public Lingkaran() {
        state = new StateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void draw() {
        state.draw();
    }

    public void erase() {
        state.erase();
    }    
}