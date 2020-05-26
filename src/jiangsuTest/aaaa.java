package jiangsuTest;

import com.asiainfo.bqc.util.MD5Util;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

/**
 * 1、生成transteID的方法，现在已经写到代码里去了
 * 2、LocalDate 获取月初与月末的方法
 * 3、Math 月份取模
 */
public class aaaa {
    /**
     * 获取流水号
     * @return
     */
    public static String getTranctionId(){
        SimpleDateFormat sf =new SimpleDateFormat("yyyyMMddHHmmss");
        // 获取进程ID
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();

        String name = runtime.getName();
        name =name.substring(0, name.indexOf("@"));
        if(name.length()<5){
            int size=5-name.length();
            for(int i = 0; i < size; i++){
                name = "0" + name;
            }
        }else if(name.length()>5){
            name =name.substring(0, 5);
        }
        // 生成10位随机数
        Random rm = new Random();
        long num = Math.abs(rm.nextLong() % 10000000000L);
        String s = String.valueOf(num);
        int rmSize= 10-s.length();
        for(int i = 0; i <rmSize; i++){
            s = "0" + s;
        }
        // 返回流水号
        return "99991"+sf.format(new Date())+name+s;
    }

    public static void main(String[] args) {
//        String tranctionId = getTranctionId();
//        String md5 = MD5Util.MD5EncodeLower("qi&78HJW_"+tranctionId);
//        System.out.println(tranctionId);
//        System.out.println(md5);


//
        Map map = getCycleBeginAndEndDateByDate("20170928");
        System.out.println(map);

        getMonthMod("253005354483");

        List<String> result = new ArrayList<>();
        System.out.println("---------------");
        System.out.println(result.get(0));


//        ListUtils.sort();
    }

    /**
     * LocalDate 获取月初与月末的方法
     * @param sReferenceDate
     * @return
     */
    public static Map getCycleBeginAndEndDateByDate(String sReferenceDate) {
        Map result = new HashMap();
        String sCycleEndDate;
        String sCycleBeginDate;
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate refDate = LocalDate.parse(sReferenceDate,DateTimeFormatter.BASIC_ISO_DATE);

        DateTimeFormatter formatters1 = DateTimeFormatter.ofPattern("yyyyMMdd");
        sCycleEndDate = refDate.with(TemporalAdjusters.lastDayOfMonth()).format(DateTimeFormatter.BASIC_ISO_DATE);
        sCycleBeginDate = refDate.with(TemporalAdjusters.firstDayOfMonth()).format(DateTimeFormatter.BASIC_ISO_DATE);
        result.put("beginDate",sCycleBeginDate);
        result.put("endDate",sCycleEndDate);
        return result;
    }

    /**
     * Math 月份取模
     * @param date
     */
    public static void getMonthMod(String date) {
        System.out.println("--------------------------");
//        System.setProperty("12", "12");
//        System.out.println(System.getProperty("12"));
//        System.out.println(Integer.getInteger("12"));
        System.out.println(Math.floorMod(Long.parseLong(date), 7));
    }

}
