import org.json.JSONException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, JSONException {

        ParserFactory factory = new ParserFactory();

        Parser parserGbEvents = factory.getParser(ParserTypes.GBEVENTS);
        Parser parserGbPosts = factory.getParser(ParserTypes.GBPOSTS);
        Parser parserSkillboxEvents = factory.getParser(ParserTypes.SKILLBOX_EVENTS);
        Parser parserSkillFactoryEvents = factory.getParser(ParserTypes.SKILLFACTORY_EVENTS);

        System.out.println(parserGbEvents.parse());
        System.out.println(parserGbPosts.parse());
        System.out.println(parserSkillboxEvents.parse());
        System.out.println(parserSkillFactoryEvents.parse());

    }
}
