import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserGbPosts extends Parser{

    private static final String url = "https://gb.ru/posts";
    private static final String nameBlockGeneral = "div[class=post-items-wrapper]";
    private static final String nameBlockLink = "a[class=post-item__title h3 search_text]";

    public static List<JSONObject> getJsonGbEvents() throws IOException, JSONException {
        JSONObject jsonObject = new JSONObject();
        List<JSONObject> jsonObjectList = new ArrayList<>();
        Elements posts = getBlockElements(url,nameBlockGeneral, nameBlockLink);
        for (Element post: posts) {
            String url = post.attr("href");
            String text = post.text();
            jsonObject = getJson(url,text);
            jsonObjectList.add(jsonObject);
        }
        return jsonObjectList;
    }

}
