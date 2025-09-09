class Builder {
    private final String name;
    private final String model;
    private final String color;

    private Builder(InnerBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.color = builder.color;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    static class InnerBuilder {
        private String name;
        private String model;
        private String color;

        public InnerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public InnerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public InnerBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // return the builder to build the car;
        public Builder build() {
            return new Builder(this);
        }
    }
}
