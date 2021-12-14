import org.json.JSONException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, JSONException {

        ParserGbEvents parserGbEvents = new ParserGbEvents();
        System.out.println(parserGbEvents.getJsonGbEvents());

        ParserGbPosts parserGbPosts = new ParserGbPosts();
        System.out.println(parserGbPosts.getJsonGbEvents());
    }
}
