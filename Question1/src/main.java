import api.HTTPLogic;
import model.PascalsLogic;
import service.PascalsService;

public class main {
    public static void main(String[] args) {

        HTTPLogic httpLogic = new HTTPLogic();
        PascalsLogic pascalsLogic = new PascalsLogic();

        PascalsService service = new PascalsService(httpLogic, pascalsLogic);

        String getUrl = "https://assessment.takafulbrunei.com/v1/question/1";

        String postUrl = "https://assessment.takafulbrunei.com/v1/question/1";

        try {

            service.process(getUrl, postUrl);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
