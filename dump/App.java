package nl.ivonet;

import javax.annotation.Resource;
import java.net.URI;

public class App{
    private static final int SERVER_PORT = 2222;

    public static void main(String[] args) throws Exception {
        URI baseUri = UriBuilder.fromUri("http://localhost").port(SERVER_PORT)
        .build();
        ResourceConfig config = new ResourceConfig(Resource.class);
        Server server = JettyHttpContainerFactory.createServer(baseUri, config,
        false);

        ContextHandler contextHandler = new ContextHandler("/rest");
        contextHandler.setHandler(server.getHandler());

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setWelcomeFiles(new String[] { "index.html" });
        resourceHandler.setResourceBase("src/Web");

        HandlerCollection handlerCollection = new HandlerCollection();
        handlerCollection.setHandlers(new Handler[] { resourceHandler,
        contextHandler, new DefaultHandler() });
        server.setHandler(handlerCollection);
        server.start();
        server.join();
        }
}