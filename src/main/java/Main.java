import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        BooleanSearchEngine engine = new BooleanSearchEngine(new File("pdfs"));

        SearchEngineServer server = new SearchEngineServer(8989, engine);
        server.start();
    }
}