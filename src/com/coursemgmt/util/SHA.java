package com.coursemgmt.util; 

/*import com.google.common.base.Strings;  */
  
import java.security.MessageDigest;  
  
/** 
 * Created by xiang.li on 2015/2/11. 
 */  
public class SHA {  
    /** 
     * ������ܷ�ʽ 
     */  
    private final static String KEY_SHA = "SHA";  
    private final static String KEY_SHA1 = "SHA-1";  
    /** 
     * ȫ������ 
     */  
    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",  
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };  
  
    /** 
     * ���캯�� 
     */  
    public SHA() {  
  
    }  
  
    /** 
     * SHA ���� 
     * @param data ��Ҫ���ܵ��ֽ����� 
     * @return ����֮����ֽ����� 
     * @throws Exception 
     */  
    public static byte[] encryptSHA(byte[] data) throws Exception {  
        // ��������ָ���㷨���Ƶ���ϢժҪ  
//        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);  
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA1);  
        // ʹ��ָ�����ֽ������ժҪ����������  
        sha.update(data);  
        // ���ժҪ���㲢����  
        return sha.digest();  
    }  
  
    /** 
     * SHA ���� 
     * @param data ��Ҫ���ܵ��ַ��� 
     * @return ����֮����ַ��� 
     * @throws Exception 
     */  
    public static String encryptSHA(String data) throws Exception {  
        // ��֤������ַ���  
        /*if (Strings.isNullOrEmpty(data)) {  
            return "";  
        }  */
        if (data==null||data=="") {  
            return "";  
        }  
        // ��������ָ���㷨���Ƶ���ϢժҪ  
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);  
        // ʹ��ָ�����ֽ������ժҪ����������  
        sha.update(data.getBytes());  
        // ���ժҪ����  
        byte[] bytes = sha.digest();  
        // ���õ����ֽ��������ַ�������  
        return byteArrayToHexString(bytes);  
    }  
  
    /** 
     * ��һ���ֽ�ת����ʮ��������ʽ���ַ��� 
     * @param b �ֽ����� 
     * @return �ַ��� 
     */  
    private static String byteToHexString(byte b) {  
        int ret = b;  
        //System.out.println("ret = " + ret);  
        if (ret < 0) {  
            ret += 256;  
        }  
        int m = ret / 16;  
        int n = ret % 16;  
        return hexDigits[m] + hexDigits[n];  
    }  
  
    /** 
     * ת���ֽ�����Ϊʮ�������ַ��� 
     * @param bytes �ֽ����� 
     * @return ʮ�������ַ��� 
     */  
    private static String byteArrayToHexString(byte[] bytes) {  
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < bytes.length; i++) {  
            sb.append(byteToHexString(bytes[i]));  
        }  
        return sb.toString();  
    }  
  
    /** 
     * ���Է��� 
     * @param args 
     */  
    public static void main(String[] args) throws Exception {  
        String key = "123";  
        System.out.println(encryptSHA(key));  
    }  
}
