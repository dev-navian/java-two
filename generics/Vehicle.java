package generics;

public class Vehicle<T, S> {
    T model;
    S make;

    public Vehicle(T model, S make) {
        this.model = model;
        this.make = make;
    }

    // model getter
    T getModel() {
        return model;
    }

    // make getter
    S getMake() {
        return make;
    }
}
