# javafx-maven-template
Minimal "hello-world" javafx project that builds with maven, Java 9+. Exports a module already. 

From Java 9 on it has become a bit more complicated to set up a proper javafx project that will later be able to be jlinked etc. 
I just figured out how to do this again, and I won't do it again, so here is this template. 

Requires a JDK installation (something Java 9+) and a maven installation. 
In your IDE, find your Maven Window, and under `plugins` -> `javafx` -> `run` you can run the app. There you also find the `jlink` option. 