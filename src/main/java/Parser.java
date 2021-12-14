import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class Parser {

    protected static Document getPageByLink(String url) throws IOException {
        return Jsoup.parse(new URL(url), 5000);
    }

    protected static Elements getBlockElements (String url, String cssQueryBlock, String addBlock, String cssQueryElements) throws IOException {
        Document page = getPageByLink(url);
        Element block = page.select(cssQueryBlock).first();
        Elements blockAdd = block.select(addBlock);
        Elements elements = blockAdd.select(cssQueryElements);
        return elements;
    }

    protected static Elements getBlockElements (String url, String cssQueryBlock, String cssQueryElements) throws IOException {
        Document page = getPageByLink(url);
        Element block = page.select(cssQueryBlock).first();
        Elements elements = block.select(cssQueryElements);
        return elements;
    }

    protected static JSONObject getJson(String url, String text) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", text);
        jsonObject.put("link", url);
        return jsonObject;
    }
}
