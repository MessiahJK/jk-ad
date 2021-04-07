package us.betahouse.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;
import us.betahouse.ad.exception.AdException;

import java.util.Date;

public class CommonUtils {

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy/MM/dd", "yyyy.MM.dd"
    };

    public static String md5(String value) {

        return DigestUtils.md5Hex(value).toUpperCase();
    }

    public static Date parseStringDate(String dateString)
            throws AdException {

        try {
            return DateUtils.parseDate(
                    dateString, parsePatterns
            );
        } catch (Exception ex) {
            throw new AdException(ex.getMessage());
        }
    }
}
