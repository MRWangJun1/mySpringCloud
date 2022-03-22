package common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : wangjun
 * @date : 2022/3/11  16:53
 */
@Data
public class RestfulResult implements Serializable {

    private static final long serialVersionUID = 5316434063557857004L;
    private String result = "Success";
    private String message;
    // 返回数据
    private Object data;
    // page数
    private int cntPage;
    // 返回数据总数
    private long cntData;
}
