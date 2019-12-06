class Car {
    private String model;
    private String id;

    Car(String model) {
        setModel(model);
    }

    Car(String model, String id) {
        setModel(model);
        setId(id);
    }

    String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model.equalsIgnoreCase("BMW") ||
                model.equalsIgnoreCase("Mercedes") ||
                model.equalsIgnoreCase("Fiat"))
            this.model = model;
        else
            System.out.println("Wrong car brand. BMW, Mercedes or Fiat only!");
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    void printCar() {
        if (id == null)
            System.out.printf("%-9s%n", model);
        else
            System.out.printf("%-9s%n[%-7s]%n", model, id);
    }
}
