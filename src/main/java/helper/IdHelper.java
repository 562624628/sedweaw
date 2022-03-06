package helper;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/6
 */
public class IdHelper {
    public static Integer idx(AtomicInteger id){
        id.set(id.get()+1000);
        return id.get();
    }
}
