package net.datafaker;

/**
 * issue for: https://github.com/datafaker-net/datafaker/issues/159
 * @author SickDawn
 */
public class DarkSoul {
    private final Faker faker;

    public DarkSoul(final Faker faker) {
        this.faker = faker;
    }

    public String stats(){
        return faker.fakeValuesService().resolve("darkSoul.stats", this, faker);
    }

    public String covenants(){
        return faker.fakeValuesService().resolve("darkSoul.covenants", this, faker);
    }

    public String classes(){
        return faker.fakeValuesService().resolve("darkSoul.classes", this, faker);
    }

    public String weapon(){
        return faker.fakeValuesService().resolve("darkSoul.weapon", this, faker);
    }

    public String shield(){
        return faker.fakeValuesService().resolve("darkSoul.shield", this, faker);
    }

}