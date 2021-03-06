package site.zhangcui.database.addr.common.exception.result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年3月1日-上午11:01:30
 * @param <T>
 */
public class ResultData<T> {
    private ResponseMessage state;
    private Object data;
    private List<T> dataList;


    public ResultData(ResponseMessage state) {

        this.state = state;
    }

    public ResultData(ResponseMessage state, Object data) {
        this.data = data;
        this.state = state;
    }

    public ResultData(ResponseMessage state, long data, boolean isId){
        this.state = state;
        Map<String, Long> map = new HashMap<>();
        map.put("id", data);
        this.data = map;
    }

    public ResultData(ResponseMessage state, long id){
        this.state = state;
        Map<String, Long> map = new HashMap<>();
        map.put("id", id);
        this.data = map;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    public ResponseMessage getState(){
        return state;
    }

    public List<T> getDataList(){
        return dataList;
    }

}