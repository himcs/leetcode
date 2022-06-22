package io.github.himcs.lc.字符串.Q929_独特的电子邮件地址;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> validateEmails = new HashSet<>();

        for (String email : emails) {
            validateEmails.add(completeEmail(email));
        }
        return validateEmails.size();
    }

    private String completeEmail(String email) {
        // find last @
        int atPos = email.lastIndexOf('@');
        if (atPos == -1 || atPos == email.length() - 1) {
            return email;
        }
        String remoteDomain = email.substring(atPos);
        String localDomain = email.substring(0, atPos);
        localDomain = localDomain.replace(".", "");
        int plusPos = localDomain.indexOf("+");
        if (plusPos == -1) {
            return localDomain + "@" + remoteDomain;
        } else {
            return localDomain.substring(0, plusPos) + "@" + remoteDomain;
        }
    }
}
