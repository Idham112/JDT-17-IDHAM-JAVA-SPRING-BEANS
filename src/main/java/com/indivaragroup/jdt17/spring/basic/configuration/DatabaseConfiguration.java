package com.indivaragroup.jdt17.spring.basic.configuration;

public class DatabaseConfiguration {
    public static DatabaseConfiguration databaseConfiguration;

    private DatabaseConfiguration() {

    }

    public static DatabaseConfiguration getInstance() {
        if (databaseConfiguration == null) {
            databaseConfiguration = new DatabaseConfiguration();
        }
        return databaseConfiguration;
    }
}
