import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;

public class HelloActor extends AbstractBehavior<String> {

    // Factory method to create the HelloActor behavior
    public static Behavior<String> create() {
        return Behaviors.setup(HelloActor::new);
    }

    // Constructor
    private HelloActor(ActorContext<String> context) {
        super(context);
    }

    @Override
    public Receive<String> createReceive() {
        return newReceiveBuilder()
                .onMessage(String.class, this::onMessage)
                .build();
    }

    // Method to handle the incoming message
    private Behavior<String> onMessage(String message) {
        System.out.println("Received message: " + message);
        return this; // Keep the behavior unchanged
    }
}
