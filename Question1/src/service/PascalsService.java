package service;

import java.util.List;
import api.HTTPLogic;
import model.PascalsLogic;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PascalsService {

    private HTTPLogic httpLogic;
    private PascalsLogic pascalsLogic;

    public PascalsService(HTTPLogic httpLogic, PascalsLogic pascalsLogic) {
        this.httpLogic = httpLogic;
        this.pascalsLogic = pascalsLogic;
    }

    public void process(String geturl, String postUrl) throws Exception {

        String response = httpLogic.get(geturl);

        // INPUT RESPONSE DATA HERE
        String questionid = questionid = "2da0e9a8-5c18-4933-bf48-0bdb9a378bfe";
        int numRows = 4;

        List<List<Integer>> Pascals = pascalsLogic.generate(numRows);

        // Payload prep
        String payload = "{\"id\": \"" + questionid + "\", \"answer\": " + Pascals.toString() + "}";

        // LOCAL TEST
        // System.out.println(payload);

        httpLogic.post(postUrl, payload);

    }

}
