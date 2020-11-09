package 字符串.Q1108_IP地址无效化;

public class Q1108_IP地址无效化 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
