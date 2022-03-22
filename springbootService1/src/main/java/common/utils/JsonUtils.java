package common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : wangjun
 * @date : 2022/3/11  16:54
 */
public class JsonUtils {
    public JsonUtils() {
    }

    public static String renderString(HttpServletResponse httpServletResponse, Object object) {
        return renderString(httpServletResponse, JsonMapper.toJsonString(object), "application/json");
    }

    public static String renderString(HttpServletResponse response, String string, String type) {
        try {
            response.setContentType(type);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            return null;
        }

        return null;
    }


}
