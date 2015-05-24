package eu.hurion.demo;

import static spark.Spark.get;

public class Launcher {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        get("/hello", (req, res) -> "Hello World");
    }
}
