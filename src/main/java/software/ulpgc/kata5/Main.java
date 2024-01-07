package software.ulpgc.kata5;

import spark.Spark;

public class Main {
    public static void main(String[] args) {
        SparkCommandExecutor.put("factorial", new FactorialCommand());
        Spark.port(8080);
        Spark.get("/factorial", (req, res)->SparkCommandExecutor
                .with(req, res)
                .execute("factorial"));
    }
}
