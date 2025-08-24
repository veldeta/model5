package Builder;

public class CarConstruction {
    private final String engine;
    private final int age;
    private final String body_type;

    public String toString() {
        return "Car{" +
                "Engine type: " + engine + "\nYear of production: " + age + "\nBody type: " + body_type +"}";
    }

    public CarConstruction(CarConstructionBuilder builder){
        this.engine = builder.engine;
        this.age = builder.age;
        this.body_type = builder.body_type;
    }
    public static class CarConstructionBuilder {
        private String engine;
        private int age;
        private String body_type;

        public CarConstructionBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarConstructionBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CarConstructionBuilder withBody_type(String body_type) {
            this.body_type = body_type;
            return this;
        }

        public CarConstruction build() {
            return new CarConstruction(this);
        }
    }
}
