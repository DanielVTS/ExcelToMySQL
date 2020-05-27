package cn.lingnan.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnMapHandler {
    public static Map<String, Object> getSuccessMap() {
        Map<String, Object> map = new HashMap();
        map.put("code", Integer.toString(200));
        map.put("message", "success");
        return map;
    }


    public static Map<String, String> getPhoneExistMap() {
        Map<String, String> map = new HashMap();
        map.put("code", Integer.toString(409));
        map.put("message", "User with the same phone number exist!");
        return map;
    }

    public static Map<String, String> getEmptyRecordMap() {
        Map<String, String> map = new HashMap();
        map.put("code", Integer.toString(409));
        map.put("message", "No record!");
        return map;
    }


    public static Map<String, String> getErrorMap(int result) {
        Map<String, String> map = new HashMap();
        System.out.println("数据库异常,影响记录：" + result + "条");
        map.put("code", Integer.toString(500));
        map.put("message", "数据异常,影响记录：" + result + "条");
        return map;
    }

    public static Map<String, Object> getListMap(String listName, List<?> list) {
        Map<String, Object> map = ReturnMapHandler.getSuccessMap();
        map.put(listName, list);
        return map;
    }

}
