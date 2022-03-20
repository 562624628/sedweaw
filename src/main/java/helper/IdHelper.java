package helper;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: zhoulei
 * @date: 2022/3/6
 */
public class IdHelper {
    public static Integer idand10000(AtomicInteger id){
        id.set(id.get()+10000);
        return id.get();
    }
    public static Integer idand1(AtomicInteger id){
        id.set(id.get()+1);
        return id.get();
    }
}
