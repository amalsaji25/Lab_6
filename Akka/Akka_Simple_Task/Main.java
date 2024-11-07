import akka.actor.typed.ActorSystem;

public class Main {
    public static void main(String[] args) {
        // Create the ActorSystem and the root actor (HelloActor)
        ActorSystem<String> helloActorSystem = ActorSystem.create(HelloActor.create(), "helloActorSystem");

        // Send a "Hello, Akka!" message to the HelloActor
        helloActorSystem.tell("Hello, Akka!");

        // Terminate the actor system (optional, for simplicity)
        helloActorSystem.terminate();
    }
}
