package view.com.rxandretrofit;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */

public class LoginBean {


    /**
     * list : []
     * map : null
     * message : 帐号或密码不能为空
     * object : null
     * status : 200
     */

    private Object map;
    private String message;
    private Object object;
    private String status;
    private List<?> list;

    public Object getMap() {
        return map;
    }

    public void setMap(Object map) {
        this.map = map;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
